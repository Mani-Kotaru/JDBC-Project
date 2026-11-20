<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,java.util.ArrayList,com.vcube.model.StudentModel,com.vcube.dao.StudentDAO" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
          
</head>

<body class="d-flex flex-column min-vh-100">
   
    <%@ include file="navbar.jsp" %>
   
       

    <!-- Main Content -->
    <div class="container-fluid my-5 flex-grow-1">
        <div class="row">

            <!-- Empty First 3 Columns -->
            <div class="col-md-3"></div>
        <form name="home" method="get">
            <!-- Form - 6 Columns -->
            <div class="col-md-6">
               
	                <h2 >Home Page</h2>
	                <h2>welcome to <%= session.getAttribute("user") %></h2>
	                <label><a href="LogoutController" class="btn btn-warning">Logout</a></label>
	                <a  href="./contact.jsp" >contact page</a>
	                <table class="table table-striped table-hover table-dark">
	                <tr>
	                  <th>Username</th>
	                  <th>Firstname</th>
	                  <th>Lastname</th>
	                  <th>Password</th>
	                  <th colspan=2 style="text-align:center">Action</th>
	                </tr>
	    
	                <% List<StudentModel> list; 
	                 list=(List<StudentModel>)request.getAttribute("info");
	                 
	                     for(StudentModel li:list) {                                             
	                      %>
	                 <tr>
	                    <td><%= li.getUsername() %></td>
	                    <td><%= li.getFirstname() %></td>
	                    <td><%= li.getLastname() %></td>
	                    <td><%= li.getPassword() %></td>
	                   <td><a href="DisplayController?username=<%= li.getUsername()%>">update</a>
	                     <a href="DeleteController?username=<%= li.getUsername()%>"
	                     onclick="return confirm('Are you sure you want to delete this student?');">delete</a></td>
	                  </tr>
	                  <% } %>
	                
	                
	                </table>
               
            </div>
           </form>
            <!-- Empty Last 3 Columns -->
            <div class="col-md-3"></div>

        </div>
    </div>


     <%@ include file="footer.jsp" %>
    <!-- Bootstrap 5 JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
    </script>

</body>
</html>