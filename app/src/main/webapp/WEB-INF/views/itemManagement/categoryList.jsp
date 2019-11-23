<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Categories</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>List Categories</h1>

        </div>
    </div>
</section>
<section class="container">
    <a href="<spring:url value='upsertCategory' />" class="btn btn-default pull-right"> Add New Category</a>
    <table>
<thead>
<tr>
    <th>Code</th>
    <th>Name</th>
    <th>Description</th>
    <th>Status</th>
    <th>Update</th>
    <th>Delete</th>
</tr>
</thead>
        <c:forEach var="category" items="${categoryList}">
            <tr>
                <td><c:out value="${category.code}"/></td>
                <td><c:out value="${category.name}"/></td>
                <td><c:out value="${category.description}"/></td>
                <td><c:out value="${category.code}"/></td>
                <td><a href="<spring:url value='/upsertCategory?id=${category.id}' />" class="btn btn-default pull-right"> update</a></td>
                <td><a href="<spring:url value='/deleteCategory?id=${category.id}'  />" class="btn btn-default pull-right" onclick="return confirm('Are you sure you want to delete ${category.name}?')"> delete</a></td>
            </tr>
        </c:forEach>

    </table>
</section>
</body>
</html>
