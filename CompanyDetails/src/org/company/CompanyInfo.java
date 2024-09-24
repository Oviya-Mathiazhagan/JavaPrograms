package org.company;

public class CompanyInfo {
      
	private void companyName() {
        System.out.println("Iagami Technologies");

	}

	

	private void companyId() {
        System.out.println("1234567890");
	}

	

	private void companyAddress() {
       System.out.println("Trichy Airport");
	}

	public void main (String[]args) {

		CompanyInfo a = new CompanyInfo();

		a.companyName();

		a.companyId();

		a.companyAddress();

	}
}
