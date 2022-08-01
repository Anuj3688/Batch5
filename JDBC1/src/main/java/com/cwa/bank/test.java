package com.cwa.bank;

import java.sql.*;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "root");
//			Statement stmt = con.createStatement();
			String q = "select * from bank where accType = ?";
			PreparedStatement ps  = con.prepareStatement(q);
			ps.setString(1, sc.next());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDouble(4));
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

}