<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <title>Login Form</title>
    <link rel="stylesheet" href="style.css">
</head>
    <body>
        <section>
            <div class="container">
            <div class="login-form">
            <h1>Sign in</h1>
    <form action="LoginServlet" method="get" >
        <input type="text" name='fname' placeholder="Enter Username" autofocus size='30' required><br>
        <input type="password" name="pwd" size="30" placeholder="Password" required><br>
        <select class="select" name="users">
        <option>Superadmin</option>
        <option>Admin</option>
        <option>Store Manager</option>
        <option>Delivery Boy</option>
        </select><br><br>
        
        <input type="submit" name="submit" value="Login"><br>
      
     </form>
                <a href="http://www.google.com">Forget Password?</a><br><br>
        
            </div>
            </div>
        </section>
    </body>  
</html>