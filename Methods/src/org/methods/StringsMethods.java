package org.methods;

public class StringsMethods {
       public static void main(String[] args) {
		
    	   String name = "Oviyaa";
    	   
    	   char charAt = name.charAt(1);
    	   System.out.println(charAt);
    	   
    	   int indexOf = name.indexOf("O");
    	   System.out.println(indexOf);
    	   
    	   int lastIndexOf = name.lastIndexOf("a");
    	   System.out.println(lastIndexOf);
    	   
    	   int length = name.length();
    	   System.out.println(length);
    	   
    	   boolean empty = name.isEmpty();
    	   System.out.println(empty);
    	   
    	   boolean contains = name.contains("Ovi");
    	   System.out.println(contains);
    	   
    	//   String trim = name.trim();
    	//   System.out.println(trim);
    	   
    	   boolean startsWith = name.startsWith("Ov");
    	   System.out.println(startsWith);
    	   
    	   boolean endsWith = name.endsWith("yaa");
    	   System.out.println(endsWith);
    	   
    	   String upperCase = name.toUpperCase();
    	   System.out.println(upperCase);
    	   
    	   String lowerCase = name.toLowerCase();
    	   System.out.println(lowerCase);
    	   
    	   String a = "Ovi";
    	   String b = "ovi";
    	   
    	   boolean equals = a.equals(b);
    	   System.out.println(equals);
    	   
    	   boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
    	   System.out.println(equalsIgnoreCase);
    	   
    	   String replace = name.replace("O","o");
    	   System.out.println(replace);
    	   
    	   String replaceAll = name.replaceAll("Oviyaa","Sajitha");
    	   System.out.println(replaceAll);
    	   
    	   String word = "Shanmugha";
    	   String substring = word.substring(4);
    	   System.out.println(substring);
    	   
    	   String substring2 = word.substring(4,9);
    	   System.out.println(substring2);
    	   
    	   //ASCII Values
    	   //A to Z - 65 to 90
    	   //a to z - 97 to 122
    	   //0 to 9 - 48 to 57
    	   
    	   String m = "Ovi"; 
    	   String n = "Saji";
    	   
    	   int compareTo = m.compareTo(n);
    	   System.out.println(compareTo);
    	   
    	   int compareTo2 = n.compareTo(m);
    	   System.out.println(compareTo2);
	}
}
