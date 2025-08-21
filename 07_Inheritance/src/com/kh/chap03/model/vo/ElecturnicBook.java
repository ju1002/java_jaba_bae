package com.kh.chap03.model.vo;

public class ElecturnicBook extends Book {
	private String platform;
	
	public ElecturnicBook() {
		
	}
	public ElecturnicBook(String title, String publisher,
			String author, int price, String platform) {
		super(title, publisher, author,price);
		this.platform = platform;
		
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String info() {
		return super.info()+"플랫폼 주소";
	}
	public String toString() {
		return super.info()+"플랫폼주소"+platform;
	}

}
