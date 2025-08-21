package com.kh.chap03.model.vo;

public class PaperBook extends Book {
	private int lostpage;
	
	public PaperBook() {
		
	}
	public PaperBook(String title , String publisher,String author
			,int price, int lostpage) {
	super(title, publisher, author,price);
	this.lostpage= lostpage;}
	
	public int getLostpage() {
		return lostpage;
	}
	public void setLostpage(int lostpage) {
		this.lostpage = lostpage;
	}
	public String info() {
		return super.info()+"잃어버린 페이지"+lostpage;
	}
	public String toString() {
		return super.info()+lostpage;
	}
		
	}


