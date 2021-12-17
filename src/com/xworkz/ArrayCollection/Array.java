package com.xworkz.ArrayCollection;

public class Array {

	public static void main(String[] args) {
           String name="Deepa";
           boolean isMarried = false;
           int age = 21;
           
           Object[] array = new Object[3];
           array[0]= name;
           array[1] = isMarried;
           array[2] = age;
           System.out.println(name +"    "+ isMarried +"  "+ age);
	}

}
