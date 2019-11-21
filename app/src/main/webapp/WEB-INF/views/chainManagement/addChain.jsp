<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: damee
  Date: 11/20/19
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Chain</title>
</head>
<body>

<%--<spring:url var = "updateCenter" value="/centersManagement/updateCenter" />--%>
<%--<div id="rightList">--%>
<%--    <form:form modelAttribute="centerSearch"  action= "${updateCenter}"  method="post">--%>
<%--        <p>--%>
<%--            <label for="centerList"><spring:message code="center.center" /> </label>--%>
<%--            <form:select id="centerlist" path="id"--%>
<%--                         items="${centers}" itemLabel="name" itemValue="id"/>--%>

<%--            <input id="submit" type="submit" value="Update Center">--%>
<%--        </p>--%>
<%--    </form:form >--%>
<%--</div>--%>


<spring:url var ="addChain" value="/chainManagement/addChain" />
<div id="global">
    <form:form modelAttribute="newChain" action= "${addChain }" method="post">
        <fieldset>
            <legend>Add an Chain</legend>
            <p>
                <form:errors path="*" cssStyle="color : red;" />
            </p>
<%--            <p>--%>
<%--                <label for="area"><spring:message code="center.area" /> </label>--%>
<%--                <form:select id="area" path="area.id"--%>
<%--                             items="${areas}" itemLabel="name" itemValue="id"/>--%>
<%--            </p>--%>
            <p>
                <label for="id"><spring:message code="chain.id" /> </label>
                    <form:input id="id" path="id"/>
            <div style="text-align: center;">
                <form:errors path="id" cssStyle="color : red;" />
            </div>
            </p>
            <p>
                <label for="name"><spring:message code="chain.name" /> </label>
                    <form:input id="name" path="name"/>
            <div style="text-align: center;">
                <form:errors path="name" cssStyle="color : red;" />
            </div>
            </p>
            <p>
                <label for="description">Description: </label>
                <form:input id="description" path="description"/>
            </p>
            <p>
                <label for="status"><spring:message code="chain.status" /> </label>
                    <form:input id="status" path="status"/>
            <div style="text-align: center;">
                <form:errors path="status" cssStyle="color : red;" />
            </div>
            </p>
<%--            <p>--%>
<%--                <label for="publishDate">Publish Date: </label>--%>
<%--                <form:input path="publishDate" id="publishDate" />--%>
<%--            </p>--%>

            <p id="buttons">
                <input id="submits" type="submit" value="Add Chain">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
