<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Duncan
  Date: 20/11/2019
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<nav>
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/users">Users</a></li>
        <li><a href="${pageContext.request.contextPath}/item">Item</a></li>
        <li><a href="${pageContext.request.contextPath}/pages/clients">Clients</a></li>
    </ul>
</nav>
