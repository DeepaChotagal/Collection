package com.xworkz.collection.Book;

public class BookTester {

	public static void main(String[] args) {
		
		AssetDAO dao=new BookImpl();
		BookDTO dto;
		
		BookDTO dto1 = new BookDTO(1,"Deepa",111.00,"ddd");
		BookDTO dto2 = new BookDTO(2,"Samprita",222.00,"sss");
		BookDTO dto3 = new BookDTO(3,"zahid",333.00,"zzz");
		BookDTO dto4 = new BookDTO(4,"Roopa",444.00,"rrr");
		BookDTO dto5 = new BookDTO(5,"sri",555.00,"sss");
		dao.addAsset(dto1);
		dao.addAsset(dto2);
		dao.addAsset(dto3);
		dao.addAsset(dto5);
		
		dao.listAsset();
		System.out.println();
//		dao.getFirstAsset();
//		dao.getLastAsset();
		dao.addFirstAsset(dto4);
		dao.removeLastAsset();
//		dao.removeFirstAsset();
		dao.listAsset();
		dao.deleteAsset(dto1);
		System.out.println();
		dao.listAsset();
//		dao.searchAsset(dto3);
//		dao.updateAsset(dto4, "kavita");
//		

	}

}
