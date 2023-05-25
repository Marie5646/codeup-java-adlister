<<<<<<< HEAD
<%--
  Created by IntelliJ IDEA.
  models.User: asiaautrey
  Date: 5/23/23
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dao.Ads</title>
  <jsp:include page="/WEB-INF/head.jsp">
    <jsp:param name="title" value="Create a new models.Ad" />
  </jsp:include>
</head>
<body>
<form action="/ads/create" method="post">
  <div class="form-group">
    <label for="title" name="title" class="form-control">Title</label>
    <input id="title" name="title" class="form-control" type="text">
  </div>
  <div class="form-group">
    <label for="description">Description</label>
    <textarea id="description" name="description" class="form-control" type="text"></textarea>
    <input type="submit" class="btn btn-block btn-primary">
  </div>
</form>

</body>
</html>
