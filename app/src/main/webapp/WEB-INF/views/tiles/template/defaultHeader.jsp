<nav class="navbar navbar-fixed-top">
    <div class="container">
        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <!--a href="<spring:url
                value='/spring_security_login'/>" class="btn btn-default pull-right"> Login</a-->
            <a href="<spring:url value='/login' />" class="btn btn-default pull-right"> Login</a>
        </security:authorize>
        <security:authorize access="isAnonymous()">
            <!-- WHICH ONE? depends on basic form OR CUSTOM -->
            <!--a href="<spring:url
                value='/spring_security_login'/>" class="btn btn-default pull-right"> Login</a-->
            <a href="<spring:url value='/subscription' />" class="btn btn-default pull-right"> Join</a>
        </security:authorize>

        <security:authorize access="isAuthenticated()">
        <a href="<spring:url  value='/dologout'/>" class="btn btn-danger btn-mini pull-right">Logout</a>
        </security:authorize>
        <a href="<spring:url value='/employees/list' />" class="btn btn-default">
            <span class="glyphicon-hand-left glyphicon"></span> Go to Company
        </a>
    </div>
</nav>