<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>AddArticle</h1>
	<form atction="/addArticle" method="POST" enctype="multipart/form-data">
		<div><label>파일</label></div>
		<div><input type="file" name="file"></div>
		<div><label>제목</label></div>
		<div><input type="text" name="articleTitle"></div>
		<div><label>글쓴이</label></div>
		<div><input type="text" name="articleWriter"></div>
		<div><label>내용</label></div>
		<div><input type="text" name="articleContent"></div>
		<div><label>비밀번호</label></div>
		<div><input type="text" name="articlePw"></div>
		
		<input type="submit">
	</form>
</body>
</html>