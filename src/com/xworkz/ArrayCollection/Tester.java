package com.xworkz.ArrayCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Tester extends Object {
	
	public static void main(String a[]) {
		
		Collection collection= new ArrayList();
		collection.add(new String("xworkz"));
		collection.add(new Tester());
		collection.add("bangalore");
		collection.add(12);
		
		int collectionSize = collection.size();
		System.out.println("collectionSize is "+collectionSize);
		
		System.out.println(collection);
		System.out.println(collection.isEmpty());
		
		if(collection.contains("bangalore"))
		{
			System.out.println("bangalore is present");
		}
		else
		{
			System.out.println("bangalore is not present");
		}
		
		collection.remove(collection);
		
	}
	

}
