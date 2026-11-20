<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>

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

                <h2 class="text-center mb-4">Registration Form</h2>

                <form name="registration" method="post" action="RegisterController">

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

                    <!-- First Name -->
                    <div class="mb-3">
                        <label for="firstname" class="form-label">
                            First Name
                        </label>
                        <input type="text"
                               class="form-control"
                               id="firstname"
                               name="firstname"
                               placeholder="Enter first name">
                    </div>

                    <!-- Last Name -->
                    <div class="mb-3">
                        <label for="lastname" class="form-label">
                            Last Name
                        </label>
                        <input type="text"
                               class="form-control"
                               id="lastname"
                               name="lastname"
                               placeholder="Enter last name">
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

                    <!-- Confirm Password -->
                    <div class="mb-3">
                        <label for="confirmPassword" class="form-label">
                            Confirm Password
                        </label>
                        <input type="password"
                               class="form-control"
                               id="confirmPassword"
                               name="confirmPassword"
                               placeholder="Confirm password">
                    </div>

                    <!-- Submit Button -->
                    <div class="d-grid">
                       <button type="submit" class="btn btn-primary">
                            Submit
                        </button>
                    </div>
                    <a href="./login.jsp">Already Registered!!!</a>

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