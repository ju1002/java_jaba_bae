package com.packge;

public class A__Variealble {
	
	// com.packge.A__Variealble
	
	//변수: Memory(기억장치) RAM 에 값을 저장하기 위한 공간
	//변수를 사용하면 뭐가 좋을까?? 변수를 사용하면 뭐가 좋을까
	
	//원썸플레이스의 키오스크(시즌 메뉴)
	public void findSeasonMenu() {
		//1.시즌메뉴들을 출력
		//2.사용자가 메뉴판을  보고 주문을 했다 가정
		//3. 고객이 구매한 메뉴의 가격을 출력
		System.out.println("--- 변수를 사용하기 전---");
		System.out.println("시즌메뉴");
		System.out.println("1. 한교동 갈릭 쉬림프 (8000)");
		System.out.println("2. 수박주스(9000)");
		System.out.println("3. 자바칩(2000)");
	
		System.out.println("---------------");
		//System.out.println("딸기라떼를 25잔 시키겠습니다.");
		//자바에서 곱하기 연산을 해야하는 경우
		System.out.println("한교동 갈릭쉬림프 5잔 시키겠습니다");
		System.out.println(5000*25);
		System.out.println("원 입니다");
		//자바에서 문자열 값과 다른 형태의 값을 붙여서 사용하고 싶은 경우 
		//+ 사용
		System.out.println((8000 * 25) + "시키겠습니다");
		System.out.println((9000 * 50) + "원 입니다");
		System.out.println("변수를 사용해 봅시다");
		System.out.println("시즌 메뉴:");
		// 메뉴명과 가격이라는 값을 담을 공간
		String seasonmenue = "딸기라떼";
		int price = 6700;
		
		System.out.println("메뉴명 : "+seasonmenue);
		System.out.println("가격:"+ price);
		System.out.println(seasonmenue+"를 17개 시켰니?"); 
		
	}
		//변수선언은 저장공간의 공간을 만들었다
		//=은 같다의 의미가아니라 대입연산자 왼쪽은 공간 오른쪽은 값이다.
		// 왼쪽의 공간에 오른쪽 값을 대입한다.
		//변수의 장점 1. 단 한번의 값을 대입해서 필요한 순간마다 사용가능하다 재사용성이 높아짐
		
		// 2. 값의 의미를 부여할 수 있음 가독성이 높아짐 
		// 가독성과 재사용성이 높아지면 유지보수가 높아짐				
	 


