<%-- 
    Document   : error
    Created on : Jul 15, 2018, 7:40:01 PM
    Author     : windos 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ERROR PAGE</h1>
        <font color="RED">
            ${requestScope.ERROR}
        </font>
    </body>
</html>
