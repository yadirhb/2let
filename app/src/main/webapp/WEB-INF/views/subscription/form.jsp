<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Membership</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Fulfill membership</h1>
				<p>Add your information<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="newMember" class="form-horizontal" action="join?type=${type}" >
			<fieldset>
				<legend>New member</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName">Email</label>
					<div class="col-lg-10">
						<form:input id="email" path="email" type="text" class="form:input-large"/>
						<form:errors path="email" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName">First Name</label>
					<div class="col-lg-10">
						<form:input id="firstName" path="firstName" type="text" class="form:input-large"/>
						<form:errors path="firstName" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="lastName">Last Name</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="lastName" path="lastName" type="text" class="form:input-large"/>
							<form:errors path="lastName" cssClass="text-danger"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="dateOfBirth">Date of birth</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input type="date" id="dateOfBirth" path="dateOfBirth" class="form:input-large"/>
							<form:errors path="dateOfBirth" cssClass="text-danger"/>
						</div>
					</div>
				</div>
								
 				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Subscribe"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
