package com.capgemini.medicalstoremangement.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.medicalstoremangement.dao.AdminDAO;
import com.capgemini.medicalstoremangement.dto.MedicalStoreUserInfo;
import com.mysql.jdbc.Driver;

public class AdminDAOImp implements AdminDAO {
	static Logger log = LogManager.getLogger("Harshit");

	public void displayUser() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;


		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String dburl = "jdbc:mysql://localhost:3306/medicalstore_db";
			conn = DriverManager.getConnection(dburl, "root", "tiger");

			String query = "Select * from medicalstoreuserinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				info.setUserId(rs.getInt("userId"));
				info.setUserName(rs.getString("userName"));
				info.setUserMobNo(rs.getLong("userMobNo"));
				info.setUserAddress(rs.getString("userAddress"));
				info.setUserPincode(rs.getInt("userPincode"));
				info.setUserDob(rs.getDate("userDob"));
				info.setUserDisease(rs.getString("userDisease"));
				info.setMedicineId(rs.getInt("medicineId"));
				info.setUserMedBookingDate(rs.getDate("userMedBookingDate"));
				info.setUserPassword(rs.getString("userPassword"));
				info.setUserBookingId(rs.getInt("userBookingid"));
				
				

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
