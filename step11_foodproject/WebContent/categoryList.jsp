<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>categorylist</title>
</head>
<body>
<br><br><br>
<center>

<h1>카테고리를 선택하세요.</h1>

<table border="1">
<tr>
<td>
<h3>1. 한식</h3>
<a href="total?command=getSpecifics&cname=한식"><img src="https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_South_Korea.svg" width="300" height="200"></a>
</td>

<td>
<h3>2. 양식</h3>
<a href="total?command=getSpecifics&cname=양식"><img src="https://upload.wikimedia.org/wikipedia/commons/0/03/Flag_of_Italy.svg" width="300" height="200"></a>
</td>
</tr>

<tr>
<td>
<h3>3. 중식</h3>
<a href="total?command=getSpecifics&cname=중식"><img src="https://w.namu.la/s/2cc799c5b206cc20758ffae39961b5c642a12acec4c1d878b4f0055ec72444ef1dc66c996a5a23cc4d6c37263ae40b58913f8f78cb610ceac9a68c031faa23d345a4ec1bb6f80b69d348555173d6802b260cb7bef88c0a69753ae6b20ab3a0f4" width="300" height="200"></a>
</td>
<td>
<h3>4. 일식</h3>
<a href="total?command=getSpecifics&cname=일식"><img src="https://upload.wikimedia.org/wikipedia/commons/9/9e/Flag_of_Japan.svg" width="300" height="200"></a>
</td>
</tr>
</table>
<br><br><br>


</center>
</body>
</html>
