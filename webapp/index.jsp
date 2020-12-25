
<%--
  Created by IntelliJ IDEA.
  User: Artur
  Date: 15.12.2020
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%
    String header = "Task4 VDcom";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>WEBAPP</title>
</head>
<body>
<h2><%= header %></h2>
<form action="${pageContext.request.contextPath}/myservlet" method="post">
    <button type="submit" name="button" value="button1" onclick='location.href=""'>Show BG</button>
    <button type="submit" name="button" value="button2" onclick='location.href=""'>Show ST</button>
    <button type="submit" name="button" value="button3">Add</button>
    <button type="submit" name="button" value="button4">Delete</button>
    <button type="submit" name="button" value="button5">Edit</button>
</form>
</body>
</html>