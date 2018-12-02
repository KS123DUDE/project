package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("        background-image:url(\"sbp3.jpg\");\n");
      out.write("        -webkit-background-size: cover;\n");
      out.write("        background-size:cover;\n");
      out.write("        background-position:center center; \n");
      out.write("    }\n");
      out.write("    .form-area{\n");
      out.write("        width: 500px;\n");
      out.write("        height: 450px;\n");
      out.write("        margin: 60px auto 0;\n");
      out.write("        position: relative;\n");
      out.write("        background: rgba(0,0,0,0.4);\n");
      out.write("        text-align: center;\n");
      out.write("        padding: 35px;\n");
      out.write("        border: 3px solid #fff;\n");
      out.write("        -webkit-border-radius: 70px 0 70px 0;\n");
      out.write("        -moz-border-radius: 70px 0 70px 0;\n");
      out.write("        border-radius: 70px 0 70px 0;\n");
      out.write("    }\n");
      out.write("    .form-area h2{\n");
      out.write("        margin-bottom: 45px;\n");
      out.write("        color: #fff;\n");
      out.write("    }\n");
      out.write("    .img-area{\n");
      out.write("        width: 50px;\n");
      out.write("        height: 50px;\n");
      out.write("        border-radius: 50%;\n");
      out.write("        background: tomato;\n");
      out.write("        position: absolute;\n");
      out.write("        top:-5%;\n");
      out.write("        left: 45%;\n");
      out.write("    }\n");
      out.write("    .img-area img{\n");
      out.write("        width:100%;\n");
      out.write("        padding:0px;\n");
      out.write("    }\n");
      out.write("    input[type=text], input[type=password]{\n");
      out.write("        width:100%;\n");
      out.write("        height: 50px;\n");
      out.write("        border-radius: 15px 0 15px 0;\n");
      out.write("        border: 2px solid #fff;\n");
      out.write("        margin-bottom:15px;\n");
      out.write("        background-color: transparent;\n");
      out.write("        color: #fff;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .form-area p{\n");
      out.write("        text-align: left;\n");
      out.write("        color: #fff;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("    .btn{\n");
      out.write("        display: inline-block;\n");
      out.write("        height:40px;\n");
      out.write("        width:150px;\n");
      out.write("        line-height: 40px;\n");
      out.write("        overflow: hidden;\n");
      out.write("        position: relative;\n");
      out.write("        text-align: center;\n");
      out.write("        background: tomato;\n");
      out.write("        border-radius:25px;\n");
      out.write("        color: #fff;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("        margin-top:10px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        text-decoration: none;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .btn-text{\n");
      out.write("        display: block;\n");
      out.write("        height: 100%;\n");
      out.write("        position: relative;\n");
      out.write("        top: 0;\n");
      out.write("        -webkit-transition: top 0.6s;\n");
      out.write("        -moz-transition: top 0.6s;\n");
      out.write("        -ms-transition: top 0.6s;\n");
      out.write("        -o-transition: top 0.6s;\n");
      out.write("        transition: top 0.6s;\n");
      out.write("        width: 100%;\n");
      out.write("        color: red;\n");
      out.write("    }\n");
      out.write("    .btn:hover .btn-text{\n");
      out.write("        top:-100%;\n");
      out.write("    }\n");
      out.write("    .for-pass{\n");
      out.write("        text-decoration: none;\n");
      out.write("        display: block;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        font-size: 20px;\n");
      out.write("        color:#fff;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("          \n");
      out.write("    </style>\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("<div class=\"form-area\">\n");
      out.write("    <div class=\"img-area\">\n");
      out.write("        <img src=\"icon-avatar-18.jpg\" alt=\"avatar\">\n");
      out.write("    </div>\n");
      out.write("    <h2>Login Form:</h2>\n");
      out.write("    <form action=\"login.jsp\" method=\"post\">\n");
      out.write("    <p>USERNAME:</p>\n");
      out.write("    <input type=\"text\"placeholder=\"Enter Username\" name=\"user\" required>\n");
      out.write("    <p>Password:</p>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required>\n");
      out.write("    <a href=\"#\" class=\"btn\">\n");
      out.write("        <input type=\"submit\" value=\"Sign In\" class=\"btn-text\">\n");
      out.write("        <input type=\"submit\" value=\"Log In\" class=\"btn-text\">\n");
      out.write("        </a><br>\n");
      out.write("   <input type=\"submit\" value=\"Forgot Password\" formaction=\"forgot_pss.jsp\"class=\"btn\">\n");
      out.write("    <a href=\"signup.html\" class=\"for-pass\">Sign up</a>\n");
      out.write("    <a href=\"index.html\" class=\"for-pass\">Home</a>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("     </form>\n");
      out.write("</body>\n");
      out.write("</html> \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
