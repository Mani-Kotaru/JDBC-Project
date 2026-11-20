<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Employee Salary Calculator</title>
	</head>
	<body>
	    <h1>Employee Salary Calculator</h1>
	    <form>
	   EmployeeID  : <input type="text" name="eid" placeholder="enter your id"><br><br>
	   Name        : <input type="text" name="name" placeholder="enter your name"><br><br>
	   Basic Salary: <input type="text" name="bs" placeholder="enter your basic salary"><br><br>
	   Department  : 
	   <select name="dept">
	     <option>Java</option>
	     <option>Python</option>
	     <option>Testing</option>   
	   </select><br><br>
	   <button >calculate</button>
	   </form>
	   <%! public double calculateHRA(double bs){
		   double hra=0.2*bs;
		   return hra;
		   }
	       public double calculateDA(double bs){
		   double da=0.1*bs;
		   return da;
		   }
	       public double calculateGrossSal(double bs,double hra,double da){
	    	   double grossSal=bs+hra+da;
			   return grossSal;
		   }
	       public double calculateTax(double grossSal){
	    	   double tax=0.05*grossSal;
			   return tax;
			   }
	       public double calculateNetSal(double grossSal,double tax){
	    	   double netSal=grossSal-tax;
			   return netSal;
			   }
	      %>
	      <% String eid=request.getParameter("eid");
	       if(eid!=null){
	      String name=request.getParameter("name");
	      double bs=Double.parseDouble(request.getParameter("bs"));
	      String dept=request.getParameter("dept");
	        double hra=calculateHRA(bs);
	        double da= calculateDA(bs);
	        double grossSal=calculateGrossSal(bs,hra,da);
	        double tax=calculateTax(grossSal);
	        double netSal=calculateNetSal( grossSal,tax);
	       %>
	       
	     <h2>Employee Details</h2>
	     Employee ID : <%= eid %><br>
	     Employee Name : <%= name %><br>
	     Department : <%= dept %><br><br>
	     <h2> Salary Details</h2>
	     Basic Salary : <%= bs %><br>
	     HRA : <%= hra %><br>
	     DA : <%= da %><br>
	     Gross Salary : <%= grossSal %><br>
	     Tax : <%= tax %><br>
	     Net Salary : <%= netSal %>
	    <% } %>
	</body>
</html>