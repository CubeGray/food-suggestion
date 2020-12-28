<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<center>
<body>
<br><br><br>

<h3>식당 정보</h3>
<hr><p>

<form action="total?command=restaurantInsert" method="post">                                 
	<input type="hidden" name="command" value="restaurantInsert">
	<table border="1">
		<tr>
			<td>rid</td><td><input type="text" name="rid"></td>
		</tr>
		<tr>
	 		<td>rname</td><td><input type="text" name="rname"></td>
		</tr>
		<tr>	
			<td>sname</td><td><input type="text" name="sname"></td>
	 	</tr>
	 	<tr>
	 		<td>maplink</td><td><input type="text" name="maplink"></td>
	 	</tr>
	 	<tr>
	 		<td>pagelink</td><td><input type="text" name="pagelink"></td>
	 	</tr>
	 	<tr>

	 		<td colspan="5"><input type="submit" value="저장">&nbsp;&nbsp;&nbsp;<input type="reset" value="취소"></td>
	 	</tr>
	</table>
</form>
<br><br><br>
<a href="total?command=restaurantgetAll">모든 음식점 보기</a>

</center>
</body>
</html>