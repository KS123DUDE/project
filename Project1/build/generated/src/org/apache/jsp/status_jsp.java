package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        background-image:url(\"back pattern 1.png\");\n");
      out.write("        background-attachment:fixed;\n");
      out.write("        \n");
      out.write("        background-size:100px 100px;\n");
      out.write("        font: 400 15px/1.8 Lato, sans-serif;\n");
      out.write("      color: #777;\n");
      out.write("           \n");
      out.write("}\n");
      out.write("h3, h4 {\n");
      out.write("      margin: 10px 0 30px 0;\n");
      out.write("      letter-spacing: 10px;      \n");
      out.write("      font-size: 20px;\n");
      out.write("      color: #111;\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("      padding: 80px 120px;\n");
      out.write("  }\n");
      out.write("  .person {\n");
      out.write("      border: 10px solid transparent;\n");
      out.write("      margin-bottom: 25px;\n");
      out.write("      width: 80%;\n");
      out.write("      height: 80%;\n");
      out.write("      opacity: 0.7;\n");
      out.write("  }\n");
      out.write("  .person:hover {\n");
      out.write("      border-color: #f1f1f1;\n");
      out.write("  }\n");
      out.write("  .carousel-inner img {\n");
      out.write("      width: 100%; /* Set width to 100% */\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  .carousel-caption h3 {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  @media (max-width: 600px) {\n");
      out.write("    .carousel-caption {\n");
      out.write("      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  .bg-1 {\n");
      out.write("      background: #2d2d30;\n");
      out.write("      color: #bdbdbd;\n");
      out.write("  }\n");
      out.write("  .bg-1 h3 {color: #fff;}\n");
      out.write("  .bg-1 p {font-style: italic;}\n");
      out.write("  .list-group-item:first-child {\n");
      out.write("      border-top-right-radius: 0;\n");
      out.write("      border-top-left-radius: 0;\n");
      out.write("  }\n");
      out.write("  .list-group-item:last-child {\n");
      out.write("      border-bottom-right-radius: 0;\n");
      out.write("      border-bottom-left-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail {\n");
      out.write("      padding: 0 0 15px 0;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail p {\n");
      out.write("      margin-top: 15px;\n");
      out.write("      color: #555;\n");
      out.write("  }\n");
      out.write("  .btn {\n");
      out.write("      padding: 10px 20px;\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #f1f1f1;\n");
      out.write("      border-radius: 0;\n");
      out.write("      transition: .2s;\n");
      out.write("  }\n");
      out.write("  .btn:hover, .btn:focus {\n");
      out.write("      border: 1px solid #333;\n");
      out.write("      background-color: #fff;\n");
      out.write("      color: #000;\n");
      out.write("  }\n");
      out.write("  .modal-header, h4, .close {\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #fff !important;\n");
      out.write("      text-align: center;\n");
      out.write("      font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-header, .modal-body {\n");
      out.write("      padding: 40px 50px;\n");
      out.write("  }\n");
      out.write("  .nav-tabs li a {\n");
      out.write("      color: #777;\n");
      out.write("  }\n");
      out.write("  #googleMap {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 400px;\n");
      out.write("      -webkit-filter: grayscale(100%);\n");
      out.write("      filter: grayscale(100%);\n");
      out.write("  }  \n");
      out.write("  .navbar {\n");
      out.write("      font-family: Montserrat, sans-serif;\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      background-color: #2d2d30;\n");
      out.write("      border: 0;\n");
      out.write("      font-size: 11px !important;\n");
      out.write("      letter-spacing: 4px;\n");
      out.write("      opacity: 0.9;\n");
      out.write("  }\n");
      out.write("  .navbar li a, .navbar .navbar-brand { \n");
      out.write("      color: #d5d5d5 !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li a:hover {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li.active a {\n");
      out.write("      color: #fff !important;\n");
      out.write("      background-color: #29292c !important;\n");
      out.write("  }\n");
      out.write("  .navbar-default .navbar-toggle {\n");
      out.write("      border-color: transparent;\n");
      out.write("  }\n");
      out.write("  .open .dropdown-toggle {\n");
      out.write("      color: #fff;\n");
      out.write("      background-color: #555 !important;\n");
      out.write("  }\n");
      out.write("  .dropdown-menu li a {\n");
      out.write("      color: #000 !important;\n");
      out.write("  }\n");
      out.write("  .dropdown-menu li a:hover {\n");
      out.write("      background-color: red !important;\n");
      out.write("  }\n");
      out.write("  footer {\n");
      out.write("      background-color: #2d2d30;\n");
      out.write("      color: #f5f5f5;\n");
      out.write("      padding: 32px;\n");
      out.write("  }\n");
      out.write("  footer a {\n");
      out.write("      color: #f5f5f5;\n");
      out.write("  }\n");
      out.write("  footer a:hover {\n");
      out.write("      color: #777;\n");
      out.write("      text-decoration: none;\n");
      out.write("  }  \n");
      out.write("  .form-control {\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  textarea {\n");
      out.write("      resize: none;\n");
      out.write("  }\n");
      out.write("#p\n");
      out.write("{\n");
      out.write("background-color:white;\n");
      out.write("margin-top: 0px;\n");
      out.write("margin-bottom: 0px;\n");
      out.write("margin-right: 100px;\n");
      out.write("margin-left: 50px;\n");
      out.write("border-radius: 25px;\n");
      out.write("    border: 2px solid black;\n");
      out.write("    padding: 20px; \n");
      out.write("box-shadow: 5px 10px 20px black;\n");
      out.write("color:black;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("  display: inline-block;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  background-color: #555;\n");
      out.write("  border: none;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 28px;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 200px;\n");
      out.write("  transition: all 0.5s;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span {\n");
      out.write("  cursor: pointer;\n");
      out.write("  display: inline-block;\n");
      out.write("  position: relative;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span:after {\n");
      out.write("  content: '\\00bb';\n");
      out.write("  position: absolute;\n");
      out.write("  opacity: 0;\n");
      out.write("  top: 0;\n");
      out.write("  right: -20px;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span {\n");
      out.write("  padding-right: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span:after {\n");
      out.write("  opacity: 1;\n");
      out.write("  right: 0;\n");
      out.write("}\n");
      out.write("a,a:hover{\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("select{\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("       .one, .two, .three{\n");
      out.write("    position:absolute;\n");
      out.write("\tmargin-top:-10px;\n");
      out.write("\tz-index:1;\n");
      out.write("\theight:40px;\n");
      out.write("\twidth:40px;\n");
      out.write("\tborder-radius:25px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".one{\n");
      out.write("\tleft:25%;\n");
      out.write("}\n");
      out.write(".two{\n");
      out.write("\tleft:50%;\n");
      out.write("}\n");
      out.write(".three{\n");
      out.write("\tleft:75%;\n");
      out.write("}\n");
      out.write(".primary-color{\n");
      out.write("\tbackground-color:black;\n");
      out.write("}\n");
      out.write(".success-color{\n");
      out.write("\tbackground-color:#5cb85c;\n");
      out.write("}\n");
      out.write(".danger-color{\n");
      out.write("\tbackground-color:#d9534f;\n");
      out.write("}\n");
      out.write(".warning-color{\n");
      out.write("\tbackground-color:#f0ad4e;\n");
      out.write("}\n");
      out.write(".info-color{\n");
      out.write("\tbackground-color:#5bc0de;\n");
      out.write("}\n");
      out.write(".no-color{\n");
      out.write("\tbackground-color:inherit;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write(" <body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\"><B>COLLEGE APPLICATION APPROVAL</B></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"std_login.jsp\">HOME</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"student.jsp\">LOG OUT</a></li>\n");
      out.write("        \n");
      out.write("             </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("     <br><br>\n");
      out.write("     <div id=\"p\">\n");
      out.write("         \n");
      out.write("     <h1 align=\"center\">Application Status</h1>\n");
      out.write("        ");
 
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
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("           <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Approved</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one success-color\"></div><div class=\"two success-color\"></div><div class=\"three success-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 100%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       ");
 }
else if(permit.equals("bApprove"))
        {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("             <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Partially Approved</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one success-color\"></div><div class=\"two success-color\"></div><div class=\"three success-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 78%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("       ");
 }
else if(permit.equals("aApprove"))
        {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("             <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Approved By Faculty</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one success-color\"></div><div class=\"two success-color\"></div><div class=\"three success-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 52%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("       ");
 }
else if(permit.equals("Declined1"))
        {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Declined By Faculty</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one primary-color\"></div><div class=\"two no-color\"></div><div class=\"three no-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 25%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("       ");
 }
else if(permit.equals("Declined3"))
        {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Declined By Head</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one success-color\"></div><div class=\"two success-color\"></div><div class=\"three primary-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 25%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("       ");
 }

else if(permit.equals("Declined2"))  { 
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Declined By Coordinator</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one success-color\"></div><div class=\"two primary-color\"></div><div class=\"three no-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 52%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("       ");
 }
else if(permit.equals("not seen"))
        {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        <p align=\"center\" style=\"font-family:algerian; font-size:50px\">Not Seen</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\"><br />\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("    \t<div class=\"progress\">\n");
      out.write("            \n");
      out.write("        <div class=\"one success-color\"></div><div class=\"two success-color\"></div><div class=\"three success-color\"></div>\n");
      out.write("  \t\t\t<div class=\"progress-bar\" style=\"width: 25%;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("       ");
 }

}
else
                 {
                     out.print("not found");
                 }
        
      out.write("\n");
      out.write("  <P align=\"center\"style=\"font-family:Times New Roman; font-size:30px\">FACULTY&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CO ORDINATOR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HEAD</p>      \n");
      out.write("    <br><br>\n");
      out.write("     </div>\n");
      out.write("     </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
