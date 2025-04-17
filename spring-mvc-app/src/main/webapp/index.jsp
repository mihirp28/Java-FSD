<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- <form action="add-name" method="post">
<input name="username" type="text" placeholder="Enter your name">
<button type="submit">Enter</button>
</form> -->

<div>
<h2>Input Book Details to add</h2>
<form action="add-book" method="post">
<p>Title : <input type="text" placeholder="Enter Title" name="title"></p>
<p>Author : <input type="text" placeholder="Enter Author" name="author"></p>
<p>Price : <input type="text" placeholder="Enter Price" name="price"></p>
<p>Published Date : <input type="date" placeholder="yyyy-mm-dd" name="datePublished"></p>
<button type="submit">Add Book</button>

</form>
</div>

<div style="padding-top: 20px;">
<h3>Search for books</h3>
<form action="find-book" method="get">
<input type="search" placeholder="Enter Title" name="title">
<button type="submit">Search</button>
</form>
</div>

</body>
</html>