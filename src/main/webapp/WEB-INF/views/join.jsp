<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta name = "vieport"
	content="width=device-width,initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>



</head>

<script>
	$(function() {
		$("#btn_join").click(function(){
			let b_userid = $("#b_userid").val()
			let b_password = $("#b_password").val()
			let b_re_password = $("#b_re_password").val()
			if(b_userid == "") {
				alert("아이디를 반드시 입력하세요")
				$("#m_userid").focus();
				return false;
			}
			
			if(b_password == "") {
				alert("패스워드를 입력하세요")
				$("#b_password").focus();
				return false;
			}
			
			if(b_re_password == "") {
				alert("비밀번호확인을 입력하세요")
				$("#b_re_password").focus();
				return false;
			}
			
			if(b_password != b_re_password) {
				alert("비밀번호가 일치하지 않습니다.")
				$("#b_password").val("")
				$("#b_re_password").val("")
				$("#b_password").focus()
				
				return false;
			}
			
			$("form").submit()
		})
	})
</script>

<body>


	<form action="join" method="POST">
	<fieldset>
	<legend>회원가입</legend>
	
	<label>회원ID</label>
	
	<input type="text" id="b_userid" name="b_userid"><br/>
	<label>비밀번호</label>
	<input type="password" id="b_password" name="b_password"><br/>
	<label>비밀번호확인</label>
	<input type="password" id="b_re_password" name="b_re_password"><br/>
	<label>취미</label>
	<input type="text" id="b_hobby" name="b_hobby"><br/>
	
	<button id="btn_join">회원가입</button>
	</fieldset>
	</form>



</body>
</html>