package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		//coffee라는 클래스를 가지고 객체 생성
		Coffee coffee = new Coffee(); //     <== 객체화 했다  instance화 했다.
	// 참조자료형
	// 클래스를 만든다는 행위 == 사용자 정의 자료형을 만들겠다.
	// 여러 개의 자료형에 여러 개의 값을 보관 + 가능
	// 주소값을 저장한다.'
		System.out.println(coffee.info());
	
	//사용자에게 입력받아서 
	//정수 : 0 , 실수 : 0.0 , 참조형 :null , 문자 : '', boolean: false
	Scanner sc = new Scanner(System.in);
	
	String coffeeName = coffee.getName();
	System.out.println("이름이 뭔가요?");
	String name = sc.nextLine();
	coffee.setName("아메리카노");
	System.out.println("원두는 어떤 원두인가요");
	String bean = sc.nextLine();
	coffee.setBean("미국산");
	System.out.println("가격은 얼마인가요?:");
	int price = sc.nextInt();
	coffee.setPrice(6000);
	System.out.println("사이즈는 어떻게 되나요?");
	int size = sc.nextInt();
	coffee.setSize(2);
	
	
		
	
}
	}
