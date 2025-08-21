package com.kh.chap06.controll;

public class MethodController {
	/*
	 * 메소드 : 수행을 하는 기능  다른 말로 멤버 함수라고 함.
	 * 함수 : 특정한 작업을 수행하기 위해서 만들어진 코드  블록
	 * 함수의 특징
	 * 1. 재사용성 >>>반복해서 사용할 수 있다.
	 * 2. 모듈화>>>
	 * 
	 * 객체지향 프로그래밍에서의 메소드란 : 객체가 수핼할 수 있는 행동을 정의한 코드 블록
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * 
	 * 
	 * [표현법]
	 * 접근제한자 예약어 변환형 메소드식별자 (매개변수의자료형 매개변수 식별자){
	 * 수행할 코드;
	 * return 반환값;}
	 * 생략 가능한것 : 예약어 , 매개변수 , return문 (void일경우)
	 * 반환형 : return변환할 값의 자료형
	 * 호출할때 메소드 전달 인지값=> 매개변수의 자료형과 개수가 정확하게 일치
	 * 한번 정의해두면
	 */
	
	
// 더하기를 해서 코드 블록을 만들고 싶다.
	//public int add (int a, int b) {
		
	//int sum = a+b;	//메소드 바디
		//return sum; //반환값
		
//	1. 매개변수가 존재하지 않고 반환값도 존재하지않는 메소드 만들어보자
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 존재하지 않습니다.");
		//return; //무조건 있어야 함 마치 기본생성자와 똑같이 안만들어도 시스템 내부에서 알아서 만들어줌.
	}
//	2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드 getter
//	반환해야할 타입이 String 문자열이니까 무조건 return문이 와야 함.
	public String method2 () {
		System.out.println("매개변수는 존재하지 않지만 반환값은 존재합니다.");
		return "이름";
	}
	public String method3() {
		return method2();
	} //반환하는건 값이어야 하는데 method2를 호출했다. method2가 끝나고  반환되는 값인 " 이름"이 반환됨 그 후 method 3에서 이름이 반환되고 
//	메인 메소드에서 "이름" 이라는 값이 출력됨
	public void println (String parameter) {
		System.out.println(parameter);
	}
//	println은 출력하는 용도 임
//	인자값으로 받음
//		3. 매개변수는 존재하지 않지만 반환값은 존재하지 않는 메소드
	//public void setName(String name) {
		//this.name = name;
	public void method4(int num) {
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달받은값 + 100"+(num+100));
	}
//	4. 매개변수도 존재하고 반환값도 존재하는 메소드
	public int method5(int num) {
		System.out.println("매개변수도 있어요 ~반환값도 있어요");
		return num + 55;
		
	}
	public void a() {
		System.out.println("메소드 a호출");
		b();
	}
	public void b() {
		System.out.println("메소드 b호출!");
		a();
	}
	public void test(MethodController mc) {
		mc.method1 ();
		
	}
	public static void staticMethod() {
		System.out.println("안녕나는 스태틱 메소드야");
	}
//	static은 객체생성을 안해도 됨.
	public void haha (int num) {
		
	}
		public void test(int num) {
			
		}
		
	}
