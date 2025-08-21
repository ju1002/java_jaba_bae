package com.kh.model.vo;

public class Restaurant {
	
	//상호 , 주소 , 메인메뉴
	
	
	private String storName;
	private String address;
	private String mainMenu;
	
	
	public Restaurant() {
		
	}
	public Restaurant(String storName , String address, String mainMenu) {
		this.storName = storName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	public String getStorName() {
		return storName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	public void setStorName(String storName) {
		this.storName = storName;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu =mainMenu;
	}
	public String info() {
		return "식당의 정보" + "[" + "식당의 이름" + storName + "식당의 주소" + address
				+ "대표음식"+ mainMenu 
				+ "]";
	}
}
