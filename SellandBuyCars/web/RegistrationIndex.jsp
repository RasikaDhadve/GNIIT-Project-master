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
    <body align="center">
        <form method="post" action="registration.do">
            <b>Id</b>
            <input type="text" name="id"  size="5" placeholder="Auto increment">
            <br>
            <br>
            <b>First Name</b>
            <input type="text" name="fname" placeholder="Enter  First Name" size="10">
            <br>
            <br>
            <b>Last Name</b>
            <input type="text" name="lname" placeholder="Enter Last Name" size="10">
            <br>
            <br>
             <b>Address</b>
            <input type="text" name="address" placeholder="Enter Address" size="25">
            <br>
            <br>
            <b>Phone No</b>
            <input type="text" name="phone" placeholder="Enter Phone Number" size="10">
            <br>
            <br>
            <b>Email</b>
            <input type="text" name="email" placeholder="Enter Email" size="15">
            <br>
            <br>
            <b>Username</b>
            <input type="text" name="username" placeholder="Enter Username" size="10">
            <br>
            <br>
            <b>Password</b>
            <input type="password" name="password" placeholder="Enter Password" size="10">
            <br>
            <br>
            <input type="submit" value="register">
            
        </form>
    </body>
</html>
<%@include file="footer.jsp"%>