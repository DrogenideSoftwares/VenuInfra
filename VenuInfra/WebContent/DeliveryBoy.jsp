<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delivery Boy</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    
    <style>
        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 530px}
        /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
     /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
        
  </style>
</head>
<body>
<%
     if(session.getAttribute("username")==null)
     {
    	 response.sendRedirect("Login.jsp");
     }
%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Super Admin</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${username}</a></li>
    </ul>
  </div>
</nav>
    
    
    <div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
    <p><span class="glyphicon glyphicon-user"></span style="text-decoration: none; color: black; text-transform: uppercase;">${username}</p><br>      
      <a href="Registration2.jsp"><button class="btn btn-danger navbar-btn">Create store</button></a>
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
    </div>
      
      <div class="row">
  <a href="Deliveryboyservlet"><div class="col-sm-2">
          <div class="well">
            <h4>Delivery Boy</h4>
            <p>Some text.....</p> 
          </div>
        </div></a>
        <div class="col-sm-2">
          <div class="well">
            <h4>BOX 2</h4>
            <p>Some text.....</p> 
          </div>
        </div>
        <div class="col-sm-2">
          <div class="well">
            <h4>BOX 3</h4>
            <p>Some text.... </p> 
          </div>
        </div>
        <div class="col-sm-2">
          <div class="well">
            <h4>BOX 4</h4>
            <p>Some text....</p> 
          </div>
        </div>
      </div>
  </div>
</div>
    
    
    

<footer class="container-fluid text-center">
  <p><a href="http://www.drogenidesoftwares.com">copyright@drogenidesoftware.com</a></p>
</footer>
    

</body>
</html>