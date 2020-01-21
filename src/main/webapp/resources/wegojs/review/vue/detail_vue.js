var detail_vue = detail_vue || {}
detail_vue = {
	detail:j=>{return `<div style="display: block; padding-top:20px; padding-right: 17px; width: 70%; text-align: center; border: solid #d4d4d4;">
                  <h2 class="text-uppercase">${j.title}</h2>
              <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
              <img class="img-fluid d-block mx-auto" src=${j.img} alt="">
              <p>${j.content}</p>   
              <div class="likelike" >
                <button id = "likebtn" style ="height:60px; width:60px; background : none; border: none; float : right;">
                <img src = "/web/resources/wegoimg/reviewimg/beforeheart.png"></button>
              </div>     
              <div style=" padding-left: 10px;">
                <input id ="writecomment" type="text" style="width:100%" />
                <a id = "commentbtn"href="#" class="genric-btn primary small" style="width:100%">댓글달기</a>
              </div>
              <div style="text-align: initial; padding-left: 15px; padding-top: 9px; padding-bottom: 10px;">
                <li id = "commentspace">${j.comments}</li>
              </div>                
              </div>`



	}
}