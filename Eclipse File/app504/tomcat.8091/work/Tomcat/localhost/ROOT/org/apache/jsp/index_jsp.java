/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2021-08-13 14:09:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\t\r\n");
      out.write("        <TITLE>Home Page</TITLE>\r\n");
      out.write("        \r\n");
      out.write("\t\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"css/Home Page.css\"></link>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class = \"header\">\r\n");
      out.write("\t\t\t<FONT SIZE=\"4\" FACE=\"Algerian\" COLOR=\"white\"><CENTER><h1>Prestige Institute of Engineering,<br> Management & Research<br> Mumbai</h1><CENTER></FONT>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("            <FONT FACE=\"arial\" COLOR=\"#00008B\"> <CENTER><h2>Permanently Affilated to University of Mumbai</h2>\r\n");
      out.write("\t\t\t\t<font size = \"3\" color = \"black\" >   Appooved By AICTE , Accredited by NBA<br>\r\n");
      out.write("\t\t\t\t\t<font size = \"2\" >(Recognized by UGC under the sections 2(f) and 12(B) of the UGC act 1956)</font>\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</CENTER>\r\n");
      out.write("\t\t\t</FONT>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr style = \"border-top: 2px solid black;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <MARQUEE BEHAVIOUR=\"SLIDE\"><BIG><b><a href = \"registrationPage.jsp\" target = \"blank\"> Admissions open for year 2021-2022! Click here for registration. </a></b></BIG>  </MARQUEE>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <BODY style =\"background:linear-gradient(135deg, #71b7e6, #9b59b6)\"><CENTER>\r\n");
      out.write("\t\t<div id = \"logo\">\r\n");
      out.write("\t\t\t<img src = \"images/Logo.jpg\" height = \"110px\" width = \"auto\" border = 2%;>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    <ul class = \"ul\">\r\n");
      out.write("\t\t<li><a class=\"cd\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t<li><a class=\"cd\" href=\"About Us.html\">About us</a></li>\r\n");
      out.write("\t\t<li><a class=\"cd\" href=\"registrationPage.jsp\" target=\"blank\">Registration Page</a></li>\r\n");
      out.write("\t\t<li><a class=\"cd\" href=\"Contact Details.html\">Contact us</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("           \r\n");
      out.write("\t<div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("  <br>\r\n");
      out.write("  \r\n");
      out.write("\t<div id=\"slideshow\">\r\n");
      out.write("\t\t<div class=\"slide-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"slide-number\">\r\n");
      out.write("          \r\n");
      out.write("\t\t\t\t\t\t<div class=\"mySlides fade\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"numbertext\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/College.jpg\" style=\"width:auto\", \"height:800px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text\">Campus</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t\t<h1 class=\"slide-number\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mySlides fade\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"numbertext\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/Library.jpg\" style=\"width:auto\", \"height:800px\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text\">Library</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t<h1 class=\"slide-number\">\r\n");
      out.write("\t\t\t\t<div class=\"mySlides fade\">\r\n");
      out.write("\t\t\t\t\t<div class=\"numbertext\"></div>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/Student.jpg\" style=\"width:800px\", \"height:800px\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text\">student</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t<h1 class=\"slide-number\">\r\n");
      out.write("\t\t\t\t<div class=\"mySlides fade\">\r\n");
      out.write("\t\t\t\t\t<div class=\"numbertext\"></div>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/Class.jpg\" style=\"width:1000px\", \"height:800px\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text\">Classes</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("    </div> \r\n");
      out.write("\t\r\n");
      out.write("\t<h2>Vision</h2>\r\n");
      out.write("\t<p>\r\n");
      out.write("\tSocial Transformation Through Dynamic Education. \r\n");
      out.write("\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2>Mission</h2>\r\n");
      out.write("\t<p style = \"text-align:center\">\r\n");
      out.write("\tTo impart quality education to meet the needs of industry, profession and society; and to achieve excellence in teaching, learning and research.\r\n");
      out.write("\tThe college fosters academic and career success through the development of critical thinking, effective communication, creativity, and cultural awareness in a safe, accessible and affordable learning environment.\r\n");
      out.write("\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<h2>Course Details</h2>\r\n");
      out.write("\r\n");
      out.write("    <table align=\"center\" BGCOLOR=\"00CCCC\" border=\"20\" cellspacing=\"2\" cellpadding=\"5\" width=\"900\", height=\"100\">\r\n");
      out.write("        <tr text align =\"center\">\r\n");
      out.write("        <th>Courses</th><th>Course Duration</th><th>Intake</th><th>Registration Fee</th><th>Anual Course Fees</th><th>Head of Department</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr text align =\"center\">\r\n");
      out.write("        <td>Civil Engineering</td><td>4 years</td><td>20</td><td>10000</td><td>75000</td><td>B.L.Gupta</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr text align =\"center\">\r\n");
      out.write("        <td>Computer Engineering</td><td>4 years</td><td>10</td><td>10000</td><td>100000</td><td>S.D.Deshmukh</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr text align =\"center\">\r\n");
      out.write("        <td>Electrical Engineering</td><td>4 years</td><td>10</td><td>10000</td><td>85000</td><td>Chandrakant Dubey</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr text align =\"center\">\r\n");
      out.write("        <td>Mechnical Engineering</td><td>4 years</td><td>15</td><td>10000</td><td>88000</td><td>Nithin Kumar</td>\r\n");
      out.write("        </tr>  \r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("\t<h2>Placement & Alumni</h2> \r\n");
      out.write("\r\n");
      out.write("    <p style=\"text-align:justify\">\r\n");
      out.write("        The Placement Cell plays a crucial role in locating job opportunities for Under Graduates and Post Graduates passing out from the college by keeping in touch with reputed firms and industrial establishments. The Placement Cell operates round the year to facilitate contacts between companies and graduates. The number of students placed through the campus interviews is continuously rising. On invitation, many reputed industries visit the institute to conduct interviews.\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        We have been successful in maintaining our high placement statistics over the years and the fact that our students bear the recession blues with record breaking placements itself is a testimony to our quality. Our ingenious alumnae have set new standards in the corporate world through their estimable contributions and it is my firm conviction that we will continue that legacy in the years to come.\r\n");
      out.write("    </p>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t <img src=\"images/Placement.jpg\" alt=\"alt text\" style=\"float:\",height=\"750px\", width=\"750px\" border = \"5%\">\r\n");
      out.write("\t \r\n");
      out.write("\t <br>\r\n");
      out.write("\t <br>\r\n");
      out.write("\t \r\n");
      out.write("\t <h2>Achievements & Awards</h2>\r\n");
      out.write("\t \r\n");
      out.write("\t <p style=\"text-align:justify\">\r\n");
      out.write("\t Prestige Institute won the 2020 John L. Blackburn Exemplary Models Award from the American Association of University Administrators (AAUA) for our innovative Prep for Success program. Created by our Center for Career and Professional Development, the program helps students with everything from the most basic job-search skills to valuable work experience through paid internships with leading organizations.\r\n");
      out.write("\t </p>\r\n");
      out.write("\t \r\n");
      out.write("\t <div class = \"award\">\r\n");
      out.write("\t  <img src=\"images/Award1.jpg\" alt=\"alt text\" height=\"200px\", width=\"auto\" border = \"5%\">\r\n");
      out.write("\t  <img src=\"images/Award2.jpg\" alt=\"alt text\" height=\"200px\", width=\"auto\" border = \"5%\">\r\n");
      out.write("\t  <img src=\"images/Award3.jpg\" alt=\"alt text\" height=\"200px\", width=\"auto\" border = \"5%\">\r\n");
      out.write("\t </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class = \"footer\">\r\n");
      out.write("    <footer>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("        <p>\r\n");
      out.write("\t\t\t<font color = \"white\">@copyright Prestige Institute</font>\r\n");
      out.write("        </p>\r\n");
      out.write("\t\t\r\n");
      out.write("    </footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
}
