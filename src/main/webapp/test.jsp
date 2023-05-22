<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asiaautrey
  Date: 5/21/23
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBeans</title>
</head>
<body>
<c:forEach items="${albums}" var="album">
    <div>
    <h1>${album.artistName}</h1>
    <h3>${album.albumName}</h3>
    <p>${album.genre}</p>
    <p>${album.releaseDate}</p>
    <p>${album.sales}</p>
    </div>
</c:forEach>

<c:forEach items="${quotes}" var="quote">
    <div>
        <img src="${quote.author.img}">
        <h1>${quote.author.firstName}, ${quote.author.lastName}</h1>
        <p>${quote.content}</p>
    </div>
</c:forEach>
</body>
</html>
