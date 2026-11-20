<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
</head>

<body>

<h1>Online Shopping</h1>

	<%
	    String product = request.getParameter("product");
	    String price =  request.getParameter("price");
	
	    if (product != null && price != null) {
	
	        ArrayList<String> cart =
	            (ArrayList<String>) session.getAttribute("cart");
	
	        if (cart == null) {
	            cart = new ArrayList<String>();
	        }
	
	        cart.add(product + " - ₹" + price);
	
	        session.setAttribute("cart", cart);
	
	        out.println("<p>Product added to cart successfully!</p>");
	    }
	%>


<h2>Products</h2>

<form method="post">

    <p>
        Laptop - ₹50000

        <input type="hidden"
               name="product"
               value="Laptop">

        <input type="hidden"
               name="price"
               value="50000">

        <button type="submit">
            Add to Cart
        </button>
    </p>

</form>


<form method="post">

    <p>
        Mobile - ₹20000

        <input type="hidden"
               name="product"
               value="Mobile">

        <input type="hidden"
               name="price"
               value="20000">

        <button type="submit">
            Add to Cart
        </button>
    </p>

</form>


<form method="post">

    <p>
        Headphones - ₹2000

        <input type="hidden"
               name="product"
               value="Headphones">

        <input type="hidden"
               name="price"
               value="2000">

        <button type="submit">
            Add to Cart
        </button>
    </p>

</form>

<br>

<a href="cart.jsp">View Cart</a>

</body>
</html>