<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>

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

                <h2 class="text-center mb-4">Login Form</h2>
                

                <form name="login from" method="post" action="LoginController">

                    <!-- Username -->
                    <div class="mb-3">
                        <label for="username" class="form-label">
                            Username
                        </label>
                        <input type="text"
                               class="form-control"
                               id="username"
                               name="username"
                               placeholder="Enter username">
                    </div>

                    <!-- Password -->
                    <div class="mb-3">
                        <label for="password" class="form-label">
                            Password
                        </label>
                        <input type="password"
                               class="form-control"
                               id="password"
                               name="password"
                               placeholder="Enter password">
                    </div>

                    <!-- Submit Button -->
                    <div class="d-grid">
                        <button type="submit" class="btn btn-primary">
                            Login
                        </button>
                    </div>
                    <a href="./index.jsp">New User!!!</a>
                </form>

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