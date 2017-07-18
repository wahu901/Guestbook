<%-- 
    Document   : customer
    Created on : 2017/5/25, 上午 09:26:44
    Author     : Wayne.Hu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="guest.*, entity.*"%>
 
<jsp:useBean id="customerDao" type="guest.CustomerDao" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>JPA Guestbook Web Application Tutorial</title>
    </head>
 
    <body>
        <form method="POST" action="customer.htm">
            Name: <input type="text" name="name" />
            <input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
        <% for (Customer customer : customerDao.getAllCustomers()) { %>
            <li> <%= customer %> </li>
        <% } %>
        </ol><hr>
 
        <iframe src="http://www.objectdb.com/pw.html?spring-netbeans"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>
