<%-- 
    Document   : status
    Created on : 2 Dec, 2018, 6:35:15 PM
    Author     : KSHITIJ
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
    body {
        background-image:url("back pattern 1.png");
        background-attachment:fixed;
        
        background-size:100px 100px;
        font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
           
}
h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;      
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;
  }
  .btn {
      padding: 10px 20px;
      background-color: #333;
      color: #f1f1f1;
      border-radius: 0;
      transition: .2s;
  }
  .btn:hover, .btn:focus {
      border: 1px solid #333;
      background-color: #fff;
      color: #000;
  }
  .modal-header, h4, .close {
      background-color: #333;
      color: #fff !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-header, .modal-body {
      padding: 40px 50px;
  }
  .nav-tabs li a {
      color: #777;
  }
  #googleMap {
      width: 100%;
      height: 400px;
      -webkit-filter: grayscale(100%);
      filter: grayscale(100%);
  }  
  .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand { 
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;
  }
  .dropdown-menu li a:hover {
      background-color: red !important;
  }
  footer {
      background-color: #2d2d30;
      color: #f5f5f5;
      padding: 32px;
  }
  footer a {
      color: #f5f5f5;
  }
  footer a:hover {
      color: #777;
      text-decoration: none;
  }  
  .form-control {
      border-radius: 0;
  }
  textarea {
      resize: none;
  }
#p
{
background-color:white;
margin-top: 0px;
margin-bottom: 0px;
margin-right: 100px;
margin-left: 50px;
border-radius: 25px;
    border: 2px solid black;
    padding: 20px; 
box-shadow: 5px 10px 20px black;
color:black;

}
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #555;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
a,a:hover{
    color:white;
}
select{
    width: 50%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
}
       .one, .two, .three{
    position:absolute;
	margin-top:-10px;
	z-index:1;
	height:40px;
	width:40px;
	border-radius:25px;
	
}
.one{
	left:25%;
}
.two{
	left:50%;
}
.three{
	left:75%;
}
.primary-color{
	background-color:black;
}
.success-color{
	background-color:#5cb85c;
}
.danger-color{
	background-color:#d9534f;
}
.warning-color{
	background-color:#f0ad4e;
}
.info-color{
	background-color:#5bc0de;
}
.no-color{
	background-color:inherit;
}
</style>
   
    </head>
 <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
        
        <nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        <a class="navbar-brand" href="index.html"><B>COLLEGE APPLICATION APPROVAL</B></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="std_login.jsp">HOME</a></li>
        
        <li><a href="student.jsp">LOG OUT</a></li>
        
             </ul>
    </div>
  </div>
</nav>
     <br><br>
     <div id="p">
         
     <h1 align="center">Application Status</h1>
        <% 
            String appl=request.getParameter("applic");
            String myurl="jdbc:mysql://localhost/acadview";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="select * from app where application='"+appl+"'";
                ResultSet rs=st.executeQuery(query1);
                 if(rs.next())
                 {
            String permit=rs.getString("permit");
                 
                 
        if(permit==null)
        {
            permit="not seen";
        }
        if(permit.equals("cApprove"))
        {
        %>
        
        <br><br><br>
           <p align="center" style="font-family:algerian; font-size:50px">Approved</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one success-color"></div><div class="two success-color"></div><div class="three success-color"></div>
  			<div class="progress-bar" style="width: 100%;"></div>
		</div>
        
	</div>
	</div>
</div>

       <% }
else if(permit.equals("bApprove"))
        {
        %>
        
        <br><br><br>
             <p align="center" style="font-family:algerian; font-size:50px">Partially Approved</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one success-color"></div><div class="two success-color"></div><div class="three success-color"></div>
  			<div class="progress-bar" style="width: 78%;"></div>
		</div>
        
	</div>
	</div>
</div>
       <% }
else if(permit.equals("aApprove"))
        {
        %>
        
        <br><br><br>
             <p align="center" style="font-family:algerian; font-size:50px">Approved By Faculty</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one success-color"></div><div class="two success-color"></div><div class="three success-color"></div>
  			<div class="progress-bar" style="width: 52%;"></div>
		</div>
        
	</div>
	</div>
</div>
       <% }
else if(permit.equals("Declined1"))
        {
        %>
        
        <br><br><br>
        <p align="center" style="font-family:algerian; font-size:50px">Declined By Faculty</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one primary-color"></div><div class="two no-color"></div><div class="three no-color"></div>
  			<div class="progress-bar" style="width: 25%;"></div>
		</div>
        
	</div>
	</div>
</div>
       <% }
else if(permit.equals("Declined3"))
        {
        %>
        
        <br><br><br>
        <p align="center" style="font-family:algerian; font-size:50px">Declined By Head</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one success-color"></div><div class="two success-color"></div><div class="three primary-color"></div>
  			<div class="progress-bar" style="width: 25%;"></div>
		</div>
        
	</div>
	</div>
</div>
       <% }

else if(permit.equals("Declined2"))  { %>
        
        <br><br><br>
        <p align="center" style="font-family:algerian; font-size:50px">Declined By Coordinator</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one success-color"></div><div class="two primary-color"></div><div class="three no-color"></div>
  			<div class="progress-bar" style="width: 52%;"></div>
		</div>
        
	</div>
	</div>
</div>
       <% }
else if(permit.equals("not seen"))
        {
        %>
        
        <br><br><br>
        <p align="center" style="font-family:algerian; font-size:50px">Not Seen</p>
<div class="container">
	<div class="row"><br />
		<div class="col-md-12">
    	<div class="progress">
            
        <div class="one success-color"></div><div class="two success-color"></div><div class="three success-color"></div>
  			<div class="progress-bar" style="width: 25%;"></div>
		</div>
        
	</div>
	</div>
</div>
       <% }

}
else
                 {
                     out.print("not found");
                 }
        %>
  <P align="center"style="font-family:Times New Roman; font-size:30px">FACULTY&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CO ORDINATOR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HEAD</p>      
    <br><br>
     </div>
     </body>
</html>
