package com.vcube.case_study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BankingManagementSystem {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system", "root", "root");

		} catch (Exception e) {
			System.out.println(e);
		}
		int choice = 0;
		do {
			System.out.println("===== Banking Management System =====");
			System.out.println("1.create account");
			System.out.println("2.deposit money");
			System.out.println("3.withdraw money");
			System.out.println("4.check balance");
			System.out.println("5.view account details");
			System.out.println("6.exit");
			System.out.println("enter your choice : ");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("creating account...");
				createAccount();
				break;
			case 2:
				System.out.println("depositing money...");
				depositMoney();
				break;
			case 3:
				System.out.println("withdrawing money...");
				withdrawMoney();
				break;
			case 4:
				System.out.println("checking balance...");
				checkBalance();
				break;
			case 5:
				System.out.println("view account details...");
				viewAccDetails();
				break;
			case 6:
				System.out.println("Exit...");
				break;
			default:
				System.out.println("invalid choice");
			}

		} while (choice != 6);

	}

	public static void createAccount() {
		sc.nextLine();
		System.out.println("enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("enter your phone number : ");
		String phNo = sc.next();
		System.out.println("enter your account type(savings/current) : ");
		String accType = sc.next();
		System.out.println("enter initial deposit : ");
		double balance = sc.nextDouble();
		if (balance < 0) {
			System.out.println("Initial deposit cannot be negative.");
			return;
		}
		try {
			PreparedStatement ps = con
					.prepareStatement("insert into account(customer_name,phone,account_type,balance) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, phNo);
			ps.setString(3, accType);
			ps.setDouble(4, balance);
			 int n=ps.executeUpdate();
			    if(n>0)
			    {
			    	System.out.println("account created successfully !!");
			    }
			    else
			    {
			    	System.out.println("something went wrong !!");
			    }
			
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void depositMoney() {
		try {
			System.out.print("Enter account number: ");
			int accNo = sc.nextInt();

			System.out.print("Enter amount : ");
			double amount = sc.nextDouble();

			if (amount <= 0) {
				System.out.println("Deposit amount must be greater than zero.");
				return;
			}
			PreparedStatement ps = con.prepareStatement("update account set balance=balance+? where account_no=?");
		    ps.setDouble(1, amount);
		    ps.setInt(2, accNo);
		    int n=ps.executeUpdate();
		    if(n>0)
		    {
		    	System.out.println("amount deposited successfully !!");
		    }
		    else
		    {
		    	System.out.println("account not found !!");
		    }
		
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void withdrawMoney() {
		try {
			System.out.print("Enter account number: ");
			int accNo = sc.nextInt();

			System.out.print("Enter amount : ");
			double amount = sc.nextDouble();

			if (amount <= 0) {
				System.out.println("withdrawal amount must be greater than zero.");
				return;
			}
			PreparedStatement ps = con.prepareStatement("update account set balance=balance-? where account_no=? and balance>=?");
		    ps.setDouble(1, amount);
		    ps.setInt(2, accNo);
		    ps.setDouble(3, amount);
		    int n=ps.executeUpdate();
		    if(n>0)
		    {
		    	System.out.println("amount withdrawn successfully !!");
		    }
		    else
		    {
		    	System.out.println("Insufficient balance or account not found !!");
		    }
		
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void checkBalance() {
		try {
			System.out.print("Enter account number: ");
			int accNo = sc.nextInt();
			PreparedStatement ps = con.prepareStatement("select balance from account where account_no=?");
			ps.setInt(1, accNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			
				System.out.println("Balance : "+rs.getDouble(1));
			}
			else
			{
				System.out.println("account not found!!");
			}
		}catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void viewAccDetails() {

		try {
			System.out.print("Enter account number: ");
			int accNo = sc.nextInt();
			PreparedStatement ps = con.prepareStatement("select * from account where account_no=?");
			ps.setInt(1, accNo);
			ResultSet rs=ps.executeQuery();
				if(rs.next()) {
				System.out.println("Account No : "+rs.getInt(1));
				System.out.println("Customer Name : "+rs.getString(2));
				System.out.println("Phone No : "+rs.getString(3));
				System.out.println("Account Type : "+rs.getString(4));
				System.out.println("Balance : "+rs.getDouble(5));
				}
			else
			{
				System.out.println("Account not found !!");
			}
		}catch (Exception e) {
			System.out.println(e);

		}
	}

}
