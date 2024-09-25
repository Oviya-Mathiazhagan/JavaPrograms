package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {
      public static void main(String[] args) {
	/*	Set s = new HashSet();
		s.add("oviya");
		s.add('O');
		s.add(100);
		s.add(null);
		s.add(true);
		
		System.out.println(s);*/
		
     /*	Set s = new LinkedHashSet();
  		s.add("oviya");
  		s.add('O');
  		s.add(100);
  		s.add(null);
  		s.add(true);
  		
  		System.out.println(s); */
    	  
    	Set s = new TreeSet();
  		s.add("oviya");
  		s.add("apple");
  		s.add("mango");
  		s.add("pineapple");
  		s.add("guava");
  		
  		System.out.println(s);
		
	}
}
