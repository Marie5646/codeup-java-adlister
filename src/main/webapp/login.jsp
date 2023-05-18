<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asiaautrey
  Date: 5/17/23
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <jsp:include page="partials/head.jsp">
</head>
<body>
<form action="login.jsp" method="post">
  <label for="username"></label>
  <input type="text" id="username" name="username">
  <label for="password"></label>
  <input type="text" id="password" name="password">
  <button type="submit">Submit</button>
</form>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile");
      }

  } %>
<jsp: include page="partials/scripts.jsp"/>
</body>
</html>