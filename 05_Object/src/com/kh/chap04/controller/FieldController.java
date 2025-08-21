package com.kh.chap04.controller;

public class FieldController {
	/*필드(field) == 멤버 변수 == 인스턴스 변수
	 * 클래스를 구성하는 요소 중 하나
	 * 데이터를 저장하기 위한 역할(변수)
	 * 클래스 내부에 정의하지만 메소드 영역 밖에 존재
	 * 
	 * 
	 * 
	 * 변수 구분 
	 * field: 클래스 블록에 바로 선언하는 변수
	 * (local)variable : 클래스 영역 내부에 특정한 구역에서 선언됨 method, for ,if 등등....
	 * 
	 * 
	 * 1. 전역 변수의 역할을 하는 친구들
	 * 필드 (멤버변수, 인스턴스 변수) : 
	 * 	`						생성시점 > new를 사용해서 해당 객체를 생성하는 순간 heap에 할당 
	 * 							소멸시점 > 객체가 소멸될때 같이 소멸됨
	 * 									> g.c가 일을 안하면 oom(메모리가 터졌다)발생 ex)뭐 옷이나 신발 발매 했을때 서버 터질 때 막 공지올리면서 사과하잖아 이게 oom때문이야
	 * 
	 * -클래스 변수(정적 변수, static 변수) : 변수 앞에 static이라는 예약어가 붙어 있음
	 * 									생성시점 >>> 프로그렘 시작과 동시에 static영역에 올라감
	 * 									소멸시점>>>>> 프로그램 종료되면 소멸 
	 * 2.지역변수
	 * 			생성시점 : 특정 영역({}) 내부에서 선언되는 시점에 메모리 영역에 할당 > stack
	 * 			소멸시점 : 특정 영역 ({}) 이 종료될 때 사람짐 메소드가 종료될 떄
	 * 
	 */
//  필드 선언
	public int global;
	public void checkVariable(int parameter) {
		int local= 1;
		System.out.println(global);
		System.out.println(parameter); //이거는 왜 똑같은 지역변수인데 왜 초기화를 안했는데 빨간줄이 안생기냐 매개변수에서 이미 자료형이 int라고 정해놨기 때문에 따로 초기화 할 필요가 없음
		System.out.println(local); //초기화를 해야함 지역변수는 초기화를 안하면 출력을 못함.
		
	}
}
