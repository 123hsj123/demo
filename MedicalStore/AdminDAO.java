package com.capgemini.medicalstoremangement.dao;

import com.capgemini.medicalstoremangement.dto.MedicalStoreUserInfo;

public interface AdminDAO {
	static MedicalStoreUserInfo info= new MedicalStoreUserInfo();

	public abstract void displayUser();
	

}
