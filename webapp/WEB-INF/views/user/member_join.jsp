<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>비트닷컴 쇼핑몰</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link href="/assets/css/font.css" rel="stylesheet" type="text/css">
</head>
<body style="margin:0">
<center>
<jsp:include page="/WEB-INF/views/include/head.jsp"/>
<jsp:include page="/WEB-INF/views/include/search.jsp"/>
<table width="959" border="0" cellspacing="0" cellpadding="0" align="center">
	<tr><td height="10" colspan="2"></td></tr>
	<tr>
		<td height="100%" valign="top">
			<jsp:include page="/WEB-INF/views/include/navigation.jsp"/>
		</td>
		<td width="10"></td>
		<td valign="top">

		<!-------------------------------------------------------------------------------------------->	
		<!-- 시작 : 다른 웹페이지 삽입할 부분                                                                                                                                                            -->
		<!-------------------------------------------------------------------------------------------->	

			<table border="0" cellpadding="0" cellspacing="0" width="747">
				<tr><td height="13"></td></tr>
				<tr>
					<td height="30" align="center">
						<img src="/assets/images/login_title.gif" width="747" height="30" border="0">
					</td>
				</tr>
				<tr><td height="13"></td></tr>
			</table>
			<table border="0" cellpadding="0" cellspacing="0" width="685" class="cmfont">
				<tr>
					<td><img src="/assets/images/login_title2.gif" border="0"></td>
				</tr>
				<tr><td height="10"></td></tr>
			</table>

			<form name="form2" method="post" action="member_joinend">
			<table border="0" cellpadding="5" cellspacing="1" width="685" bgcolor="cccccc">
				<tr>
					<td align="center" bgcolor="efefef">
						<table border="0" cellpadding="0" cellspacing="5" width="100%" bgcolor="white">
							<tr>
								<td align="center">
									<table border="0" cellpadding="0" cellspacing="0" width="635" class="cmfont">
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>아이디</b></font>
											</td>
											<td>
												<input type="text" name="id" maxlength = "12" value="wzm2" size="20" class="cmfont1"> 
												<a href="javascript:check_id();"><img align="absmiddle" src="/assets/images/b_idcheck.gif" border="0"></a>
											</td>
										</tr>
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>비밀번호</b></font>
											</td>
											<td>
												<input TYPE="password" name="password1" maxlength = "10" size="20" class="cmfont1">
											</td>
										</tr>
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>비밀번호 확인</b></font>
											</td>
											<td>
												<input TYPE="password" name="password2" maxlength = "10" size="20" class="cmfont1">
											</td>
										</tr>
										<tr><td colspan="2" height="10"></td></tr>
										<tr><td colspan="2" bgcolor="E6DDD5"></td></tr>
										<tr><td colspan="2" height="10"></td></tr>
									</table>
									<table border="0" cellpadding="0" cellspacing="0" width="635" class="cmfont">
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>이 름</b></font>
											</td>
											<td>
												<input type="text" name="name" maxlength = "10" value = "나정민" size="20" class="cmfont1">
											</td>
										</tr>
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>생년월일</b></font>
											</td>
											<td>
												<input type="text" name='birthday1' size = "4" maxlength = "4" value = "1987" class="cmfont1"> <font color="898989">년</font> 
												<input type="text" name='birthday2' size = "2" maxlength = "2" value = "12" class="cmfont1"> <font color="898989">월</font> 
												<input type="text" name='birthday3' size = "2" maxlength = "2" value = "22" class="cmfont1"> <font color="898989">일</font> 
												<!-- <input type="radio" name='sm' value = "1" checked> <font color="898989">양력</font> 
												<input type="radio" name='sm' value = "2" > <font color="898989">음력</font></td> -->
										</tr>
										<tr><td colspan="2" height="10"></td></tr>
										<tr><td colspan="2" bgcolor="E6DDD5"></td></tr>
										<tr><td colspan="2" height="10"></td></tr>
									</table>
									<table border="0" cellpadding="0" cellspacing="0" width="635" class="cmfont">
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>전화 번호</b></font>
											</td>
											<td>
												<input type="text" name='tel1' size = "4" maxlength = "4" value = "010" class="cmfont1"><font color="898989">-</font>
												<input type="text" name='tel2' size = "4" maxlength = "4" value = "2571" class="cmfont1"><font color="898989">-</font>
												<input type="text" name='tel3' size = "4" maxlength = "4" value = "5528" class="cmfont1">
											</td>
										</tr>
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>핸드폰 번호</b></font>
											</td>
											<td>
												<input type="text" name='phone1' size = "4" maxlength = "4" value = "010" class="cmfont1"><font color="898989">-</font>
												<input type="text" name='phone2' size = "4" maxlength = "4" value = "2571" class="cmfont1"><font color="898989">-</font>
												<input type="text" name='phone3' size = "4" maxlength = "4" value = "5528" class="cmfont1">
											</td>
										</tr>
										<tr>
											<td width="127" height="50">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>주 소</b></font>
											</td>
											<td>
												<input type="text" name='zip1' size = "4" maxlength = "3" value = "762" class="cmfont1"><font color="898989">-</font>
												<input type="text" name='zip2' size = "4" maxlength = "3" value = "634" class="cmfont1"> 
												<a href="javascript:FindZip(0)"><img align="absmiddle" src="/assets/images/b_zip.gif" border="0"></a><br>
												<input type="text" name='address' size = "50" maxlength = "200" value = "경기도 안양" class="cmfont1"><br>
											</td>
										</tr>
										<tr>
											<td width="127" height="30">
												<img align="absmiddle" src="/assets/images/i_dot.gif" border="0"> <font color="898989"><b>E-Mail</b></font>
											</td>
											<td>
												<input type="text" name='email' size = "50" maxlength = "50" value = "wzm2@naver.com" class="cmfont1">
											</td>
										</tr>
									</table>
			
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table border="0" cellpadding="0" cellspacing="0" width="685" class="cmfont">
				<tr>
					<td height="45" align="right">
						<input type="image" src="/assets/images/b_add.gif" border="0">&nbsp;&nbsp;
						<a href="javascript:form2.reset();"><img src="/assets/images/b_reset.gif" border="0"></a>
					</td>
				</tr>
			</table>
			</form>

		<!-------------------------------------------------------------------------------------------->	
		<!-- 끝 : 다른 웹페이지 삽입할 부분                                                                                                                                                              -->
		<!-------------------------------------------------------------------------------------------->	

		</td>
	</tr>
</table>
<br><br>
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
&nbsp
</center>
</body>
</html>