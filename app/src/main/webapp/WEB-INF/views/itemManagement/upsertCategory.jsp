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
				<h1>Category</h1>
				<p>Add a new one<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  action="/saveCategory" modelAttribute="newCategory" class="form-horizontal" method="post"  >
			<fieldset>
				<legend>New Category</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name">Name</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
						<form:errors path="name" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="code">Code</label>
					<div class="col-lg-10">
						<form:input id="code" path="code" type="text" class="form:input-large"/>
						<form:errors path="code" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="description" path="description" type="text" class="form:input-large"/>
							<form:errors path="description" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Status</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select id="staus" path="status" class="form:input-large" items="${statusValues}"/>
							<form:errors path="status" cssClass="text-danger"/>
						</div>
					</div>
				</div>

 				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnSave" class="btn btn-primary" value ="Save"/>
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
