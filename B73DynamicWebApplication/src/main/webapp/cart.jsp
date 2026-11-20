<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Cart</title>
</head>

<body>

<h1>My Shopping Cart</h1>

<%
    ArrayList<String> cart =
        (ArrayList<String>) session.getAttribute("cart");

    if (cart == null || cart.isEmpty()) {
%>

        <h3>Your cart is empty.</h3>

<%
    } else {
%>

        <h3>Products in Cart:</h3>

        <%
            for (String item : cart) {
        %>

            <p><%= item %></p>

        <%
            }
        %>

<%
    }
%>

<br>

<a href="Products.jsp">Continue Shopping</a>

</body>
</html>