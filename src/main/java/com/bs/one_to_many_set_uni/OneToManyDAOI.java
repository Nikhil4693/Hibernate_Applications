package com.bs.one_to_many_set_uni;

public interface OneToManyDAOI {

	public void saveDataUsingExmployee();
	public void loadDataUsingExmployee();
	public void addNewDataToExistingEmployee();
	public void deleteEmployeWithLicenses();
	public void deleteOneLicenseOfEmployee();
	public void deleteAllLicenseOfEmployee();

}
