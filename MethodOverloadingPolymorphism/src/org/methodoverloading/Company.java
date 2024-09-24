package org.methodoverloading;

//same class
//same method
//different arguments

public class Company {

	private void empData(String name) {
		System.out.println("The Emp Name is : " + name);
	}
	
	private void empData(int age) {
		System.out.println("The Emp Age is : " + age);
	}
	
	public static void main(String[] args) {
		Company a = new Company();
		a.empData("Oviya");
		a.empData(21);
		
		
		a.empData("Sajitha");
		a.empData(21);
			}
	
}

/*public class Company {

	private void empData(String name,int age) {
		System.out.println("The Emp Name is : " + name);
		System.out.println("The Emp Age is : " + age);
	}
	
	private void empData(int dob,char empName) {
	    System.out.println("The Emp dob is : " + dob);
	    System.out.println("The Emp empName is : " + empName);
	}
	
	public static void main(String[] args) {
		Company a = new Company();
		a.empData("Oviya",21);
		a.empData(2003,'O');
		
		
		a.empData("Sajitha",21);
		a.empData(2004,'S');
			}
	
}
*/


