package com.kh.chap04.controller;
// 클래스 변수 (static)와 상수 필드에 대해서!
//	 목표 : str 출력하기
public class StaticController {
  //필드부 
// [표현법]
//	접근제한자 예약어(생략가능) 자료형 식별자;
//	생성시점 : 프로그램 실행과 동시에 메모리의 static영역에 할당
//	소멸시점 : 프로그램 종료 !
//	객체를 생성을 하지 않고 static영역에 할당!
//	변수를 구분하는 이유 : 변수를 어떻게 구분하는지에 따라서 사용할 수 있는 범위가 달라짐
//	어떻게 구분하냐 : 메모리상 어디에 올라가냐에 따라 다름
//	static stack heap 각 영역에 따라 종료 되는 시점이 다름
//	static == "공유"의 개념이 강함
//	프로그램 실행과 동시레 올려놓고 거기서 값을 공유해서 사용할 목적
//	private는 보통 static영역에 안씀 영역을 다 쓰려고
/*상수 필드 
 * [표현법]
 * public static 자료형 상수필드식별자 = 값;
 * 상수 : 값을 변경하지 않을 변수 final
 * public static final 자료형 상수필드식별자 = 값;
 * >예약어 순서는 상관없음 public final static 으로 작성해도 됨
 * > 한 번 지정한 값을 고정해서 쓰겠다. 무조건 초기화를 해야함!!
 * 
 * static : 공유목적
 * final : 한 번 초기화 하고 죽었다 꺠나도 안바꾸겠다.
 * 값이 변경되면 큰일나는 고정적인 값들을 메모리(static)영역에 올려놓고 공유해서 쓸 못젓
 * 상수필드 네이밍도 반드시 대문자로 작성해야 함!
 */
	public static String str = "static field";
//	static이 붙으면 식별자가 위와 같이 누워있는 형태로 바뀌게 됨.
	public static int JAVA_VERSION  = 21;
//	두꺼우면 final 누우면 static 객체 생성 안해도 됨

}
