package com.kh.chap01.model.vo.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
/*
 * 상속구조에서 자식클래스가 부모클래스로 부터 받는 것 중에 가장 중요한것은?
 * Type (자료형)이다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	public static void main(String[] args) {
		//1. 부모타입 자료형으로 부모타입 객체를 다룸
		Parent p1 = new Parent(); //stack영역에 p1이라는 변수공간이 생기고 heap영역에 object가 부모니까 
		//먼저생기고 그 후 parent가 생김 
		p1.printParent();
		//p1.printChild1(); 자식이 가지고 있는 필드는 부모가 사용할 수 없음
		//p1변수로는 Parent에만 접근이 가능
		
		//2. 자식  타입 자료형을 자식타입 객체를 다룸
		 Child1 c1 = new Child1();
		 c1.printChild1();//내꺼니까 가능하다
		 c1.printParent();//부모꺼도 상속 받았으니까 가능 함
		//c1변수로는 Child1, Parent랑  둘 다 접근 가능 
		 
		 
		 //3. 부모타입 자료형을 자식타입  객체를 다룸==> 다형성 적용
		 Parent p2 = /*(Parent)*/new Child1(); //양변의 자효형이 다름 Parent 자료형과 Child1자룔형이어서 서로 다름
		 //상속 구조기 때문에 가능한 거다!
		 p2.printParent();
		 //p2.pirntChild1();
		//p2로는 Parent타입만 접근 할 수 있음
		 //이유는 내가 Parent형만 사용하기로 했으니까
		 //양쪽의 자료형이 다름에도 불구하고 에러가 발생하지 않는 이유는
		 //부모클래스인 Parent가 자식클래스는 Child1에게 타입을 물려주어서
		 //클래스 형변환이 일어났기 때문
		 
		 /*클래스 형 변환
		  * 
		  * 상속 구조 일 경우에만 가능
		  * 1.Up Casting
		  * 자식타입> 부모타입
		  * 생략이 가능 함 위에 (Parent)처럼
		  * 
		  * 2. Down Casting
		  * 부모타입> 자식타입
		  * 생략이 불가능하다.
		  */
		 //((Child1)p2).printChild1(); 이게 다운 케스팅 생략 안하고 앞에 현변환 할 자료형을 써줌
		 //Child1타입의 객체2개
		 //Child2타입의 객체2개
		 //총 4개의 객체를 다뤄볼 것
		 /*Child1 child1 = new Child1();
		 Child1 child2 = new Child1();
		 Child2 child3 = new Child2();
		 Child2 child4 = new Child2();
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		//많아지면 다루기 어려움 그래서 배열을 사용
		//배열은 자료형이 같으면 값들을 묶어 관리할 수 있음
		Child1[]arr1 = new Child1[2];
		Child2[]arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[1] = new Child2();
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();*/
		System.out.println("\n\n\n다형성을 적욯해보자");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent)new Child1();
		arr[1] = (Parent)new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		
		//Child1이나 Child2는 둘다 Parent상속을 받고 있어서 Parent로 묶어서 사용 가능하다.
		for(int i = 0; i< arr.length; i++) {
			arr[i].printParent();
			arr[i].print();
			System.out.println("\n\n\n\n");
			/*if(arr[i]instanceof Child1) {
				//g현제  참조변수가 실질적을 어떤크래스타입을 참조하고 있눈지 확인 
				((Child1)arr[i]).printChild1();
				((Child2)arr[i]).printChild2();*/
				
				
			}
		/* 동적 바인딩: 프로그램 실행 전 컴파일 시점에 정적바인딩 수행(자료형의 메소드를 가리킴)
		 * 			실빌적을 참조하ㅏ고 있는 객체가 해당 메소드를 오버라이딩 했다면
		 * 			프로그램 실행시점 동적으로 자식 클래스의 오버라이딩된 메소드를 실행
		 * 다형성 : 부모클래스 자료형으로 여러 자식클래스를 다루는 기술
		 * 
		 * 
		 */
		
			
		}
		
	}


