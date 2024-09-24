package org.Scanner;
import java.util.Scanner;

public class ScannerMethods {
      public static void main(String[] args) {
		 Scanner name = new Scanner(System.in);
		 System.out.print("Enter the Name: ");
		 String a = name.next();
		 System.out.println("My Name is " + a);
	}
}
