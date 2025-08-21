package com.kh.chap06.controll;

public class OverlodadingController {
/*
 * 메소드오버로딩(Method Overloding)
 * 하나의 클래스 안에 동일한 메소드 식별자로 여러 개의 메소드들을 정의할 수 있는 기술!
 * 매개변수 자료형의 개수 , 순서, 종류 다르게 작성해야함!
 * 매개변수 식별자, 접근제한자, 반환타입은 메소드 오버로딩에 아무런 영향을  끼치지 않음
 * 사용자의 편의성을 높이기 위해서
 * 
 * 
 * 
 * 
 * 
 */
	//메소드 종류 다르게
	public void test() {
		System.out.println("메소드 오버로딩 테스트1");//★면접 단골질문 
		}
	public void test(int num) {
		
		System.out.println("메소드 오버로딩 테스트2");
		
	}
	public void test(String str) {
		System.out.println("메소드 오버로딩 테스트3");
		
	}
	//매개변수의 개수 증가
	
		//System.out.println("메소드 오버로딩 테스트4");
		//SYstem.out.println("fdsfsa");
	//}//이것은 안됨 자료형의 개수, 순서가 동일 하기 떄문에 구현이 불가능
	
		
	//}//이것도 안됨 반환형과는 상관없이 매개변수의 개수와 순서를 항상 다르게 작성해야 함
	//접근제한자도 상관이 없음 매개변수의 개수와 순서를 항상 다르게 작성해야 함
	 public void  test(int a , String b) {
		 System.out.println("dfsdfsdfsa");
	 }
	 public void test(String b, int a) {
		 
	 }//위에 두 개는 됨 자료형으로 구분이 가기 때문에
	}
