<%--
  Created by IntelliJ IDEA.
  User: asiaautrey
  Date: 5/25/23
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/register" method="post">
    <div class="form-group">
        <label for="username" name="username" class="form-control">Enter a Username</label>
        <input id="username" name="username" class="form-control" type="text">
        <label for="password" name="password" class="form-control">Enter a Password</label>
        <input id="password" name="password" class="form-control" type="text">
        <label for="email" name="email" class="form-control">Enter a Email</label>
        <input id="email" name="email" class="form-control" type="text">
    </div>
</form>
</body>
</html>
