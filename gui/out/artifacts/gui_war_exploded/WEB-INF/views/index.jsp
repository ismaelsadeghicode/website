<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: ismael
  Date: 11/19/20
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <table>
    <tr>
      <td>id</td>
      <td>name</td>
    </tr>

    <c:forEach items="${users}" var="user">
    <tr>
      <td>${user.id}</td>
      <td>${user.name}</td>
    </tr>
    </c:forEach>
  </table>

  </body>
</html>
