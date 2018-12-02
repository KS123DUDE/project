package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_005fapp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <head>\n");
      out.write("     <style>\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    color:black;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid #dddddd;\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write(".button {border-radius: 50%;\n");
      out.write("display: inline-block;\n");
      out.write("  padding: 15px 25px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  border: none;\n");
      out.write("  \n");
      out.write("  box-shadow: 0 9px #999;}\n");
      out.write(".button:hover {background-color: #3e8e41}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  background-color: #3e8e41;\n");
      out.write("  box-shadow: 0 5px #666;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}\n");
      out.write(" body {\n");
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
      out.write("\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
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
      out.write("        <li><a href=\"fac_login.jsp\">HOME</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"faculty_login.html\">LOG OUT</a></li>\n");
      out.write("        \n");
      out.write("             </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>    <br><br><br>\n");
      out.write("        <div id=\"p\">\n");
      out.write("        <p align=\"center\" style=\"font-family: algerian ;font-size:50px; color: black\">Applications Received</h1></p>\n");
      out.write("        <hr>\n");
      out.write("                ");

                    try{
            String user = (String)session.getAttribute("username");
            
            
            String myurl="jdbc:mysql://localhost/acadview";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="select * from app where dept='"+user+"'";
                ResultSet rs=st.executeQuery(query1);
                String pos=(String)session.getAttribute("pos");
                if(pos.equals("high"))
                query1="select * from app where dept='"+user+"' and permit='bApprove'";
                else if(pos.equals("mid"))
                query1="select * from app where dept='"+user+"' and permit='aApprove'";
                else
                query1="select * from app where dept='"+user+"' and permit is NULL";
                    
                rs=st.executeQuery(query1);
                

    
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("function myFunction(o,int j) {\n");
      out.write(" \n");
      out.write("      session.setAttribute(\"permit\",o.value);\n");
      out.write("      session.setAttribute(\"id\",ida[j]);\n");
      out.write("session.setAttribute(\"sub\",sub[j]);\n");
      out.write(" \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<br>\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("         <td><b>ID</b></td>\n");
      out.write("         <td><b>Subject</b></td>\n");
      out.write("         <td><b>Data</b></td>\n");
      out.write("         <td><b>Permission</b></td>\n");
      out.write("         <td><b></b></td>\n");
      out.write("    </tr>\n");
      out.write("     ");
  String ida[]=new String[100];
         String sub[]=new String[100];
         String app[]=new String[100];
         String per[]=new String[100];
         String subm[]=new String[100];
         int i=0;
         while(rs.next())
                {
                    ida[i]=rs.getString("id");
                    sub[i]=rs.getString("subject");
                    app[i]=rs.getString("application");
                    per[i]=null;
                    subm[i]="submit";
                    i++;
                }
         for(int j=0;j<i;j++)
         {
                    
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");

            out.print(ida[j]);
                
      out.write("</td>\n");
      out.write("    <td>");
//String sub=rs.getString("subject");
    out.print(sub[j]);
    
      out.write("</td>\n");
      out.write("    <td>");
//=rs.getString("application") 
        out.print(app[j]);
      out.write("</td>\n");
      out.write("    <td><form action=\"app_sub.jsp\" name=\"app_sub\">Approve: <input type=\"radio\" name=\"permit\" value=\"Approve\" checked=\"yes\"> Decline: <input type=\"radio\" name=\"permit\" value=\"Declined\"></td>\n");
      out.write("            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" class=\"button\" onClick =");
session.setAttribute("id",ida[0]); session.setAttribute("sub",sub[0]);
      out.write("  ></form></td>\n");
      out.write("</tr>\n");
      out.write("               ");
 
                    }

      out.write("\n");
      out.write("</table>\n");

}

        catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
