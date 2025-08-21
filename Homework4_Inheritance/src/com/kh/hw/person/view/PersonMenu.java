package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
	while(true) {
		int m= pc.personCount();
		int emp = pc.personCount2();
	
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된학생은"+ m+ "명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("");
		System.out.println("1.학생 메뉴");
		System.out.println("2.사원메뉴");
		System.out.println("9.끝내기");
		System.out.println("메뉴번호");
		pc.personCount();}
		
	}
	public void studentMenu() {
	
	}
	public void employeeMenu() {
		
	}
}
