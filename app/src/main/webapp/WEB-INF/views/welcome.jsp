<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<spring:url value='/resource/css/styles.css'/>"/>
    <title>Welcome</title>
</head>
<body>
<nav>
    <div class="container">
        <span>Welcome page</span>
        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <!--a href="<spring:url
                value='/spring_security_login'/>" class="btn btn-default pull-right"> Login</a-->
            <a href="<spring:url value='/login' />" class="btn btn-default pull-right"> Login</a>
            <a href="<spring:url value='/categoryList' />" class="btn btn-default pull-right"> Category</a>
        </security:authorize>
        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <a href="<spring:url value='/centersManagement' />" class="btn btn-default pull-right"> Centers</a>
            <a href="<spring:url value='/areaManagement' />" class="btn btn-default pull-right"> Areas</a>
            <a href="<spring:url value='/chainManagement' />" class="btn btn-default pull-right"> Chain</a>
        </security:authorize>

        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <!--a href="<spring:url
                value='/spring_security_login'/>" class="btn btn-default pull-right"> Login</a-->
            <a href="<spring:url value='/subscription' />" class="btn btn-default pull-right"> Join</a>
        </security:authorize>

        <p>
            <security:authorize access="isAuthenticated()">
            <a href="<spring:url  value="/dologout" />"
               class="btn btn-danger btn-mini pull-right">Logout</a>
            </security:authorize>


            <a href="<spring:url value='/employees/list' />" class="btn btn-default">
                <span class="glyphicon-hand-left glyphicon"></span> Go to Company
            </a>
    </div>
</nav>
<section class="mainContainer">
    <div class="jumbotron">
        <div class="container">
            <img src="<spring:url value='/resource/images/gym-bg.jpg' />"/>
            <h1> ${greeting} </h1>
            <p> ${tagline} </p>
        </div>
    </div>
</section>

</body>
</html>
