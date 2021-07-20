<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/10/2021
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
  <h1 align="center">Danh Sach Khach Hang</h1>
  <form>
      <table border="1" cellpadding="5">
          <tr>
              <td>Name</td>
              <td>Age</td>
          </tr>
          <c:forEach items="${customers}" var="customers">
              <tr>
                  <td>
                  <td><c:out value="${customers.name}"/></td>
                  </td>
                  <td>
                  <td><c:out value="${customers.age}"/></td>
                  </td>
              </tr>
          </c:forEach>
      </table>
  </form>
</body>
</html>
