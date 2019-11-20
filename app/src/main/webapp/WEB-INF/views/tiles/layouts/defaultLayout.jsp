<%--
  Created by IntelliJ IDEA.
  User: Duncan
  Date: 20/11/2019
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<spring:url value='/resource/css/styles.css'/>"/>
    <title><tiles:getAsString name="title" /></title>
</head>

<body>
<header>
    <tiles:insertAttribute name="header" />
</header>

<section class="container main">
    <div class="row">
        <section id="sidemenu" class="col-md-3">
            <tiles:insertAttribute name="menu" />
        </section>

        <section id="site-content" class="col-md-9">
            <tiles:insertAttribute name="body" />
        </section>
    </div>
</section>

<footer id="footer" class="footer">
    <div class="container footer">
        <tiles:insertAttribute name="footer" />
    </div>
</footer>
</body>
</html>
