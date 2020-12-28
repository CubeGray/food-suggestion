<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>모든 음식점 리스트(관리자 version)</title>
</head>
<body>
<br><br><br>
<center>
<h3>모든 restaurant 리스트</h3>
<hr><p>
<table border="1">
	<tr>
		<th>No</th>
		<th>Name</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	
	<%-- <c:forEach begin="10" end="20" step="2" var="data" varStatus="status"> --%>
	<c:forEach var="data" items="${sessionScope.restaurantAll}" varStatus = "status">
		<tr>
		<td>${status.count}</td>
		<td>${data.rname}</td>
		<td><button onclick = "location.href='total?command=restaurantUpdateReq&rid=${data.rid}'">수정하기</button></td>
		<td><button onclick = "location.href='total?command=restaurantDelete&rid=${data.rid}'">탈퇴하기</button></td>
		
		</tr>
	</c:forEach>
	
</table>
<br><br><br>
<a href="restaurantInsert.jsp">음식점 추가</a>

&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index.html">메인 화면 이동</a>


<br><br><br>
</center>
</body>
</html>