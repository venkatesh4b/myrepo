//package com.java.col;

package com.java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		 List<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add(2, "xyz");
		  
		  System.out.println(al.get(0));
		  System.out.println(al.get(1));
		  System.out.println(al.get(2));
		  
		  List<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay"); 
		  list.add(2, "xyz");
		  System.out.println(list.get(0));
		  System.out.println(list.get(1));
		  System.out.println(list.get(2));
		  
		 Set<String> users = new TreeSet<>();
		 users.add("abc");
		 users.add("xyz");
		 users.add("def");
		 users.add("abc");
		 users.add("abc");
		 users.add("def");
		 users.add("hghj");
		 for(String str:users) {
			 System.out.println(str);
		 }
		 
		 Map<String, String> userData = new Hashtable<>();
		 userData.put("username", "admin");
		 
		 System.out.println(userData.get("username"));
	}

}









