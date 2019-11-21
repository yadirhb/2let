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
                <td><a href="<spring:url value='/upsertCategory/${category.id}' />" class="btn btn-default pull-right"> update</a></td>
                <td><a href="<spring:url value='/delete/${category.id}' />" class="btn btn-default pull-right"> delete</a></td>
            </tr>
        </c:forEach>

    </table>
<%--    <form:form  action="itemManagement/saveCategory" modelAttribute="newCategory" class="form-horizontal" method="post"  >--%>
<%--        <fieldset>--%>
<%--            <legend>New Category</legend>--%>

<%--            <form:errors path="*" cssClass="alert alert-danger" element="div"/>--%>
<%--            <div class="form-group">--%>
<%--                <label class="control-label col-lg-2 col-lg-2" for="name">Name</label>--%>
<%--                <div class="col-lg-10">--%>
<%--                    <form:input id="name" path="name" type="text" class="form:input-large"/>--%>
<%--                    <form:errors path="name" cssClass="text-danger"/>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <div class="form-group">--%>
<%--                <label class="control-label col-lg-2" for="code">Code</label>--%>
<%--                <div class="col-lg-10">--%>
<%--                    <form:input id="code" path="code" type="text" class="form:input-large"/>--%>
<%--                    <form:errors path="code" cssClass="text-danger"/>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <div class="form-group">--%>
<%--                <label class="control-label col-lg-2" for="description">Description</label>--%>
<%--                <div class="col-lg-10">--%>
<%--                    <div class="form:input-prepend">--%>
<%--                        <form:input id="description" path="description" type="text" class="form:input-large"/>--%>
<%--                        <form:errors path="description" cssClass="text-danger"/>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="form-group">--%>
<%--                <label class="control-label col-lg-2" for="description">Status</label>--%>
<%--                <div class="col-lg-10">--%>
<%--                    <div class="form:input-prepend">--%>
<%--                            &lt;%&ndash;							<form:select id="staus" path="status" class="form:input-large" items="${countryList}"/>&ndash;%&gt;--%>
<%--                        <form:errors path="status" cssClass="text-danger"/>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <div class="form-group">--%>
<%--                <div class="col-lg-offset-2 col-lg-10">--%>
<%--                    <input type="submit" id="btnSave" class="btn btn-primary" value ="Save"/>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--        </fieldset>--%>
<%--    </form:form>--%>
</section>
</body>
</html>
