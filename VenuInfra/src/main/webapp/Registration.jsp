<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
        <title>Registration Form</title>
        <link rel="stylesheet" href="registration.css" type="text/css">
    </head>
    <body>
     <div class="simple-form">
        <form action="Storemanager.jsp" id="registration">
         <input type="text" name="fname" id="button1" placeholder="First Name"><br>
            <br>
            <input type="text" name="lname" id="button1" placeholder="Last Name"><br><br>
            <input type="email" name="email" id="button1" placeholder="Email"><br><br>
            <input type="password" name="pwd" id="button1" placeholder="PassWord"><br><br>
            <select id="ph">
            <option>+91</option>
                <option>+92</option>
                <option>+93</option>
            </select>
            <input type="number" name="num" placeholder="Phone Number" id="phone"><br><br>
            <input type="radio" name="gender" id="gen">&nbsp;&nbsp;&nbsp;&nbsp;<span id="sp" style="color: white; font-size: 18px;">Male</span>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" id="gen">&nbsp;&nbsp;&nbsp;&nbsp;<span id="sp" style="color: white; font-size: 18px;">Female</span><br><br>
            
            <input type="submit" value="Register" id="button">
         </form>
        
        </div>
    </body>
</html>