<%--
  Created by IntelliJ IDEA.
  User: yadirhb
  Date: 11/19/19
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Subscription Confirmation</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="<spring:url value='/resource/css/styles.css'/>"/>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Successful request!</h1>
        </div>
    </div>
</section>
<section class="container">
<div>
    <pre>
        Dear ${subscription.member.firstName},

        We are really excited for your request but we need to verify your information. We are going to send you an email after reviewing your request to continue with the process.
        Joyful,

        2Let Team.
    </pre>

    <a href="<spring:url value="/"/>">Go to Home</a>
</div>
</section>
</body>
</html>
