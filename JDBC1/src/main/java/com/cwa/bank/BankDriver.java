package com.cwa.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BankDriver {
	private static Connection con;
	private static Statement stat;
	private static ResultSet rs;
	private static String query;
	private static PreparedStatement ps;
	private static Scanner sc = new Scanner(System.in);
	
	public static void createAccount() {
		
	}
	public static void main(String[] args) {

		int a = 0;
		while (true) {
			System.out.println("Select any one of the options");
			System.out.println("1. Create Account");
			a = sc.nextInt();
			
			
			switch (a) {
			case 1: {
				Bank b1 = new Bank();
				System.out.println("Enter the bank details");
				
				b1.createAccount("Anuj Tiwari", 234524,30000, "Savings");

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "root");
					query = "insert into Bank (accName,accNumber,accbalance,accType) values (?,?,?,?)";
					
					ps = con.prepareStatement(query);
//					ps.setString(1, b1.getaName());
//					ps.setInt(2,b1.getAccNumber());
//					ps.setDouble(3,b1.getAccBalance());
//					ps.setString(4, b1.getAccType());
					int b = ps.executeUpdate();
					System.out.println(b);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}

			default:
				break;
			}
			if(a==0) {
				break;
			}

		}

	}
}
