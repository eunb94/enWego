var userjoin_vue = userjoin_vue||{}
userjoin_vue ={
	userjoin_body:()=>{
		return `<div id="host-container">
	<div style="solid black;">
		<div>
			<div id="host-header">
				<h1 align="center">일반 회원 가입</h1>
			</div>
			<form name="registerform">

				<div class="form-group row">
					<label for="userName" class="col-sm-2 form-control-label">아이디입력</label>
					<div class="col-sm-5">
						<input id="uid" type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
				</div>

				<div class="form-group row">
					<label for="pwd" class="col-sm-2 form-control-label">패스워드입력</label>
					<div class="col-sm-5">
						<input id="pwd" type="password" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
				</div>

				<div class="form-group row">
					<label for="userName" class="col-sm-2 form-control-label">이름입력</label>
					<div class="col-sm-5">
						<input id="uname" type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
				</div>
				<div class="form-group row">
					<label for="userNickname" class="col-sm-2 form-control-label">닉네임입력</label>
					<div class="col-sm-5">
						<input id="nickname" type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
				</div>

				<div class="form-group row">
					<label for="userName" class="col-sm-2 form-control-label">생년월일</label>
					<div class="col-sm-5">
						<input id="birth" type="text" class="form-control" name="userName" maxlength="20" autocomplete="off"
							value="">
					</div>
				</div>

				<div class="form-group row">
					<label for="phone" class="col-sm-2 form-control-label">전화번호</label>
					<input type="hidden" class="form-control" name="hosttel" value="">
					<div class="col-sm-6 input-group" id="phoneIpt">
						<input id="tel1" type="text" class="form-control" id="userPhone1" value="">
						<span class="input-group-addon">-</span>
						<input id="tel2" type="text" class="form-control" id="userPhone2" value="">
						<span class="input-group-addon">-</span>
						<input id="tel3" type="text" class="form-control" id="userPhone3" value="">
					</div>
				</div>

				<div class="form-group row">
					<label id="companytype" for="userName" class="col-sm-2 form-control-label">반려동물 선택</label>
					<div class="col-sm-5">
						<input id="pettype1" type="radio" name="pettype" value="대형견" alt="업체종류">대형견
						<input id="pettype2" type="radio" name="pettype" value="소형견" alt="업체종류">소형견
						<input id="pettype3" type="radio" name="pettype" value="고양이" alt="업체종류">고양이
						<input id="pettype4" type="radio" name="pettype" value="기타" alt="업체종류">기타
						<input id="pettype5" type="text" placeholder="직접입력">
					</div>
				</div>
        
				<div class="btnfield" style="text-align: center">
					<input id="userjoin_btn" type="submit" value="회원가입">
				</div>
			</form>
		</div>
	</div>
</div>`
	}
}