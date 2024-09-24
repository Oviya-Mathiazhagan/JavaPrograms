package org.methodoverriding;

public class Employee extends Company {

	private void empData(String name) {
		System.out.println(name);
		super.compData("Wipro");
		this.empData(101);
	}
	
	private void empData(int id) {
		System.out.println(id);
		
	}
	
	public static void main(String[] args) {
		Employee a = new Employee();
		Company b = new Company();
		a.empData("  Oviya");
		a.empData("  Hema");
		a.empData("  Sajitha");
	}
}
