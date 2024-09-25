package org.list;
import java.util.ArrayList;
import java.util.List;

public class ListConcept {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add(true);
		li.add('O');
		li.add("oviya");
		li.add(10);
		
		System.out.println(li);
		
	/*	int size = li.size();
		System.out.println(size);
		
		int indexOf = li.indexOf("oviya");
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		boolean contains = li.contains(true);
		System.out.println(contains);
		
		Object object = li.get(4);
		System.out.println(object); */

		//Object------superclass of all datatypes
		
		for(int i = 0;i < li.size();i++) {
			Object object = li.get(i);
			System.out.println(object);
		}
	}

}
