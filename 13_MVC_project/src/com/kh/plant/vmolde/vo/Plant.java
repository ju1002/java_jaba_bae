package com.kh.plant.vmolde.vo;

public class Plant {
	/*model1: 데이터 관련 작업
	 * vo : 프로그램 실행 중 만들어진 값을 담는 객체
	 */
	
	
	private String name;
	private String type;
	
	
	//기본생성자 , 매개변수 생성자,getter,setter,toString
	//alt+shift+s > o > alt_+ d > alt +g  기본생성자 만드는 법  
	public Plant() {
		super();
	}
	
	//alt + shift +s >o> alt g 매개변수  생성자 만드는 법


	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	//alt + shift  + s > r > alt + a > alt + r getter setter만드는 법

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
//alt + shift + s > s > alt+ g toString 만드는 법
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}

	
	
	
	
	
	
	
	
}
