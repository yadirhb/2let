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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Subscription Confirmation</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="<spring:url value='/resource/css/styles.css'/>"/>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Subscription Confirmation</h1>
        </div>
    </div>
</section>
<section class="container">
    <div>
        <form:form modelAttribute="subscription" class="form-horizontal">
            <input type="hidden" name="_flowExecutionKey"
                   value="${flowExecutionKey}"/>

            <div
                    class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">
                <div class="text-center">
                    <h1>Membership Details:</h1>
                </div>
                <div class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6">
                        <strong>Membership Type:</strong> ${subscription.type} <br>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6">
                        <strong>Member info:</strong> <br/>
                        First Name: ${subscription.member.firstName} <br>
                        Last Name: ${subscription.member.lastName} <br/>
                        E-mail: ${subscription.member.email} <br/>
                        Birth date: <fmt:formatDate pattern="dd-MM-yyyy" value="${subscription.member.dateOfBirth}"/>
                        <br/>
                    </div>
                </div>

                <div align="center">
                    <button id="back" class="btn btn-default"
                            name="_eventId_backToCollectMemberDetail">Back
                    </button>

                    <button type="submit" class="btn btn-success"
                            name="_eventId_subscriptionConfirmed">
                        Confirm   <span class="glyphicon glyphicon-chevron-right"></span>
                    </button>
                    <button id="btnCancel" class="btn btn-default"
                            name="_eventId_cancel">Cancel
                    </button>
                </div>
            </div>
        </form:form>
    </div>
</section>
</body>
</html>
