<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>specificlist</title>
</head>
<body>
<br><br><br>
<center>

<h1>상세분류를 선택하세요.</h1>

<table>
<tr>
<c:forEach items="${sessionScope.specifics}" var="data">
	<c:choose>
		<c:when test="${data.cid.cid eq 'c_1'}">
		<td>
		<h3>${data.sname}</h3>
		<a href="total?command=getRestaurants&sname=${data.sname}"><img src="https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_South_Korea.svg" width="300" height="200"></a>
		</td>
		</c:when>
		<%-- 
		<<c:when test="${data.cid.cid eq 'c_2'}">
		<td>
		<h3>${data.sname}</h3>
		<a href="total?command=getRestaurants&sname=${data.sname}"><img src="https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_South_Korea.svg" width="300" height="200"></a>
		</td>
		</c:when>
		
		<c:when test="${data.cid.cid eq 'c_3'}">
		<td>
		<h3>${data.sname}</h3>
		<a href="total?command=getRestaurants&sname=${data.sname}"><img src="https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_South_Korea.svg" width="300" height="200"></a>
		</td>
		</c:when>
		
		<c:when test="${data.cid.cid eq 'c_4'}">
		<td>
		<h3>${data.sname}</h3>
		<a href="total?command=getRestaurants&sname=${data.sname}"><img src="https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_South_Korea.svg" width="300" height="200"></a>
		</td>
		</c:when>
		 --%>
		<c:otherwise>
		aldskfj
		</c:otherwise>
	</c:choose>
	</c:forEach>
</tr>
</table>

<br><br><br>


</center>
</body>
</html>
