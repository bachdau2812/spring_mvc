/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.30
 * Generated at: 2024-12-24 14:25:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<title>San pham</title>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${products.size() }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("	<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idCategory }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("	<div class=\"well well-small\">\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("		<span style=\"margin-left: 25px;\"> Our Products</span>\r\n");
      out.write("			<select class=\"pull-right\">\r\n");
      out.write("				<option>A - Z</option>\r\n");
      out.write("				<option>Low - High</option>\r\n");
      out.write("				<option>High - Low</option>\r\n");
      out.write("			</select>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<h3>Our Products</h3>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/a.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/b.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/c.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/d.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/e.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/f.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/g.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/h.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/i.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/a.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/b.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/c.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
