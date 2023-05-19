<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asiaautrey
  Date: 5/19/23
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WELCOME TO ADS</title>
</head>
<body>

<h2>TOP ADS</h2>
<section>
<c:forEach items="${ads}" var="ads">
    <h3>Posted By: ${ads.userId}</h3>
    <h2>Title: ${ads.title}</h2>
    <p>Description: ${ads.description}</p>
</c:forEach>
</section>
</body>
</html>
