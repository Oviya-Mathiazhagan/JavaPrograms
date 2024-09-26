package org.map;

import java.util.*;
import java.util.Map.Entry;


public class MapConcept {
      public static void main(String[] args) {
    	  
    	// HashMap--random order  
	    Map<String,Integer> m = new HashMap();
		 m.put("Oviya",1);
		 m.put("Karthika",2);
		 m.put("Sajitha",3);
		 m.put("Rakshana",4);
		 m.put("Hema",5);
		
		System.out.println(m);
		
		System.out.println("-------------------------");
    	
    	// LinkedHashMap--insertion order
        Map<String,Integer> m1 = new LinkedHashMap();
   		 m1.put("Oviya",1);
  		 m1.put("Karthika",2);
  		 m1.put("Sajitha",3);
  		 m1.put("Rakshana",4);
  		 m1.put("Hema",5);
  		
  		System.out.println(m1); 
  		
  		System.out.println("--------------------------");
    	  
    	 // TreeMap--ascending order
    	 Map<String,Integer> m2 = new TreeMap();
    	  m2.put("Oviya",1);
    	  m2.put("Karthika",2);
    	  m2.put("Sajitha",3);
    	  m2.put("Rakshana",4);
    	  m2.put("Hema",5);
    		
        System.out.println(m2);
        
        System.out.println("---------------------------");
  		
        //Hashtable--random order
        Map<String,Integer> m3 = new Hashtable();
  	      m3.put("Oviya",1);
  	      m3.put("Karthika",2);
  	      m3.put("Sajitha",3);
  	      m3.put("Rakshana",4);
  	      m3.put("Hema",5);
  		
        System.out.println(m3); 
        
        System.out.println("----------------------------");
		
		//Methods of Map
		int size = m1.size();
		System.out.println(size);
		
		boolean containsKey = m1.containsKey("Oviya");
		System.out.println(containsKey);
		
		boolean containsValue = m1.containsValue(0);
		System.out.println(containsValue);
		
		m1.remove("Hema");
		System.out.println(m1);
		
		Set<String> keySet = m1.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m1.values();
		System.out.println(values);
		
		System.out.println("-----------------------------");
		
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		for(Entry<String,Integer> e:entrySet) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}
}
