<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<title>Servelet</title>
</head>
<body>
<%--scriptlet--%>
<%
	Date date = new Date();
%>
<%-- scriptlet expression--%>
current date is <%=date%>


my first jsp  ${name}
password is ${password}
<%--request attribute,  expression language, jsdl --%>
<%--<form action="/login.do" method="post">--%>
<form action="/login" method="post">
	enter your name <input type="text" name="name" />
	enter your password <input type="password" name="password">
	<input type="submit">
</form>
<p>${errorMessage}</p>

</body>
</html>
<%--jsp is designed for view only, not recommended to use scriptlet/scriptlet expression--%>