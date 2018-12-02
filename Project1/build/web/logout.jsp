<%-- 
    Document   : logout
    Created on : 2 Dec, 2018, 6:33:37 PM
    Author     : KSHITIJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
session.setAttribute("user", null);
session.invalidate();
response.sendRedirect("student.jsp");
%>
    </body>
</html>