	public void declareVariable() { 
		
		

		/* 변수 삽입방법 
		 * 
		 * 
		 * 
		 * int price \;
		 * 
		 * 자료형 (DataType) 변수식별자;
		 * 권장하는 방법은 아니지만 동일한 타입의 변수를 선언한 때는 한번에 손온 가능 
		 * int a, b, c; 권장하지 않음 
		 * 
		 * 변수를 선언라고 난 뒤 처음 값을 대입하는것을 초기화(Initialization)
		 * 초기화를 통해 대입한 값을 초기값 이라고함
		 *변수는 자신이 선언된 {scope} 에소민 시영한 수 있음 
		 *local variable(지역 변수) 
		 * 
		 * 
		 * 
		 */
	/*
	 *식별자(Identifier) 
	 * 
	 * 쿨래스명, 메소드명. 변수명 등등 개발자가 만들어서 이용하는 고유의 이름
	 *  식별자를 생성할 때꼿 지켜야 하는 규칙! (안 지키면 안만들어짐)
	 *  1, keyword(예약어)는 식별자로 사용할 수 없음 
	 *  2, 고백은 포함할 수 없음
	 *  3. 대,소문자를 구분한다  길이는 제한없음
	 *  4. 문자, 숫자, _, $ 를 포함할 수 있음
	 *  숫자로 시작은 안됨 나머지는 시작 할 수 있음 
	 *  
	 *  
	 *  
	 *  
	 *  개발자들끼리의 암묵적인 약속 (안지키면 욕먹음) 영 말고 쓰지말자 
	 *  클래스/ 인터체이스 명명 규칙
	 *  첫글자는 대문자 로 표기
	 *  연결된 단어들의 첫 글자도 대문자로 표기
	 *  명사, 형용사를 서술으로 연결해서 사용 
	 * 2. 변수명명 규칙 
	 * 명사적 의미를갖게 만들어 줌 
	 * 첫 글자는 소문자로 표기 연결된 단어들을 첫글자를 대문자로 표기
	 * 
	 * 3. 메소드 명명 규칙
	 * 동사적 의미를 갖게 민들어 줌( 명령적 어조) 
	 * 첫글자를 소문자로 표기, 연결된 단어들의 첫글자를 대문자로 표기
	 * 메소드 식별자의 경우 식별자 뒤에 반드시 한 쌍의 "()"를 붙임
	 * _ 사용하지 않음
	 * 4. 상수 명명 규칙
	 * 
	 * 모든 문자를 대문자로 표기
	 * 단어와 단어사이는 _를 사용해서 구분한다.
	 * 
	 *
	 */
	
	//변수의 자료형 
	// Java의 기본 자료ㅛ형, 원시자료형
	//Primirive Type
		
	/*
	 *  1. 논리자료형 논리 값
	 * 문자열: 참조자료혈 
		boolean isTrue;// 변수선언
		// localVaeiavle(지역변수)은 초기화( Initialized)를 해야함
		 * 
		 */
		
		boolean isTrue = true;
		System.out.println(isTrue);
		isTrue = false;
		System.out.println(isTrue);
				 
		 /* 2. 숫자 자료형
		  * 정수형
		  * 정수형에는 4가지 자료 형이 존재 함 
		  * byte, short, int, long 형이 있음
		  * int 형을 주로 써라
		  * long 형을 사용을 할때 는 대입할 숫자뒤에 L을 붙임
		  * 
		  * 
		  * 
		  * 실수형
		  * 
		  * 실수형 2가지
		  * float, double 
		  *  float 뒤에 F붙임\
		  *  
		  *  
		  *  
		  * 
		  *  
		  *   여기까지가 기본자료 형 / 원시자료형  8개
		  */
		 
		byte byteNumber = 1;     //1Byte
		short shortNumber = 2;   //2Byte
		int intNumber = 3;      //4Byte
		long longNumber = 4L;    //8Byte
	
		float floatNumber = 2.22F; //4Byte
		double doubleNumber = 3.33; //8Byte
				 
		//3. 문자형(단일) 
		char gold = '밥'; //2Byte-
		String str = "abc";
	 
		//논리자료형1개
		System.out.println("논리자료형:"+ isTrue);
	
		//정수자료형 4개
		System.out.println("정수자료형 " + byteNumber);
		System.out.println("정수자료형 "+ shortNumber);
		System.out.println("정수자료형 "+ intNumber);
		System.out.println("정수자료형 "+ longNumber);
		
		 //실수자료형 2개
		System.out.println("실수자료형 : "+ floatNumber);
		System.out.println("실수자료형 "+ doubleNumber);
		 //단일 문자 자료형1개
		System.out.println("단일문자자료형 "+ gold);
		 
		 
		 //문자열 자료형1개
		System.out.println("문자열 자료형 "+ str);
		
		
		
		
		//출력문이 종류 
		//Sustem.out.print();
		//System.out.ptint(); 개행한다
		//System.out.println("is True라는 변수의 값 : "isTrue+"
		
		//System.out.prinrf(); f는 format , 개행안함
		
		//우리가 원하는 출력물
		//isTrue라는 변수에 대입한 값 : false , char형은 : gold
		//System.out.printf("isTrue라는 변수에 댜입한 값: xxx, char형은 xxx")
		System.out.printf("isTrue라는 변수에 댜입한 값: %b, char형은 %c", isTrue, gold);
		//%b : true / flase타입의 변수공간
		//%d : byte, short, int, long 정수형 변수 공간 
		//%c : char문자형 변수를 담기 위한 공간
		//%s : String 문자열 형 변수르 담기 위한 공간
		System.out.printf("\ndoubleNum 값 : %f", doubleNumber);
		System.out.printf("\ndoubleNum 값 : %.2f", doubleNumber);
		//\t는 탭
		//\n은 개행
		//%.?은 소수점 자리까지만 볼 수 있음
		System.out.println("============================================");
		//상수 프로그래밍언어
		// 값을 변경하지 않을 변수 공간
		//선언하는데 값이 절대로 안바뀌길 원한다 그럴때 final을 붙여서 함
	}}

	 
	 
	 
	 
	 
	 

