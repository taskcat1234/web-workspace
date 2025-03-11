<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String brand = (String)request.getAttribute("brand");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요게 이제 굉장히 중요함</title>
</head>
<body>
 <%= brand %> <br/>
 ${ bestSeller } <br/>
 ${ brand }
 <ul>
 	<li> ${ bestSeller.brand } </li>
 	<li> ${ bestSeller.name } </li>
 	<li> ${ bestSeller.price } </li>
 </ul>
 <!--  
 	page => request => session => application 순으로 키값을 검색
 	
 -->
 Scope에 직접 접근하는 방법 ! <br/>
 
 requestScope : ${ requestScope.brand } <br/>
 sessionScope : ${ sessionScope.brand } <br/>
 
 만약에 없는 키값 el구문으로 출력하려고하면 어떻게될까?? <br/> <br/>
 
 없는값1 : ${ sessionScope.el } <br/>
 없는값2 : ${ abc.el } <br/>
 
 <hr/>
 
 연산은 어디서 하는게 제일 좋음?
 1. SQL문 DB단  <br/>
 2. Java => Service단(validation/transaction) <br/>
 3. view <br/>
 
 <hr/>
 
 <h3>1. 산술연산 </h3>
 <p>
 	* EL 구문을 이용한 산술 연산 <br/>
 	big + small = ${ big + small } <br/>
 	big - small = ${ big - small } <br/>
 	big x small = ${ big * small } <br/>
 	big / small = ${ big / small } 또는 ${ big div small} <br/>
 	big % small = ${ big % small } 또는 ${ big mod small} <br/>
 	BigDecimal bd; , { big div small} 연산을 권장<br/>
 </p>
 <h3>2. 논리연산 </h3>
 
 <p>
 	AND : ${true && true} 또는 ${true and true} <br>
 	OR  : ${true || true} 또는 ${true or true} <br>
 </p>
 
 <h3>숫자끼리 비교 </h3>
 
 <p>
 	big이 small보다 작니? : ${ big < small } 또는 ${ big lt small } <br>
 	big이 small보다 크니? : ${ big gt small } <br>
 	big이 small보다 작거나 같니? : ${ big le small } <br>
 	big이 small보다 크거나 같니? : ${ big ge small } <br>
 	
 </p>
 
 <h4>동등비교도 해볼까? </h4>
 
 <p>
 	big이 small과 같습니까? ${ big == small } 또는 ${ big eq small } <br>
 	big이 10과 같습니까? ${ big eq 10 } <br>
 	str이 좋아하는문구 일치합니까? ${ str == "좋아하는문구" } 또는 ${ str eq "좋아하는문구" }<br>
 	big이 10과 일치하지 않습니까? ${ big ne 10 } 또는 ${ big != 10 }
 </p>
 
 <h4>비어있는지 체크 </h4>
 
 <p>
 	bestSeller가 null과 일치합니까? <br>
 	${ bestSeller == null } 또는 ${ bestSeller eq null } 또는 ${ empty bestSeller} <br>
 	
 	list가 비어있지 않습니가? <br>
 	${ !empty list }
 	
 	
 	
 	
 	
 </p>
 
 
 
 
 
 
 
 
 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>