package com.kh.chap04.run;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
		FieldController fc = new FieldController();
	//FieldController라는 자료형으로 fc라는 이름의 변수공간을 선언 한거야 근데 무슨 변수? 지역변수
	//객체 생성 new라는 키워드를 통해 만났을 때 heap에 올라가게된다.그러면서 그 FieldController라는 변수 공간안에 global 공간이 생김멤버변수 할당
	//주소 대입
		System.out.println(fc.global);
		fc.checkVariable(50); //필드는 파란색 불러주고 싶으면 int형 정수 아무거나 넣으면됨
// fc가 메모리 상의 생겨난 부분은 static영역에 생기고 checkVariable은 메소드를 호출한 거니까 stack영역에 생김
// 메소드를 호출하기 위한 전제 조건 객체를 생성해야 함
//	checkVariable 이라느 공간에 50이라는 값이 초기화 됨 즉 들어감
//	호출 시 parameter에 할당 및 초기화 됨 > local(지역변수)에 할당 및 초기화 됨
//	호출 종료 시 parameter, local지역변수 소멸이 됨 지역변수는 호출 됐을때 살아있고 종료시 사라짐
	System.out.println(fc.global);
//	global을 없애기 위해서는 global을 가리키는 fc라는 변수 공간에 null값을 대입 함 null은 주소값을 없애는 기호?
	fc = null; //global과의 관계를 끊는것이야 이걸 했다고해서 global값이 바로 사라지는게 아니라 g.c가 일을 해야 없어짐
	//System.out.println(fc.global);
	StaticController sc = new StaticController();
	System.out.println(sc.str); //안됨
	System.out.println(StaticController.str);
//	어떤클래스의 있는지 쓰고 그후참조연산자 그리고str입력
		System.out.println(StaticController.str);
		System.out.println(StaticController.JAVA_VERSION);
		/*
		 * AccessModifier(접근제어자/ 접근 제한자)
		 * 
		 * public>어디서든 (같은 패키지, 다른 패키지, 클래스 내부 , 클래스 외부 전부) 접근 가능
		 * 
		 * protected => 같은 패키지라면 무조건 접근 가능
		 * 				다른 패키지라면 상속구조인 클래스에서만 접근 가능
		 * default (package friendly) => 오로지 같은 패키지에서만 접근 가능
		 *  
		 * private > 오직 클래스 내부에서만 접근 가능
		 * 클래스 다이어그램에서 public은 + private은 -으로 표시 
		 */
		
		
	}

}
