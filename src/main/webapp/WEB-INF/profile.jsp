<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<<<<<<< HEAD:src/main/webapp/WEB-INF/profile.jsp
    <jsp:include page="/WEB-INF/head.jsp">
=======
    <jsp:include page="/WEB-INF/partials/head.jsp">
>>>>>>> jdbc-exercise:src/main/webapp/profile.jsp
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<<<<<<< HEAD:src/main/webapp/WEB-INF/profile.jsp
    <jsp:include page="/WEB-INF/navbar.jsp"/>
=======
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

>>>>>>> jdbc-exercise:src/main/webapp/profile.jsp
    <div class="container">
        <h1>Welcome, ${sessionScope.user}!</h1>
    </div>

</body>
</html>
