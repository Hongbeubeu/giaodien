<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <meta name="description" content="OneTech shop project">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
        <link href="plugins/fontawesome-free-5.0.1/css/fontawesome-all.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/contact_styles.css">
        <link rel="stylesheet" type="text/css" href="styles/contact_responsive.css">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
         <!-- Contact Form -->
            <div class="contact_form" align="center">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-10 offset-lg-1">
                            <div class="contact_form_container">
                                <div class="contact_form_title">Login</div>
                                <form action="#" id="contact_form">                                                                          
                                    <input type="text" id="contact_form_email" class="contact_form_email input_field" placeholder="Your email" required="required" data-error="Email is required."><br/>
                                    <input type="password" id="contact_form_name" class="contact_form_phone input_field" placeholder="Your password">
                                    <div class="contact_form_button">
                                        <button type="submit" class="button contact_submit_button">Login</button><br>
                                         <a href="Register.jsp">Register</a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel"></div>
            </div>
         <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
