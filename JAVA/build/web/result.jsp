<%@page import="org.hibernate.Session"%>
<%@page import="java.util.List"%>
<%@page import="backend.Responses"%>
<%@page import="backend.NewHibernateUtil"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="assest/css/materialize.css"  media="screen,projection"/>
        <link rel="stylesheet" type="text/css" href="assest/css/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>GDGJSS|feedback form</title>
       
    </head>
    <!-- header starts here -->
    <body background="assest/images/backgroundsmall.jpg" >
        <div class="row">
            <div class="row">
                <div class="col s12 light-blue" style="display:inline-block"><h3 class="white-text center" style="font-weight:500"> Google Developers Group</h3>
                </div>
                <div class="col s12 light-blue" style="display:inline-block"><h5 class="white-text center" style="font-weight:500"> JSS NOIDA</h5>
                </div>
                <div class="col s12 light-blue" ><div class="col s6 m4"><h6 class="white-text left"><% String name; name=request.getParameter("event"); out.print(name); %> </h6></div><div class="col m4 hide-on-small-only"><h6 class="white-text center"> Feedback Form</h6></div><div class="col s6 m4"><h6><a class="white-text right hoverable" href="http://gdgjss.in">gdgjss.in</a></h6></div>
                </div>
            </div>
            <!-- header ends here -->
        </div>

                
                
        <!-- feedback form starts here -->
        <div class="row  purple lighten-5 hoverable" >
            <table class="highlight centered responsive-table">
        <thead>
          <tr>
              <th data-field="id">Name</th>
              <th data-field="name">Item Name</th>
              <th data-field="price">Item Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Alvin</td>
            <td>Eclair</td>
            <td>$0.87</td>
          </tr>
          <tr>
            <td>Alan</td>
            <td>Jellybean</td>
            <td>$3.76</td>
          </tr>
          <tr>
            <td>Jonathan</td>
            <td>Lollipop</td>
            <td>$7.00</td>
          </tr>
        </tbody>
      </table>
        </div>
        <!-- feedback form ends here -->


        <!-- footer starts here -->
        <footer class="page-footer light-blue darken-1">
            <div>
                <div class="row footer_row" style="margin-bottom: 0px">
                    <div class="col s12">
                        <h6 class="white-text center">Response to all fields is mandatory.</h6>
                        <div class="row container">
                            <div class="col s6 center">
                                <ul>
                                    <li></li>
                                     <button class="btn waves-effect waves-light light-blue darken-4 centre-align hoverable c" type="submit" name="action">Submit Form</button></li>
                                    
                                </ul>
                            </div>
                            <div class="col s6 center">
                                <ul>
                                    <li></li>
                                    <form action="feedbackform.jsp"><li><button class="btn waves-effect waves-light light-blue darken-4 centre-align hoverable " type="submit" name="action">Reset Form</button></li></ul>
                                    <input type="hidden" name="event" value="${name1}">
                                </form> </div>
                        </div>
                    </div>
                </div>
        </footer>
        <!-- footer ends here -->

        <script src="assest/js/jQuery.js"></script>
        <script src="assest/js/materialize.js"></script> 

    </body>
</html>
