<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8">

  <title>웹개발 시작하기</title>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

  <!-- Custom fonts for this template -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
  <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

  <!-- Custom styles for this template -->
  <link href="resources/css/agency.min.css" rel="stylesheet">
  <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
  
  <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
  <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>

<style>
    #mainNav .navbar-nav .nav-item .nav-link {
        font-weight: 600;
    }

    #sub-bg{
        width : 80%;
        margin : auto;
        height : 1200px;
        padding-top : 60px;
        padding-bottom : 60px;
        margin-top : 300px;
    }

    #sub-1{
        width : 70%;
        height : 40%;
        margin-right : auto;
        background-image: url(https://www.kh-academy.co.kr/resources/images/main/main_renewal/sub/sub02/educationinfo/jongro/04.jpg);
        background-size: cover;
        background-repeat: none;
    }

    #sub-2{
        margin-top : 120px;
        width : 70%;
        margin-left : auto;
        height : 40%;
        background-image: url(https://www.kh-academy.co.kr/resources/images/main/main_renewal/sub/sub02/educationinfo/jongro/05.jpg);
        background-size: cover;
        background-repeat: none;
    }

    footer{
        border-top: #52b1ff28 1px solid;
    }

    .dropdown:hover > .dropdown-menu { 
        display: block;  
    }
</style>


</head>

<body id="page-top">

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand" href="#">
      	<img class="img-fluid" src="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" alt="로고없음" style="width:130px; height:50px;" />
      </a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive">
        메뉴
        <i class="fas fa-bars"></i>
      </button>
      
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav text-uppercase ml-auto">
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#">HOME</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#">공지사항</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#">게시판</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#">사진게시판</a>
          </li>
          
          <c:choose>
          	<c:when test="${ empty loginMember}">
          	  <li class="nav-item">
          	  	<a class="nav-link js-scroll-trigger" data-toggle="modal" data-target="#log-in">로그인</a>
		      </li>
		      <li class="nav-item">
		      	<a class="nav-link js-scroll-trigger" href="join">회원가입</a>
		      </li>
         	</c:when>
		  	<c:otherwise>
	          <li class="nav-item">
	          	<a class="nav-link js-scroll-trigger" href="myPage">내정보</a>
	          </li>
	          <li class="nav-item">
	          	<a class="nav-link js-scroll-trigger" href="logout" onclick="return confirm('진짜로 로그아웃 하려고?')">로그아웃</a>
	          </li>
          	</c:otherwise>
          </c:choose>
          
        </ul>
      </div>
    </div>
  </nav><br><br><br>
  
  

  <!-- 로그인 Modal-->
<div class="modal fade" id="log-in">
	<div class="modal-dialog">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header">
				<h4 class="modal-title">
					<span style="color: #52b1ff;">KH</span> 로그인
				</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<!-- Modal body -->
			<div class="modal-body">

				<form action="/mfw/sign-in" name="sign-in" method="post" id="signInForm"
					style="margin-bottom: 0;">
					<table style="cellpadding: 0; cellspacing: 0; margin: 0 auto; width: 100%">
						<tr>
							<td style="text-align: left">
								<p><strong>아이디를 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="idCheck"></span></p>
							</td>
						</tr>
						<tr>
							<td><input type="text" name="memberId" id="signInId"
								class="form-control tooltipstered" maxlength="10"
								required="required" aria-required="true"
								style="margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de"
								placeholder="최대 15자"></td>
						</tr>
						<tr>
							<td style="text-align: left">
								<p><strong>비밀번호를 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="pwCheck"></span></p>
							</td>
						</tr>
						<tr>
							<td><input type="password" size="17" maxlength="20" id="signInPw"
								name="memberPw" class="form-control tooltipstered" 
								required="required" aria-required="true"
								style="ime-mode: inactive; margin-bottom: 25px; height: 40px; border: 1px solid #d9d9de"
								placeholder="최소 8자"></td>
						</tr>
						<tr>
							<td style="padding-top: 10px; text-align: center">
								<p><strong>로그인하셔서 서비스를 이용해보세요~~!</strong></p>
							</td>
						</tr>
						<tr>
							<td style="width: 100%; text-align: center; colspan: 2;"><input
								type="submit" value="로그인" class="btn form-control tooltipstered" id="signIn-btn"
								style="background-color: #52b1ff; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</div>


</body>
</html>