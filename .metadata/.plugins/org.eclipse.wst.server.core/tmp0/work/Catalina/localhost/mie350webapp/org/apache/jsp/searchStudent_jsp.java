/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2017-10-29 22:42:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mie.model.*;

public final class searchStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1506720722000L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1507258860000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>MIE350 Sample Web App - Search Students</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Date Picker Javascript -->\r\n");
      out.write("<!-- https://jqueryui.com/datepicker/ -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\"#myNavbar\">\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\">MIE350 Sample Web App</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\thref=\"/mie350webapp/StudentController?action=listStudent\">Student\r\n");
      out.write("\t\t\t\t\t\tList (Public)</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"searchStudent.jsp\">Search A Student</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\thref=\"helpful_links.jsp\">Other Links<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sample_html.jsp\">Sample HTML Tags</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"helpful_links.jsp\">Other Helpful Links</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.w3schools.com/html/default.asp\">HTML\r\n");
      out.write("\t\t\t\t\t\t\t\tTutorial</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.w3schools.com/bootstrap/\">BootStrap\r\n");
      out.write("\t\t\t\t\t\t\t\tCSS Tutorial</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!-- The following code can be added to include a Login button to the right-hand side of the navbar-->\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		Member member = (Member) session.getAttribute("currentSessionUser");

		String username = (String) session.getAttribute("username");
		String firstname = (String) session.getAttribute("firstname");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid text-center\">\r\n");
      out.write("\t\t<div class=\"row content\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-2 sidenav\">\r\n");
      out.write("\t\t\t\t<!-- You can put left sidebar links here if you want to. -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-8 text-left\">\r\n");
      out.write("\t\t\t\t<h1>Search A Student</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tType in any keyword to search for student information (last name,\r\n");
      out.write("\t\t\t\tfirst name, email) that matches the keyword. <Br />\r\n");
      out.write("\t\t\t\t<Br />\r\n");
      out.write("\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t<form method=\"POST\" action='SearchController' name=\"frmAddUser\">\r\n");
      out.write("\t\t\t\t\t\tKeyword: <input type=\"text\" name=\"keyword\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\"><input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-info\" value=\"Submit\" />\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2 sidenav\">\r\n");
      out.write("\t\t\t\t<!-- You can put right sidebar links here if you want to. -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<footer class=\"container-fluid text-center\">\r\n");
      out.write("\t<p>\r\n");
      out.write("\t\tThis sample web app is for demonstration purposes only. <br>\r\n");
      out.write("\t\tMIE350 Sample Web Application &#169;\r\n");
      out.write("\t\t");
      out.print(new java.text.SimpleDateFormat("yyyy")
					.format(new java.util.Date()));
      out.write("\r\n");
      out.write("\t\tUniversity of Toronto <br /> Bootstrap Theme &#169; <a\r\n");
      out.write("\t\t\thref=\"http://getbootstrap.com/\">Bootstrap</a><br /> JavaScript for\r\n");
      out.write("\t\tTable Sorting &#169; <a\r\n");
      out.write("\t\t\thref=\"https://kryogenix.org/code/browser/sorttable/\">Stuart\r\n");
      out.write("\t\t\tLangridge</a><br />\r\n");
      out.write("\t\t\tJavaScript for Date Picker &#169; <a href=\"https://jqueryui.com/datepicker/\">https://jqueryui.com/datepicker/</a>\r\n");
      out.write("\t</p>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /searchStudent.jsp(53,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.searchword}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
