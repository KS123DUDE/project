package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class app_005fsub_jsp extends org.apache.jasper.runtime.HttpJspBase
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

            
            
            String permit = request.getParameter("permit");
            String sub=(String)session.getAttribute("sub");
            String id=(String)session.getAttribute("id");
            String pos=(String)session.getAttribute("pos");
            String myurl="jdbc:mysql://localhost/acadview";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="update app set permit='"+permit+"' where subject='"+sub+"' and id='"+id+"'";
                if(pos.equals("low")&&permit.equals("Approve"))
                query1="update app set permit='aApprove' where subject='"+sub+"' and id='"+id+"'";
                else if(pos.equals("low")&&permit.equals("Declined"))
                query1="update app set permit='Declined1' where subject='"+sub+"' and id='"+id+"'";
                else if(pos.equals("mid")&&permit.equals("Approve"))
                query1="update app set permit='bApprove' where subject='"+sub+"' and id='"+id+"'";
                else if(pos.equals("mid")&&permit.equals("Declined"))
                query1="update app set permit='Declined2' where subject='"+sub+"' and id='"+id+"'";
                else if(pos.equals("high")&&permit.equals("Approve"))
                query1="update app set permit='cApprove' where subject='"+sub+"' and id='"+id+"'";
                else if(pos.equals("high")&&permit.equals("Declined"))
                query1="update app set permit='Declined3' where subject='"+sub+"' and id='"+id+"'";
                else
                    query1="update app set permit='"+permit+"' where subject='"+sub+"' and id='"+id+"'";
                PreparedStatement prst=conn.prepareStatement(query1);
                int i=prst.executeUpdate();
                if(i==1)
            out.println("<script>alert('Changes Successful');setTimeout(function(){window.location='list_app.jsp'},1*1000);</script>");
         
                 else
            
                out.println("<script>alert('Changes Unsuccessful');setTimeout(function(){window.location='list_app.jsp'},1*1000);</script>");
            


      out.write("                \n");
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
