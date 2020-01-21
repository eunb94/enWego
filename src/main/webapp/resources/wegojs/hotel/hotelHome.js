"use strict"
var hotelHome = hotelHome || {}
hotelHome = (()=>{
	const WHEN_ERR = '호출하는 hotelHome js를 찾을 수 없습니다 .'
	let context, js, routerjs, hotelMainVuejs, mainVuejs,hotelDetailjs;
	let init =()=>{
		context = $.ctx()
		js = $.js()
        routerjs = js+'/cmm/router.js'
      	mainVuejs = js+'/vue/mainVue.js'
      	hotelMainVuejs = js+'/hotel/hVue/hotelMainVue.js'
      	hotelDetailjs = js+'/hotel/hotelDetail.js'
	}
	let onCreate=()=>{
		init();
		$.when(
			$.getScript(mainVuejs),
			$.getScript(routerjs),
			$.getScript(hotelDetailjs)
		).done(()=>{
			alert('hotelMain 성공')
			setContentView()
			hotelTableCreate()
			hotelDetailgo()
			
		}).fail(()=>{
			alert(WHEN_ERR)
		})
	}
	let setContentView=()=>{
		alert('호텔메인 제발제발')
        let x = {css:$.css(),img:$.img()}
		
		$('#mainbody').html(hotelMainVue.hmain_body())
		 $('html').scrollTop(0);
		
        		
	}
    let hotelDetailgo=()=>{
    	$('#hotelDetail').click(e=>{
    		e.preventDefault()
    		hotelDetail.onCreate()
    	})
	}
	
	let hotelTableCreate=()=>{
		$('#tablebtn').click(e=>{
			e.preventDefault()
			alert("hoteltable성공:")
			/*       $.getJSON(context+'/hotels/create/hoteltable/',d=>{
				alert("hoteltable성공:"+d.msg)
				//hotel table 생성
			}) */
			/*   $.getJSON(context+'/hotels/insert/hotelDB/',d=>{
				alert("성공:"+d.msg)
				//hotel db 생성
			})    */
			/*        $.getJSON(context+'/hotels/create/roomtable/',d=>{
				alert("hoteltable성공:"+d.msg)
				//room table 생성
			}) */ 
			    $.getJSON(context+'/hotels/insert/roomdb/',d=>{
				alert("성공:"+d.msg)
				
			})
		})
	}

	return{onCreate}
		
})();
