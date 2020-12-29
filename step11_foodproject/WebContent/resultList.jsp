<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>음식점 추천 결과 화면</title>
</head>
<body>
<br><br><br>
<center>
<h3>restaurant 추천 결과 두둥!</h3>
<hr><p>
<table border="1">
	<tr>
		<th>No</th>
		<th>Name</th>
		<th>Map</th>
		<th>Restaurant Info</th>
	</tr>

	<%-- <c:forEach begin="10" end="20" step="2" var="data" varStatus="status"> --%>
	<c:forEach var="data" items="${sessionScope.restaurants}" varStatus = "status"> 
		<tr>
		<td>${status.count}</td>
		<td>${data.rname}</td>
		<td><a href="${data.maplink}">지도보기</a></td>
		<td><a href="${data.pagelink}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;상세정보</a></td>		
		</tr>
	</c:forEach>
	
</table>
<br><br><br>

&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index.html">메인 화면 이동</a>


<br><br><br>
<font color="blue">Map과 Page 버튼을 클릭하시면 각 음식점의 지도와 상세정보를 보실 수 있습니다. </font>
</center>
</body>
</html>