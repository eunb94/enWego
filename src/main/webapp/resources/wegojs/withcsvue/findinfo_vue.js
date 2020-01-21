var findinfo_vue = findinfo_vue || {}
findinfo_vue = {
  findinfo_id: () => {
    return `<div id="host-container">
    <div>
    <form name="post">
    <div id="host-header">
				<h1 align="center">아이디찾기</h1>
			</div>
      <p><a href="/">홈으로</a></p>
<div class="form-group row">
					<label for="userName" class="col-sm-2 form-control-label">아이디입력</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
				</div>        
        <div class="form-group row">
					<label for="email" class="col-sm-2 form-control-label">이메일</label>
					<input type="hidden" class="form-control" name="userEmail" value="">
					<div class="col-sm-6 input-group" id="emailIpt">
						<input type="text" class="form-control" id="userEmail1" value="" >
						<span class="input-group-addon">@</span>
						<input type="text" class="form-control" id="userEmail2" value="" >
					</div>
			
      <select >
          <option value="직접입력">직접입력</option>
          <option value="naver.com">naver.com</option>
          <option value="daum.net">daum.net</option>
          <option value="gmail.com">gmail.com</option>
          <option value="yahoo.co.kr">yahoo.co.kr</option>
        </select>
        	</div>
      <div class="form-group row">
					<label for="phone" class="col-sm-2 form-control-label">전화번호</label>
					<input type="hidden" class="form-control" name="hosttel" value="">
					<div class="col-sm-6 input-group" id="phoneIpt">
						<input type="text" class="form-control" id="userPhone1" value="">
						<span class="input-group-addon">-</span>
						<input type="text" class="form-control" id="userPhone2" value="">
						<span class="input-group-addon">-</span>
						<input type="text" class="form-control" id="userPhone3" value="">
					</div>
				</div>
      <div style="text-align: center">
          <input id="findid_btn" type="submit" value="아이디 찾기" />
          </div>
    </form>
  </div>
</div></div>`
  },
  findinfo_pwd: () => {
    return `<div id="host-container">
    <div class="find">
    <form method="post">
      <div id="host-header">
				<h1 align="center">비밀번호찾기</h1>
      </div>
      <div class="form-group row">
					<label for="userName" class="col-sm-2 form-control-label">아이디입력</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
       
          </div>
        <div class="form-group row">
					<label for="email" class="col-sm-2 form-control-label">이메일</label>
					<input type="hidden" class="form-control" name="userEmail" value="">
					<div class="col-sm-6 input-group" id="emailIpt">
						<input type="text" class="form-control" id="userEmail1" value="" >
						<span class="input-group-addon">@</span>
						<input type="text" class="form-control" id="userEmail2" value="" >
					</div>
			
      <select >
          <option value="직접입력">직접입력</option>
          <option value="naver.com">naver.com</option>
          <option value="daum.net">daum.net</option>
          <option value="gmail.com">gmail.com</option>
          <option value="yahoo.co.kr">yahoo.co.kr</option>
        </select>
          </div>
          <div style="text-align: center">
          <input id="findpwd_btn" type="submit" value="비밀번호 찾기" />
          </div>
    </form>
  </div></div>`
  }

}