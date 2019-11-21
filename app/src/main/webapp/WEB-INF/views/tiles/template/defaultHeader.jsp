<nav class="navbar navbar-fixed-top">
    <div class="container">
        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <!--a href="<spring:url
                value='/spring_security_login'/>" class="btn btn-default pull-right"> Login</a-->
            <a href="${pageContext.request.contextPath}/login" class="btn btn-default pull-right"> Login</a>
        </security:authorize>
        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <!--a href="<spring:url
                value='/spring_security_login'/>" class="btn btn-default pull-right"> Login</a-->
            <a href="${pageContext.request.contextPath}/subscription" class="btn btn-default pull-right"> Join</a>
        </security:authorize>

        <security:authorize access="isAuthenticated()">
            <a href="${pageContext.request.contextPath}/dologout" class="btn btn-danger btn-mini pull-right">Logout</a>
        </security:authorize>
        <a href="${pageContext.request.contextPath}/welcome" class="btn btn-default">
            <span class="glyphicon-hand-left glyphicon"></span> Home
        </a>
    </div>
</nav>