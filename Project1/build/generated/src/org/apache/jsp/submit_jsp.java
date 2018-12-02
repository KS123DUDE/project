package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class submit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

           
            try{
                String admin = request.getParameter("to");
                String subject = request.getParameter("subject");
                String dept = request.getParameter("dept");
            String app = request.getParameter("comment");
            String urgent = request.getParameter("urgent");
            String id= request.getParameter("id");
            String myurl="jdbc:mysql://localhost/acadview";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                String query1="insert into app(admin,subject,dept,application,urgent,id)values(?,?,?,?,?,?)";
                
                PreparedStatement prst=conn.prepareStatement(query1);
                 prst.setString(1,admin);
                 prst.setString(2,subject);
                 prst.setString(3,dept);
                 prst.setString(4,app);
                 prst.setString(5, urgent);
                 prst.setString(6, id);
                 int i=prst.executeUpdate();
                
                
            if(i!=-1){
            out.println("<script>alert('Successfully Submitted');setTimeout(function(){window.location='std_login.jsp'},1*1000);</script>");
            }
            else 
            {
                 
                
      out.write("\n");
      out.write("                ");
      if (true) {
        _jspx_page_context.forward("student.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");

                
                 prst.close();
            
            }
}
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
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
