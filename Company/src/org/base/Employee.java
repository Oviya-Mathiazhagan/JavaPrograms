package org.base;

public class Employee extends Company {

	private void employeeId() {
		System.out.println("301");
	}
	
	private void employeeName() {
		System.out.println("XYZ");
	}
	
	public static void main(String[] args) {
		Employee a = new Employee();
		a.employeeId();
		a.employeeName();
		a.companyId();
		a.companyName();
		a.staffId();
		a.staffName();
		
	}
}
