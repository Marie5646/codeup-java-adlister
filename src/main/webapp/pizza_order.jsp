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
    <title>Title</title>
</head>
<body>
<form action="pizza-order" method="post">
<select class="form-select"  name="crust" aria-label="Default select example">
    <option selected>crust type</option>
    <option value="thin">thin</option>
    <option value="cheese">cheese</option>
    <option value="pan-tossed">pan-tossed</option>
</select>
<select class="form-select" name="sauce" aria-label="Default select example">
    <option selected> sauce type</option>
    <option  value="marinara">marinara</option>
    <option  value="bbq">bbq</option>
    <option  value="alfredo">alfredo</option>
</select>
<select class="form-select" name="size" aria-label="Default select example">
    <option selected> size type</option>
    <option value="10">10</option>
    <option value="12">12</option>
    <option value="14">14</option>
</select>
<div class="form-check">
    <input class="form-check-input"  name="toppings" type="checkbox" value="pepperoni" id="flexCheckDefault1">
    <label class="form-check-label" for="flexCheckDefault1">Pepperoni</label>
    <input class="form-check-input"  name="toppings" type="checkbox" value="chicken" id="flexCheckDefault2">
    <label class="form-check-label" for="flexCheckDefault2">Chicken</label>
    <input class="form-check-input"  name="toppings" type="checkbox" value="onions" id="flexCheckDefault3">
    <label class="form-check-label" for="flexCheckDefault3">Onions</label>
</div>
    <button type="submit" value="Send">Submit</button>
</form>
</body>
</html>
