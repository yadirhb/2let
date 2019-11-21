<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: damee
  Date: 11/20/19
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Area</title>
</head>
<body>
<%--<spring:url var = "updateCenter" value="/centersManagement/updateCenter" />
<div id="rightList">
    <form:form modelAttribute="centerSearch"  action= "${updateCenter}"   method="post">
        <p>
            <label for="centerList"><spring:message code="center.center" /> </label>
            <form:select id="centerList" path="id"
                         items="${centers}" itemLabel="name" itemValue="id"/>

            <input id="submit" type="submit" value="Update Center">
        </p>
    </form:form >
</div>

<spring:url var = "book_update" value="/book_update" />--%>
<spring:url var = "updateArea" value="/areaManagement/updateArea" />

<div id="global">
    <form:form commandName="area" action= "${updateArea}" >
        <fieldset>
            <legend>Update an Area</legend>
            <form:hidden path="id"/>
<%--            <p>--%>
<%--                <label for="category">Category: </label>--%>
<%--                <form:select id="category" path="category.id" items="${categories}"--%>
<%--                             itemLabel="name" itemValue="id"/>--%>
<%--            </p>--%>
            <p>
                <label for="name">Name: </label>
                <form:input id="name" path="Name"/>
            </p>
            <p>
                <label for="description">Description: </label>
                <form:input id="description" path="description"/>
            </p>
            <p>
                <label for="status">Status: </label>
                <form:input id="status" path="status"/>
            </p>
<%--            <p>--%>
<%--                <label for="publishDate">Publish Date: </label>--%>
<%--                <form:input path="publishDate" id="publishDate" />--%>
<%--            </p>--%>

            <p id="buttons">
                <input id="submit" type="submit"  value="Update Area">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
