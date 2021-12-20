package com.xworkz.collection.Book;

import java.util.LinkedList;

public interface  AssetDAO {
	LinkedList list = new LinkedList();
	void  addAsset(Object obj);

	boolean  searchAsset(Object obj);

	void updateAsset(Object obj, String name);

	void deleteAsset(Object obj);

	void listAsset();

	void setAsset(int index, Object object);

	void removeLastAsset();

	void removeFirstAsset();

	void getFirstAsset();

	void getLastAsset();

	
	void addFirstAsset(BookDTO object);

	void addLastAsset(BookDTO object);

	
}
