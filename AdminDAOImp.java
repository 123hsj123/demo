package com.capgemini.medicalstoremangment.daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.medicalstoremangment.dao.AdminDAO;
import com.mysql.jdbc.Driver;

public class AdminDAOImp implements AdminDAO  {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String dburl = "jdbc:mysql://localhost:3306/medicalstore_db";
			conn = DriverManager.getConnection(dburl, "root", "tiger");

			String query = "Select * from medicalstore_user_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				int userId = rs.getInt("user_id");
				String userName = rs.getString("user_name");
				long userMob = rs.getLong("user_mobno");
				String userAdd = rs.getString("user_address");
				int userPin = rs.getInt("user_pincode");
				Date userDob = rs.getDate("user_dob");
				String userDis = rs.getString("user_disease");
				int medId = rs.getInt("medicine_id");
				Date userMedBook = rs.getDate("user_medbookingdate");
				int userPass = rs.getInt("user_password");
				int userBookId = rs.getInt("user_bookingid");
			
				
				System.out.println("User Id- "+userId);
				System.out.println("User Name- "+userName);
				System.out.println("Mobile No- "+userMob);
				System.out.println("User Address- "+userAdd);
				System.out.println("User Pincode- "+userPin);
				System.out.println("User DOB- "+userDob);
				System.out.println("User Disease- "+userDis);
				System.out.println("Medicine Id- "+medId);
				System.out.println("User Medicine Booking Date- "+userMedBook);
				System.out.println("User Password-"+userPass);
				System.out.println("User Booking ID-"+userBookId);
				

				
				

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (conn != null) {
					conn.close();

				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}

}
