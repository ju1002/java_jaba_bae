package com.kh.chap06.controll;
import com.kh.chap06.controll.OverlodadingController;
public class Human {
	public static void main(String [] args) {
		Human human = new Human();
//Human타입의 human 변수 공간을 만들고 new와 만남과 동시의 heap 영역에Human클래스의 기본생성자를 만들어서 그 주소를 human이라는 변수 공간에 넣어준다
//	method 수행을 하게 해주는 기능
		//MethodController mc = new MethodController();
		/*int a = mc.add(1.2);
		int b = mc.add(2,3);
		int c = mc.add(3.4);
		int d = mc.add(5, 6);
		int e = mc.add(a, b);
		
		*/
		
		MethodController mc = new MethodController();
		//mc.method1();
		//String returnValue = mc.method2();
		//System.out.println(returnValue);
		//System.out.println(mc.method2());
		
		/*System.out.println("메소드 호출 결과"+ mc.method3());
		mc.method4(2);
		int result = mc.method5(5);
		*/
		//mc.a();
		
		//mc.test(mc);
//		얕은 복사 => 같은 주소를 가리키는 것☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	//MethodController.staticMethod();	
		
	//System.out.println(1);
		OverlodadingController oc = new OverlodadingController();
		//컴파일이 끝난시점 어떤메소드가 호출될지 이미 결정됨
		//컴파일러가 알아서 코드를 분석하여 호출한다.자바에서는 Binding 한다 즉 묶는다
		//정적  바인딩(Static BInding)호출하는 메소드와 선언되는 메소드를 바인딩 한다.
		oc.test();//인자없이 호출 연결하는걸 
		oc.test(2);// 정수값 넣어서 호출
		oc.test("2");
		//oc.test(1,2);
		oc.test(2,"3");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
