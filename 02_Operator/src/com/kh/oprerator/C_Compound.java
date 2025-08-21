package com.kh.oprerator;
import java.util.Scanner;

public class C_Compound {
	
	
	/*
	 * 복합대입 연산자 : "=" 대입연산자
	 * 다른 산술연산자와 대입연산자가 결합한 것 
	 * => 자기자신의 값과 해당 산술연산을 한 후 그 결과를 자기자신에게 다시 대입하는 용도
	 * 산술연산자
	 *  +-* /
	 *  +=
	 *  endDays = endDays -1;
	 *  endDays-=1;
	 *  
	 *  
	 *  
	 *
	 *
	 *
	 *
	 *
	 *
	*/
	public void methode() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 하나만 입력해주세요");
		int number = sc.nextInt();
		System.out.println(number);
		//사용자가 입력한 겂을 알 수는 없다 
		// 사용자가 입력한 값에서 10을 뺀 값을 출력
		number = number -10;
		System.out.println("10을 감소시킨 정수 값 :"+ number);
		//복합대입 연산자를 이용 하여 
		number-=10;
		System.out.println("20을 김소시킨 정수 값:ㅣ"+ number);
		

		System.out.println("크게뭔가 달라진게 없다.");
	}

}
