<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a{
		text-decoration : none;
		color : black;
	}
</style>
</head>
<body>
	<h1>* EL(Expression Language) 표현언어</h1>
	
	<p>
		기존 JSP상에 사용했던 &lt;%= %>같은 경우 사용이 복잡하고,<br/>
		컴파일 시 문제가 발생할 수 있기 때문에<br/>
		이 문제를 대체 할 수 있는 문법 <br/>
	</p>
	
	<h3>1. EL구문 기본 학습 </h3>
	<!--  
		절대 경로 방식 : /bm/sc
		상대 경로 방식 : sc
	-->
	<a href="/MDP/sc">절대 경로 방식</a> <br/>
	<a href="sc">상대 경로 방식</a>
	
</body>
</html>