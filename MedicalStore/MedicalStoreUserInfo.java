package com.capgemini.medicalstoremangement.dto;

import java.lang.annotation.Target;
import java.sql.Date;

public class MedicalStoreUserInfo {
	
	private int userId;
	private String userName;
	private long userMobNo;
	private String userAddress;
	private int userPincode;
	private Date userDob;
	private String userDisease;
	private int medicineId;
	private Date userMedBookingDate;
	private String userPassword;
	private int userBookingId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserMobNo() {
		return userMobNo;
	}

	public void setUserMobNo(long userMobNo) {
		this.userMobNo = userMobNo;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserPincode() {
		return userPincode;
	}

	public void setUserPincode(int userPincode) {
		this.userPincode = userPincode;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserDisease() {
		return userDisease;
	}

	public void setUserDisease(String userDisease) {
		this.userDisease = userDisease;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public Date getUserMedBookingDate() {
		return userMedBookingDate;
	}

	public void setUserMedBookingDate(Date userMedBookingDate) {
		this.userMedBookingDate = userMedBookingDate;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserBookingId() {
		return userBookingId;
	}

	public void setUserBookingId(int userBookingId) {
		this.userBookingId = userBookingId;
	}
}
