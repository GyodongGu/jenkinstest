<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시글 등록</h3>
<form action="insert.do" id="frm" name="frm">
	id<input type="text" name="wid"/><br>
	title<input type="text" name="title"/><br>
	contents<input type="text" name="contents"/><br>
	<button type="submit">등록</button>
	<a href="list.do">목록이동</a>
</form>
</body>
</html>