package com.kh.oprerator;
 
public class B_InDecrease {
	
	
	
	/* 증감연산자: 단항연산자러 한 번에 1씩 증가(더하거아). 감소(뺴거나)하는 연산을 함
	 * ++:값을 1감소 시키는 연산자
	 * --: 값을 1감소 시키는 연산자
	 * 
	 * 
	 * >증감을 먼저 할건지, 나중에 할건지에 띠리 연산자의 위치가 달라짐
	 * 연산자의 위치 
	 * 전위연산: ++값, --값
	 * 후위 연산:값++, 값-- 먼저 값을 빼 따로 처리하고 증가 감소 
	 */
	
	
	
//후위연산 첫 번쨰 메소드
	public void method1() { 
		System.out.println(2);
		int num = 10;
		System.out.println("num:" + num);
		num++;
		System.out.println("num:"+ num);
		num--;
		System.out.println("num" + num);
		
	}
	public void methode2() { 
		int a = 10;
		int b= a++;
		System.out.println("num:"+ a);
		System.out.println("num"+ b);
		/* 32행의 좌항: b라는 식별자를 가진  int형 변수공간
		 * 우항 a라는 변수 공간에 대입된 정수형 리터럴 값을 가져옴
		 * a라는 공간의 값을 1증가
		 * 가져온 리터럴값을 b공간에 초기화
		 * 결론은 11이 됨
		 * 
		 */
		
		
		
		
		
		
		
	}
		
	public void method3() {
		int a=10;
		int b=++a;
		System.out.println("a:" + a);
		System.out.println("b:"+ b);		
		
	}
		
		
		
		}
	


