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

<c:choose>
<c:when test="${param.username.equals('admin') && param.password.equals('password')}">
  <% response.sendRedirect("profile.jsp");%>
</c:when>
<%--<c:otherwise>--%>
<%--&lt;%&ndash;  <% response.sendRedirect("login.jsp");%>&ndash;%&gt;--%>
<%--</c:otherwise>--%>
</c:choose>

<jsp: include page="partials/scripts.jsp"/>
</body>
</html>
