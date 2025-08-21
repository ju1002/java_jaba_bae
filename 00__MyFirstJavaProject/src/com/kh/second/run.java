package com.kh.second;

public class run {
	public static void main(String[] args) {
		//중괄호안에 없는 것을 찾으면 안됨  호출하려면 
		//외부 클래스에 존재하는 메소드를 호출하고 싶을 때는?
		/*
		 * 
		 * 호출할 메소드가 존재하는 클래스를 생성 해줘야함
		 * 1번 클래스 이름 
		 * 
		 * 클래스 이름 = new 클래스 이름();
		 * 
		 */
		
		printcontroller pc = new printcontroller();
		//printmyname();
		pc.printMyName();
	}
}
