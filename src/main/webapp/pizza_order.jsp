<%--
  Created by IntelliJ IDEA.
  User: asiaautrey
  Date: 5/18/23
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
    <title>Title</title>
</head>
<body>
<form action="pizza-order" method="post">
<select class="form-select crustType" aria-label="Default select example">
    <option selected>crust type</option>
    <option value="1">thin</option>
    <option value="2">cheese</option>
    <option value="3">pan-tossed</option>
</select>
</form>
<form action="pizza-order" method="post">
<select class="form-select sauceType" aria-label="Default select example">
    <option selected> sauce type</option>
    <option value="1">marinara</option>
    <option value="2">bbq</option>
    <option value="3">alfredo</option>
</select>
</form>
<form action="pizza-order" method="post">
<select class="form-select sizeType" aria-label="Default select example">
    <option selected> size type</option>
    <option value="1">10</option>
    <option value="2">12</option>
    <option value="3">14</option>
</select>
</form>
<form action="pizza-order" method="post">
<div class="form-check toppingType">
    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault1">
    <label class="form-check-label" for="flexCheckDefault1">Pepperoni</label>
    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault2">
    <label class="form-check-label" for="flexCheckDefault2">Chicken</label>
    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault3">
    <label class="form-check-label" for="flexCheckDefault3">Onions</label>
    <button>Submit</button>
</div>
</form>
</jsp:include>
</body>
</html>
