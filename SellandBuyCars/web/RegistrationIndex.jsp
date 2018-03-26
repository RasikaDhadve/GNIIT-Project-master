<%-- 
    Document   : regitationIndex
    Created on : Mar 18, 2018, 10:21:20 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
    </head>
    <body>
        <form method="post" action="registration.do">
            <b>Id</b>
            <input type="text" name="id" value="autoincrement" size="5">
            <br>
            <br>
            <b>First Name</b>
            <input type="text" name="fname" value="" size="10">
            <br>
            <br>
            <b>Last Name</b>
            <input type="text" name="lname" value="" size="10">
            <br>
            <br>
             <b>Address</b>
            <input type="text" name="address" value="" size="25">
            <br>
            <br>
            <b>Phone No</b>
            <input type="text" name="phone" value="" size="10">
            <br>
            <b>Email</b>
            <input type="text" name="email" value="" size="15">
            <br>
            <br>
            <b>Username</b>
            <input type="text" name="username" value="" size="10">
            <br>
            <br>
            <b>Password</b>
            <input type="password" name="password" value="" size="10">
            <br>
            <br>
            <input type="submit" value="register">
            
        </form>
    </body>
</html>
<%@include file="footer.jsp"%>