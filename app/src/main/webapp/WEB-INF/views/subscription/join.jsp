<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yadirhb
  Date: 11/19/19
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Join</title>
</head>
<body>
<strong>Join page</strong>
<c:forEach var="membership" items="${memberships}"></c:forEach>
<a href="<spring:url value='/subscription/joinForm' />">Package</a>
</body>
</html>
