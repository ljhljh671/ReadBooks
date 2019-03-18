<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta name = "viewport"
	content="width=device-width,initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	

<body>

<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
	
	<form action="write" method="POST">
	사용자 ID<input type="text" name="b_userid"><br/>
	도서코드<input type="text" name="b_isbn"><br/>
	도서제목<input type="text" name="b_title"><br/>
	독서일자<input type="date" name="b_date"><br/>
	별점<input type="text" name="b_star"><br/>
	한줄요약<input type="text" name="b_text" style="width: 1000px;"><br/>
	<button>저장</button>
	</form>
	

</body>
</html>