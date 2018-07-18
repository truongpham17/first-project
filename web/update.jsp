<%-- 
    Document   : update
    Created on : Jul 16, 2018, 1:29:00 PM
    Author     : windos 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form>
            Name:  <input type="text" value="${requestScope.sate.name}" name="status"/><br/>
            Location: <input type="text" value="${requestScope.sate.location}" name="status"/><br/>
            Description: <input type="text" value="${requestScope.sate.description}" name="status"/><br/>
            Status: <input type="text" value="${requestScope.sate.status}" name="status"/><br/>
            <input type="submit" value="Accept" name="action" /><br/>
            <input type="submit" value="Decline" name="action"/><br/>
        </form>
    </body>
</html>
