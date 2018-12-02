package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            System.out.println("hello");
           
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dob = request.getParameter("dob");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String ques1=request.getParameter("ques1");
            String ans1=request.getParameter("a1");
            String ques2=request.getParameter("ques2");
            String ans2=request.getParameter("a2");
            
            String myurl="jdbc:mysql://localhost/acadview";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                String query1="insert into student values(?,?,?,?,?,?,?,?,?)";
                
                PreparedStatement prst=conn.prepareStatement(query1);
                 prst.setString(1,id);
                 prst.setString(2,name);
                 prst.setString(3,dob);
                 prst.setString(4,user);
                 prst.setString(5, pass);
                 prst.setString(6, ques1);
                 prst.setString(7, ans1);
                 prst.setString(8, ques2);
                 prst.setString(9, ans2);
                 try{
                 prst.executeUpdate();
                        
            out.println("<script>alert('Registration is Successful');setTimeout(function(){window.location='student.jsp'},1*1000);</script>");
                 
//Please Login Here <a href='student.jsp'>    
       }
            //prst.close();

            catch(Exception e)
            {
                out.println("<script>alert('User already exists');setTimeout(function(){window.location='signup.html'},1*1000);</script>");
            }
   
        
      out.write("\n");
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
