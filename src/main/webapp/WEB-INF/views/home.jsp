<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>


</style>

<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>

	

	<section id=read_table>
		<table border="1">

			<tr>
				<th>사용자 ID</th>
				<th>도서코드</th>
				<th>도서제목</th>
				<th>독서일자</th>
				<th>별점</th>
			</tr>

			<c:choose>
				<c:when test="${empty BLIST}" >
					<tr>
						<td>거래처정보가 없습니다.</td>
						<td>거래처정보가 없습니다.</td>
						<td>거래처정보가 없습니다.</td>
						<td>거래처정보가 없습니다.</td>
						<td>거래처정보가 없습니다.</td>
					</tr>
				</c:when>

				<c:otherwise>
					<c:forEach var="bVO" items="${BLIST}" varStatus="i">
					<tr>
						<td>${bVO.b_userid}</td>
						<td>${bVO.b_isbn}</td>
						<td>${bVO.b_title}</td>
						<td>${bVO.b_date}</td>
						<td>${bVO.b_star}</td>
					</tr>
					</c:forEach>

				</c:otherwise>
			</c:choose>




		</table>
	</section>
	
	<footer>
		copyRight@ ljhljh671@naver.com
	</footer>

</body>
</html>