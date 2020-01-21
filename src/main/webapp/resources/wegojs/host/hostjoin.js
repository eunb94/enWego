"use strict"
var hostjoin = hostjoin ||{}
hostjoin=(()=>{
	const WHEN_ERR = '호출하는 host joinchoice 페이지가 없음'
	let context, js;
	let mainVuejs;
	let hostjoinvuejs
	let mainHomejs
	let loginjs
	let init = () => {
        context = $.ctx()
		js = $.js()
		hostjoinvuejs = js + '/hostvue/hostjoin_vue.js'
		mainVuejs = js +'/vue/mainVue.js'
		mainHomejs = js + '/cmm/mainHome.js'
		loginjs =js+'/withcs/login.js'
	}
	let onCreate=()=>{
		init()
		$.when(
			$.getScript(mainVuejs),
			$.getScript(hostjoinvuejs),
			$.getScript(mainHomejs),
			$.getScript(loginjs)
		).done(()=>{
			setContentView()
			gohostjoin()
			addr()
		}).fail(()=>{
			alert(WHEN_ERR)
		})
	}
	let setContentView=()=>{
		$(`#mainbody`).html(hostjoin_vue.hostjoin_body())
		/* $('#hid').keyup(()=>{
	        	if($('#hid').val().length>1){
	        		$.ajax({
	        	          url : _+'/host/'+$('#hid').val()+'/exist/',
	        	          contentType : 'application/json',
	        	          success : d =>{
	        	            if(d.msg === 'SUCCESS')
	        	            	$('#dupl_check')
	        	            	.val('사용가능한 ID 입니다')
	        	            	.css('color','green')
	        	            else
	        	            	$('#dupl_check')
	        	            	.val('사용중인 ID 입니다')
	        	            	.css('color','red')
	        	          },
	        	        })
	        	}
	        }); */
	}

	
	let gohostjoin=()=>{
		$('#hostjoin_btn').click(()=>{ 
		

		let data = {hid:$(`#hid`).val(),pwd:$(`#pwd`).val(),hname:$(`#hname`).val(),ceoname:$(`#ceoname`).val()
					,companytype:($(`input[name="hosttype"]:checked`).val()+$(`#companytype5`).val()),
					tel:($(`#tel1`).val()+$(`#tel2`).val()+$(`#tel3`).val())
					,addr:($(`#sample6_address`).val()+$(`#sample6_detailAddress`).val())
					,licensenum:$(`#licensenum`).val(),hostinfo:$(`#hostinfo`).val()}
		
			$.ajax({
	    	url : context+'/host/',
	    	type : 'POST',
	    	dataType : 'json',
	    	data : JSON.stringify(data),
	    	contentType : 'application/json',
	    	success : d => {
	    		alert('AJAX 성공 아이디: '+d.msg)
	    			if(d.msg === 'SUCCESS'){
	    				login.onCreate()
	    			}else
	    				alert('회원가입 실패')
	    	},
	    	error : e => {
	    		alert('AJAX 실패');
	    	}
		})
		

		/* 중복체크
		$('#hid').keyup(()=>{
	        	if($('#hid').val().length>1){
	        		$.ajax({
	        	          url : _+'/host/'+$('#hid').val()+'/exist/',
	        	          contentType : 'application/json',
	        	          success : d =>{
	        	            if(d.msg === 'SUCCESS')
	        	            	$('#dupl_check')
	        	            	.val('사용가능한 ID 입니다')
	        	            	.css('color','green')
	        	            else
	        	            	$('#dupl_check')
	        	            	.val('사용중인 ID 입니다')
	        	            	.css('color','red')
	        	          },
	        	        })
	        	}
	        });*/

			})
		
	}


	let addr=()=>{
		$(`#addr_btn`).click(()=>{
			new daum.Postcode({
            oncomplete: function(data) {
                var addr = ''; 
                var extraAddr = '';
                if (data.userSelectedType === 'R') {
                    addr = data.roadAddress;
                } else {
                    addr = data.jibunAddress;
                }
                if(data.userSelectedType === 'R'){
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
		})

	}
	return{onCreate}
})()
