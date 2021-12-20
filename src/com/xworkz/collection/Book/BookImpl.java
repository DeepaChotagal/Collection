package com.xworkz.collection.Book;

import java.util.Iterator;
import java.util.LinkedList;

public class BookImpl implements AssetDAO{

	LinkedList list = new LinkedList();

	

	@Override
	public void addAsset(Object object) {
      list.add(object);
      
	}

	@Override
	public boolean searchAsset(Object obj) {
		return list.contains(obj);
	}

	
	
	@Override
	public void updateAsset(Object obj, String name) {
		System.out.println("Invoked updteAsset");
		LinkedList container =(LinkedList) list;
		int index = container.indexOf(obj);
		Object asset = container.get(index);
		BookDTO book =(BookDTO) asset;
		book.setBookName(name);
		list.add(asset);	
	}

	@Override
	public void deleteAsset(Object obj) {
              list.remove(obj);
	}

	@Override
	public void listAsset() {
         Iterator iterator = list.iterator();
         while(iterator.hasNext()) {
        	 Object object = iterator.next();
        	 System.out.println(object);
         }
	}

	@Override
	public void setAsset(int index, Object object) {
		BookDTO dto = (BookDTO) object;
		list.add(index, dto);
		
	}

	@Override
	public void removeLastAsset() {
         list.removeLast();		
	}

	@Override
	public void removeFirstAsset() {
     list.removeFirst();		
	}

	@Override
	public void getFirstAsset() {
		System.out.println(list.getFirst());
		
		
	}

	@Override
	public void getLastAsset() {
		System.out.println(list.getLast());
		
	}

	
	@Override
	public void addFirstAsset(BookDTO object) {
		list.addFirst(object);
		
	}

	
	@Override
	public void addLastAsset(BookDTO object) {
		list.addFirst(object);
	}	
	
}

	
