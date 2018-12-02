<%-- 
    Document   : student
    Created on : 2 Dec, 2018, 6:37:50 PM
    Author     : KSHITIJ
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body{
        background-image:url("sbp3.jpg");
        -webkit-background-size: cover;
        background-size:cover;
        background-position:center center; 
    }
    .form-area{
        width: 500px;
        height: 450px;
        margin: 60px auto 0;
        position: relative;
        background: rgba(0,0,0,0.4);
        text-align: center;
        padding: 35px;
        border: 3px solid #fff;
        -webkit-border-radius: 70px 0 70px 0;
        -moz-border-radius: 70px 0 70px 0;
        border-radius: 70px 0 70px 0;
    }
    .form-area h2{
        margin-bottom: 45px;
        color: #fff;
    }
    .img-area{
        width: 50px;
        height: 50px;
        border-radius: 50%;
        background: tomato;
        position: absolute;
        top:-5%;
        left: 45%;
    }
    .img-area img{
        width:100%;
        padding:0px;
    }
    input[type=text], input[type=password]{
        width:100%;
        height: 50px;
        border-radius: 15px 0 15px 0;
        border: 2px solid #fff;
        margin-bottom:15px;
        background-color: transparent;
        color: #fff;
        
    }
    .form-area p{
        text-align: left;
        color: #fff;
        text-transform: uppercase;
        font-weight: bold;
    }
    .btn{
        display: inline-block;
        height:40px;
        width:150px;
        line-height: 40px;
        overflow: hidden;
        position: relative;
        text-align: center;
        background: tomato;
        border-radius:25px;
        color: #fff;
        text-transform: uppercase;
        margin-top:10px;
        cursor: pointer;
        text-decoration: none;
        
    }
    .btn-text{
        display: block;
        height: 100%;
        position: relative;
        top: 0;
        -webkit-transition: top 0.6s;
        -moz-transition: top 0.6s;
        -ms-transition: top 0.6s;
        -o-transition: top 0.6s;
        transition: top 0.6s;
        width: 100%;
        color: red;
    }
    .btn:hover .btn-text{
        top:-100%;
    }
    .for-pass{
        text-decoration: none;
        display: block;
        margin-top: 10px;
        font-weight: bold;
        font-size: 20px;
        color:#fff;
        
    }
          
    </style>
     
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
<div class="form-area">
    <div class="img-area">
        <img src="icon-avatar-18.jpg" alt="avatar">
    </div>
    <h2>Login Form:</h2>
    <form action="login.jsp" method="post">
    <p>USERNAME:</p>
    <input type="text"placeholder="Enter Username" name="user" required>
    <p>Password:</p>
    <input type="password" placeholder="Enter Password" name="pass" required>
    <a href="#" class="btn">
        <input type="submit" value="Sign In" class="btn-text">
        <input type="submit" value="Log In" class="btn-text">
        </a><br>
   <input type="submit" value="Forgot Password" formaction="forgot_pss.jsp"class="btn">
    <a href="signup.html" class="for-pass">Sign up</a>
    <a href="index.html" class="for-pass">Home</a>
    
        
    </div>
     </form>
</body>
</html> 
