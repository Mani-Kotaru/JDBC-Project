<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Page</title>

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

            <!-- Form - 6 Columns -->
            <div class="col-md-6">
                
	                <h2>Contact Page</h2>
	                <h2>welcome to <%= session.getAttribute("user") %></h2>
               
            </div>

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