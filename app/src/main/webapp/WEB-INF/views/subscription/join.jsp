<%--
  Created by IntelliJ IDEA.
  User: yadirhb
  Date: 11/19/19
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Join</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="<spring:url value='/resource/css/styles.css'/>"/>
</head>
<body>
<section>
    <div class="jumbotron" align="center">
        <div class="container">
            <h1>Available memberships</h1>
            <p>Pick the plan that suits you the most!
            <p>
        </div>
    </div>
</section>
<section class="container memberships">
    <c:forEach var="membership" items="${memberships}">
        <a href="<spring:url value='/subscription/join?type=${membership}' />" class="card">

            <span class="title primary">
                <c:out
                        value="${membership}">Membership</c:out>
            </span>
            <p>Membership description</p>
        </a>
    </c:forEach>
</section>
</body>
</html>
