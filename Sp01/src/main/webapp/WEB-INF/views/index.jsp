<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!-- page지시어가 .jsp를 서블릿(.java)으로 만든다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<h1> Sp01 Index</h1>
	<p>
	<a href="/test">m01</a>
	<a href="/test/base1">m02</a>
	<a href="/test/base2">m03</a>
	<a href="/test/base2">m04</a>
	<a href="/test/form">form</a>
	</p>
	
	<p>
	<a href="test/param1?name=홍길동 &age=20">param01</a>
	<a href="test/param2?name=노찬욱 &age=26">param02</a>
	<a href="test/param3?names=노찬욱 &names=류슬기&names=이정현">param03</a>
	<a href="test/param4?ns=노찬욱 &ns=류슬기&ns=이정현">param04</a>
	<a href="test/param5?names=노찬욱 &names=류슬기&names=이정현">param05</a>
	</p>
	
	<p>
	<a href="test/param6?list%5B0%5D.name=홍길동 &list%5B0%5D.age=20&list%5B1%5D.name=노찬욱&list%5B1%5D.age=26&list%5B2%5D.name=이정현&list%5B2%5D.age=30">param06</a>
	</p>
	
	<a href="test/json1">json1</a>
	<a href="test/json2">json2</a>
	
	<h1> Sp02 Index</h1>
	<p>
		<a href="address/list.do">주소록</a>
	</p>
</body>
</html>
