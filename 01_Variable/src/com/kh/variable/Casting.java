package com.kh.variable;

public class Casting {
	/*
	 * Type Casting:(자료형 변환): 자료형을 바꾸는 개념  매우중요
	 * 자바에서 값을 처리하는 규칙
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 3가지:
	 * 1.=(대입연산자)를 기준으로 좌항과 우항이 같은 자료형이어야 함
	 * 같은 자료형에 해당하는 리터럴값이 대입할 수 있음
	 * 자료형이 다를 경우 - 값을 바꿔서 대입해야 함 
	 *2. 같은 자료형들 끼리만 연산이 가능 
	 *자료형이 다른데 연산이 하고싶다? 둘 중에 하나를 " 형변화해서 나머지 하나와 동일하게 맞춤
	 *
	 *3.연산의 결과물고 동일한 자료형이어야한다.
	 * 
	 * ex) 1+1=2(정수) 1.1+1.1= 2.2(실수)
	 * 
	 * 
	 * 형변화 방법 값을 다른 자료형으로 바꾸고 싶을때 (바꾸고싶은자료형)값
	 * 
	 * 
	 * 
	 * 종류
	 * 1. 자동형변환(Promotion) 자동으로 형변환이 됨
	 * 작은크기의 자료형에서 큰기의 자료형으로 바뀔떄 
	 * 직접 우리가 형변환을 할 필요가 없다
	 * 2. 강제형변환 (Type Casting): 자동형변환이 이루어지지 않는 경우 진행
	 * 직접 형변환을 해야할때 (바꾸고싶은자료형)값
	 * boolean: 1Byte
	 * char: 2Byte
	 * float: 4Byte
	 * double:8Byte
	 * int: 4Byte
	 * byte: 1Byte
	 * long: 8Byte 
	 * short: 2Byte
	 * char: 2Byte
	 * 
	 *  
	 * 
	 */
	
	
	//자동형변화(Promotion) : 작은 자료를 큰 자료로 바꾸어야 할떄
	public void autoCasting() { 
		System.out.println("이 내용을 콘솔창에 출력해보세요 실습 시작! ");
		
		//1, int(정수, 4Byte) double(실수< 8Byte
		
		int intNum = 10;
		double doubleNum = (double)intNum;
		//좌항 double 8Byte고 intNum은 4Byte 자료형이 다름 맞춰주기 해야함
		System.out.println(doubleNum);
		System.out.println(intNum);
		//2. int(정수,4Byte) long(8Byte,정수)
		int bigInteger = 120;
		long snallLong = bigInteger;
		//(long)
		System.out.println(snallLong);
		
		//3.long(정수, 8Byte) float(실수,4Byte) 특이케이스
		long longNumber = 1000L;
		                     //promototion xxxx
		
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		//정수가 실수로 변환될 때 큰사이즈의 정수타입이 작은 사이즈 실수 타입으로  형변환
		// 4Byte float 형이 long형보다 표연할 수 있는 깂의 범위가 더 넓기 때문
		//
		System.out.println("====================");
		//4. char(2Byte) int(Byte)
		char cha = 'a';
		System.out.print(cha);
		int num = cha;
		System.out.println(num);
		char ch2 = 97;
		System.out.println(ch2);
		
		//아스키코드에 의해 97로 표현됨
		
	//더하기르
		
		//번오ㅣ Byte형 short혈
		byte byteNum = (byte)123;
		byte b2 = 126;
		byte b3 =3;
		System.out.println((int)b2 + (int)b3);
		// 결과 값음 int형 연산장치가 값을 처리하는 크기가 int형크기 4Byte
		//비교연산자 (==) 동등비교를 할때 사용
		//좌항과 우항의 값을 비교해서 결과값을 반환
		//나올수 있는 값  true/false
		System.out.println("비교연산자를 사용해보자");
		System.out.println(1==2);
		System.out.println('a'=='b');
		System.out.println((char)2 =='2');
		System.out.println((int)'2');}
		
		
		//강제 형 변환 : 큰크기의 자료형 작은 크기이 자료형으로 바꿀때
		// (바꿀자료형) 값 
		//double(8Byte)  int(4Byte)
		public void folceCasting (){
			
		double doubleNum = 10.123123;
		int intNum = (int)doubleNum;
		double dNum = intNum;
		System.out.println(dNum);
		
		}
		
		
		
		
		
		
		
		
	}
	//
	
	


