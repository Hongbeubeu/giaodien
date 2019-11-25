package org.apache.jsp.admin.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Favicon icon -->\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../assets/images/favicon.png\">\n");
      out.write("    <title>DASHBOARD</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../assets/node_modules/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../assets/node_modules/perfect-scrollbar/css/perfect-scrollbar.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- This page CSS -->\n");
      out.write("    <!-- chartist CSS -->\n");
      out.write("    <link href=\"../assets/node_modules/morrisjs/morris.css\" rel=\"stylesheet\">\n");
      out.write("    <!--c3 CSS -->\n");
      out.write("    <link href=\"../assets/node_modules/c3-master/c3.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Dashboard 1 Page CSS -->\n");
      out.write("    <link href=\"css/pages/dashboard1.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- You can change the theme colors from here -->\n");
      out.write("    <link href=\"css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header fix-sidebar card-no-border\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Container fluid  -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Bread crumb and right sidebar toggle -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row page-titles\">\n");
      out.write("                    <div class=\"col-md-5 align-self-center\">\n");
      out.write("                        <h3 class=\"text-themecolor\">Dashboard</h3>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Bread crumb and right sidebar toggle -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Sales Chart and browser state-->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"d-flex no-block\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5 class=\"card-title m-b-0\">Sales Chart</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"ml-auto\">\n");
      out.write("                                        <ul class=\"list-inline text-center font-12\">\n");
      out.write("                                            <li><i class=\"fa fa-circle text-success\"></i> SITE A</li>\n");
      out.write("                                            <li><i class=\"fa fa-circle text-info\"></i> SITE B</li>\n");
      out.write("                                            <li><i class=\"fa fa-circle text-primary\"></i> SITE C</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\" id=\"sales-chart\" style=\"height: 355px;\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"d-flex m-b-30 no-block\">\n");
      out.write("                                    <h5 class=\"card-title m-b-0 align-self-center\">Our Visitors</h5>\n");
      out.write("                                    <div class=\"ml-auto\">\n");
      out.write("                                        <select class=\"custom-select b-0\">\n");
      out.write("                                            <option selected=\"\">Today</option>\n");
      out.write("                                            <option value=\"1\">Tomorrow</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"visitor\" style=\"height:260px; width:100%;\"></div>\n");
      out.write("                                <ul class=\"list-inline m-t-30 text-center font-12\">\n");
      out.write("                                    <li><i class=\"fa fa-circle text-purple\"></i> Tablet</li>\n");
      out.write("                                    <li><i class=\"fa fa-circle text-success\"></i> Desktops</li>\n");
      out.write("                                    <li><i class=\"fa fa-circle text-info\"></i> Mobile</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Sales Chart -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Projects of the Month -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"d-flex\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5 class=\"card-title\">Projects of the Month</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"ml-auto\">\n");
      out.write("                                        <select class=\"custom-select b-0\">\n");
      out.write("                                            <option selected=\"\">January</option>\n");
      out.write("                                            <option value=\"1\">February</option>\n");
      out.write("                                            <option value=\"2\">March</option>\n");
      out.write("                                            <option value=\"3\">April</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"table-responsive m-t-20 no-wrap\">\n");
      out.write("                                    <table class=\"table vm no-th-brd pro-of-month\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th colspan=\"2\">Assigned</th>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Budget</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td style=\"width:50px;\"><span class=\"round\">S</span></td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <h6>Sunil Joshi</h6><small class=\"text-muted\">Web Designer</small></td>\n");
      out.write("                                                <td>Elite Admin</td>\n");
      out.write("                                                <td>$3.9K</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr class=\"active\">\n");
      out.write("                                                <td><span class=\"round\"><img src=\"../assets/images/users/2.jpg\" alt=\"user\" width=\"50\"></span></td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <h6>Andrew</h6><small class=\"text-muted\">Project Manager</small></td>\n");
      out.write("                                                <td>Real Homes</td>\n");
      out.write("                                                <td>$23.9K</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td><span class=\"round round-success\">B</span></td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <h6>Bhavesh patel</h6><small class=\"text-muted\">Developer</small></td>\n");
      out.write("                                                <td>MedicalPro Theme</td>\n");
      out.write("                                                <td>$12.9K</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td><span class=\"round round-primary\">N</span></td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <h6>Nirav Joshi</h6><small class=\"text-muted\">Frontend Eng</small></td>\n");
      out.write("                                                <td>Elite Admin</td>\n");
      out.write("                                                <td>$10.9K</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td><span class=\"round round-warning\">M</span></td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <h6>Micheal Doe</h6><small class=\"text-muted\">Content Writer</small></td>\n");
      out.write("                                                <td>Helping Hands</td>\n");
      out.write("                                                <td>$12.9K</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"up-img\" style=\"background-image:url(../assets/images/big/img1.jpg)\"></div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\" card-title\">Business development of rules</h5>\n");
      out.write("                                <span class=\"label label-info label-rounded\">Technology</span>\n");
      out.write("                                <p class=\"m-b-0 m-t-20\">Titudin venenatis ipsum aciat. Vestibu ullamer quam. nenatis ipsum ac feugiat. Ibulum ullamcorper.</p>\n");
      out.write("                                <div class=\"d-flex m-t-20\">\n");
      out.write("                                    <a class=\"link\" href=\"javascript:void(0)\">Read more</a>\n");
      out.write("                                    <div class=\"ml-auto align-self-center\">\n");
      out.write("                                        <a href=\"javascript:void(0)\" class=\"link m-r-10\"><i class=\"fa fa-heart-o\"></i></a>\n");
      out.write("                                        <a href=\"javascript:void(0)\" class=\"link m-r-10\"><i class=\"fa fa-share-alt\"></i></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Projects of the Month -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Notification And Feeds -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Start Notification -->\n");
      out.write("                    <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                        <div class=\"card card-body mailbox\">\n");
      out.write("                            <h5 class=\"card-title\">Notification</h5>\n");
      out.write("                            <div class=\"message-center ps ps--theme_default ps--active-y\" data-ps-id=\"a045fe3c-cb6e-028e-3a70-8d6ff0d7f6bd\">\n");
      out.write("                                <!-- Message -->\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"btn btn-danger btn-circle\"><i class=\"fa fa-link\"></i></div>\n");
      out.write("                                    <div class=\"mail-contnet\">\n");
      out.write("                                        <h5>Luanch Admin</h5> <span class=\"mail-desc\">Just see the my new admin!</span> <span class=\"time\">9:30 AM</span> </div>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Message -->\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"btn btn-success btn-circle\"><i class=\"fa fa-calendar-check-o\"></i></div>\n");
      out.write("                                    <div class=\"mail-contnet\">\n");
      out.write("                                        <h5>Event today</h5> <span class=\"mail-desc\">Just a reminder that you have event</span> <span class=\"time\">9:10 AM</span> </div>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Message -->\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"btn btn-info btn-circle\"><i class=\"fa fa-cog\"></i></div>\n");
      out.write("                                    <div class=\"mail-contnet\">\n");
      out.write("                                        <h5>Settings</h5> <span class=\"mail-desc\">You can customize this template as you want</span> <span class=\"time\">9:08 AM</span> </div>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Message -->\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"btn btn-primary btn-circle\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("                                    <div class=\"mail-contnet\">\n");
      out.write("                                        <h5>Pavan kumar</h5> <span class=\"mail-desc\">Just see the my admin!</span> <span class=\"time\">9:02 AM</span> </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Notification -->\n");
      out.write("                    <!-- Start Feeds -->\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Feeds</h5>\n");
      out.write("                                <ul class=\"feeds\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-info\"><i class=\"fa fa-bell-o\"></i></div> You have 4 pending tasks. <span class=\"text-muted\">Just Now</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-success\"><i class=\"fa fa-server\"></i></div> Server #1 overloaded.<span class=\"text-muted\">2 Hours ago</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-warning\"><i class=\"fa fa-shopping-cart\"></i></div> New order received.<span class=\"text-muted\">31 May</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-danger\"><i class=\"fa fa-user\"></i></div> New user registered.<span class=\"text-muted\">30 May</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-inverse\"><i class=\"fa fa-bell-o\"></i></div> New Version just arrived. <span class=\"text-muted\">27 May</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-info\"><i class=\"fa fa-bell-o\"></i></div> You have 4 pending tasks. <span class=\"text-muted\">Just Now</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-danger\"><i class=\"fa fa-user\"></i></div> New user registered.<span class=\"text-muted\">30 May</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-inverse\"><i class=\"fa fa-bell-o\"></i></div> New Version just arrived. <span class=\"text-muted\">27 May</span></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"bg-light-primary\"><i class=\"fa fa-cog\"></i></div> You have 4 pending tasks. <span class=\"text-muted\">27 May</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Feeds -->\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Notification And Feeds -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Page Content -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("            </div>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- End Container fluid  -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- footer -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <footer class=\"footer\"> © 2018 Adminwrap by wrappixel.com </footer>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- End footer -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Page wrapper  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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