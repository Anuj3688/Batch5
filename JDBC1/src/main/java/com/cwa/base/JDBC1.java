package com.cwa.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC1 {

	private static Connection con;
	private static Statement stat;
	private static ResultSet rs;
	private static Scanner sc;
	private static String query;
	private static PreparedStatement ps;

	public static void openConnections() {
		sc = new Scanner(System.in);
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			stat = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnections() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			openConnections();

		} catch (Exception e) {
			System.out.println(e);
		}

		int a = 0;

		while (true) {
			System.out.println("Select from any one of the below values");
			System.out.println("1. Add Data");
			System.out.println("2. Show Data");
			System.out.println("3. Search single data");
			System.out.println("4. Update Data");
			System.out.println("5. Exit");
			a = sc.nextInt();

			switch (a) {
			case 1: {
				System.out.println("Enter your UserID and Password");
				String val1 = sc.next();
				sc.nextLine();
				String val2 = sc.next();
				query = "insert into login (userid,password) values(?,?)";
				int b = 0;
				try {
					ps = con.prepareStatement(query);
					ps.setString(1, val1);
					ps.setString(2, val2);
					b = ps.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				System.out.println(b + " Sccessfully Executed");
				break;
			}
			case 2: {
				query = "select * from login";
				try {
					rs = stat.executeQuery(query);
					while (rs.next()) {
						System.out.println();
						System.out.println("UserID " + rs.getString(1));
						System.out.println("Password " + rs.getString(2));
						System.out.println();

					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}
			case 3: {
				System.out.println("Enter your UserID");
				String val = sc.next();
				query = "Select * from login where userid = ?";
				try {
					ps = con.prepareStatement(query);
					ps.setString(1, val);
					rs = ps.executeQuery();
					while (rs.next()) {
						System.out.println();
						System.out.println("UserID " + rs.getString(1));
						System.out.println("Password " + rs.getString(2));
						System.out.println();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}
			case 4: {
				System.out.println("Enter UserID which you want to update and then new password");
				String val = sc.next();
				sc.nextLine();
				String val2 = sc.next();
				query = "Update login set password = ? where userid = ?";
				int b=0;
				try {
					ps = con.prepareStatement(query);
					ps.setString(2, val);
					ps.setString(1, val2);
					b =ps.executeUpdate(); 
					if(b==0)
						System.out.println("UserID not found");
					else 
						System.out.println(b+" Updated success	");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			}
			if (a == 5)
				break;
		}

		closeConnections();

	}
}
