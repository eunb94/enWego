"use strict"
var login = login ||{}
login=(()=>{
	const WHEN_ERR = '호출하는 login 페이지가 없음'
	let context, js;
    let mainVuejs;
	let loginvuejs;
	let mainHomejs
    let init = () => {
        context = $.ctx()
		js = $.js()
		loginvuejs = js + '/withcsvue/login_vue.js'
		mainVuejs = js +'/vue/mainVue.js'
		mainHomejs = js + '/cmm/mainHome.js'
	}
	let onCreate=()=>{
		init()
		$.when(
			$.getScript(mainVuejs),
			$.getScript(loginvuejs),
			$.getScript(mainHomejs)
		).done(()=>{
			setContentView()
			gofind()
			login()
		}).fail(()=>{
			alert(WHEN_ERR)
		})
	}
	let setContentView=x=>{
			$('#mainbody').html(login_vue.login_body())
		
	}
	let gofind=()=>{
		let x ='';
		$('#findid_btn').click(()=>{
				alert('아이디찾기클릭')
				x = 'id'
                findinfo.onCreate(x)
			})
		$('#findpwd_btn').click(()=>{
				alert('비밀번호찾기클릭')
				x = 'pw'
                findinfo.onCreate(x)
            })	
	}
	let login=()=>{

		let x = ""

		$('#userlogin_btn').click(()=>{
			alert(`클릭`)
			$.ajax({
		          url : context+'/user/'+$('#uid').val(),
		          type : 'POST',
		          data : JSON.stringify({uid : $('#uid').val(), pwd : $('#pwd').val()}),
		          dataType : 'json',
		          contentType : 'application/json',
		          success: d =>{
					alert('로그인성공')
					mainHome.onCreate()
				},
		          error : e => {
			    	alert('Loign AJAX 실패');
		          }
			})
		})
			$('#hostlogin_btn1').click(()=>{
				$('#mainbody').html(login_vue.hostlogin_body())
				$('#hostlogin_btn').click(()=>{
			alert(`호스트로그인클릭`)
			$.ajax({
		          url : context+'/host/'+$('#hid').val(),
		          type : 'POST',
		          data : JSON.stringify({hid : $('#hid').val(), pwd : $('#pwd').val()}),
		          dataType : 'json',
		          contentType : 'application/json',
		          success: d =>{
					alert('로그인성공')
					mainHome.onCreate()
				},
		          error : e => {
			    	alert('Loign AJAX 실패');
		          }
			})
		})
		})
	}
	return{onCreate}
})()
