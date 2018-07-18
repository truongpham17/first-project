<%-- 
    Document   : index
    Created on : Jul 15, 2018, 7:39:54 PM
    Author     : windos 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Satellite</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.sates}" var="dto" varStatus="count">
                    <tr>
                        <td>${count.count}</td>
                        <td>${dto.name}</td>
                        <td>${dto.location}</td>
                        <td>
                           <a href="MainController?action=Update&id=${dto.id}">Update</a>
                        </td>
                    </tr>
                </c:forEach>

            </tbody>
            hello
        </table>
    </body>
</html>