<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Scanner" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	    <form>
	     num1: <input type="text" name="num1" placeholder="enter a number"><br><br>
	     num2: <input type="text" name="num2" placeholder="enter a number"><br><br>
	     <input type="submit" value="add">
	    </form>
	    <% String num1=request.getParameter("num1");
	       String num2=request.getParameter("num2"); 
	       if(num1!=null && num2!=null)
	       {
	    	   int n1=Integer.parseInt(num1);
	    	   int n2=Integer.parseInt(num2);
	    	   int sum=n1+n2;
	    	   out.println("sum : "+sum);
	       }
	       
	       %>
	</body>
</html>