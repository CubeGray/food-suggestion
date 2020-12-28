<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<center>

<h3>식당 정보 수정하기 - 식당 위치 수정</h3>
<hr><p>

<form action="total?command=restaurantUpdate" method="post">
<table border="1">
	<thead>
		<tr>
			<th>rid</th><th>rname</th><th>maplink</th><th>pagelink</th>
		</tr>
 	<tr>
 		<td><input type="text" name="rid"  value="${sessionScope.re.rid}" readonly></td>
 		<td>${sessionScope.re.rname}</td>
 		<td><input type="text" name="maplink" value="${sessionScope.re.maplink}"></td>
 		<td>${sessionScope.re.pagelink}</td>
 	</tr>
 	
 	<tr>
 		<td colspan="4">
 			<input type="submit" value="수정">
 			&nbsp;&nbsp;&nbsp;
 			<input type="reset" value="취소">
 		</td>
 	</tr>
</table>
</form>
</center>
</body>
</html>