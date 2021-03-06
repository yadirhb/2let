<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: damee
  Date: 11/20/19
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="global">
    <h1>Center List</h1>

    <!-- Query Parameter passing  -->
    <spring:url value="/centersManagement/addCenter" var="addCenter_url" >
    </spring:url>
    <a href="${addCenter_url}">Add center</a><br/>



    <table>
        <tr style="width: 100%;">
            <th style="width: 19%;">ID</th>
            <th style="width: 21%;">Name</th>
            <th style="width: 21%;">Description</th>
            <th style="width: 21%;">Status</th>
            <th style="width: 15%;"></th>
        </tr>
        <c:forEach items="${centers}" var="center">
            <tr>
                <td style="width: 19%;">${center.id}</td>
                <td style="width: 19%;">${center.name}</td>
                <td style="width: 19%;">${center.description}</td>
                <td style="width: 19%;">${center.status}</td>
<%--                <td><spring:eval expression="book.publishDate" /></td>--%>

                <!-- Spring:url for handling Spring template/@PathVariable -->
                <spring:url value="/centersManagement/updateCenter/{id}"  var="update" >
                    <spring:param name="id" value="${center.id}" />
                </spring:url>

                <td><a href="${update}">Update</a></td>
            </tr>
        </c:forEach>
    </table>

    <input type="button" value="Add Category" onclick="make_visible('formInput');return false;">

</div>

<!-- Success - or Validation errors -->
<div id="result" style="display:none" >
    <p id="success" >

    </p>
    <p id="errors" >

    </p>
</div>

<div id="formInput" style="display:none" >

    <h3 align="center">Category</h3>

    <!-- No action method handled by AJAX-->
    <form id="categoryForm" method="post">

        <input type="hidden" name="id" value="0">

        <p>
            <label for="name"> Name    : </label>
            <input type="text" name="name" id="name" value="" />
        </p>

        <p>
            <label for="description"> Description: </label>
            <input id="description" name="description" type="text"/>
        </p>

        <input type="button" value="Add Category" onclick="categorySubmit();return false;">

    </form>
    <h4 align="center">
        <a href="#" onclick="make_hidden('formInput'); make_hidden('result');resetForm('categoryForm');"> <b>EXIT</b> </a>
    </h4>

</div>

</body>
</html>
