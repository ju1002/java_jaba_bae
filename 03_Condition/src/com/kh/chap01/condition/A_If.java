package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*단일 if문
	 * [표현법]
	 * if(조건식){조건식이 true일 경우 실행하고자 하는 코드;
	 * 
	 * 
	 * }
	 * =>조건식의 결과가 teue알 경우: if문 Scop({})안의 코드가 수행
	 * 조건식의 결과가 false일 경우 : if문Scop){})를 거너뜀
	 * 
	 *  (조건식) if문의 조건식 자리에는 결론적으로 true아니면 false 값이 들어가도록 만들어야함
	 *  변수 메모리에 값을 저장하는 공간
	 */
	public void methode() {
		if(0<1) {System.out.println("0이 1보다 작습니다");
		
		//System.out.println("나 모범시민이야");
		}
		if (false) {System.out.println("얘는 죽었다깨어나도 안나옴");}
		
		if (true){System.out.println("조건식 자링에는 최종적으로 true가와야함");}
		
	
	}
	public void methode2() { 
		boolean LoginCheck = false;//로그인 상태를 저장해둔 변수 
		if(LoginCheck==false) {System.out.println("네이버를 더 안전하고 편리하게 이용해봇[요");
		System.out.println("naver로그인");
		System.out.println("히원가입");}
		
		if (LoginCheck) {System.out.println("홍길동님 환엽합니다");
		System.out.println("메일|카페| 블로그|쇼핑|예약");
		}}
	public void lunchMenu() {
		Scanner sc= new Scanner(System.in);
		System.out.print("오늘의 날씨는 어떤가요(더움/맑음/비옴)");
		String weather = sc.nextLine();
		System.out.println(weather);
		//비옴을 입력한다면 김빕천국을 가
		//사용자가 입력한 값과 "비옴"이라는 문자열 값을 동등 비교해서 일치하는지 비교
		//weather 과 "비옴"이 동등비교를 통해 일치하는지 비교
		//System.out.println(weather.equals("비옴"));
		//문자열은 동등비교를 할 수는 없음 그대신 문자열 값이 일치하는지 비교를해주는메소드를 호출해야함
		//그때의 메소드는 .equals()
			//날씨를 입력받아서 점심메뉴 추천
			//만약에 사용자가 입력한 문자열이"비옴과 일치한다면	김밥천국
		//if      weather           "비옴"     .equals() 
		if (weather.equals("비옴")) {System.out.println("김밥천국 스페셜정식드세요");}
		//만약에 사용자가 입력한 문자열 값이 "더움"과 일치하다면 
		if(weather.equals("더움")) {
			System.out.print("김밥일번가에서 냉모밀 드세요");
		}
		if(weather.equals("맑음")) {System.out.print("편의점에서 불닭볶음면을 드세요");}
		
		}
	
	
	public void methode3(){
		Scanner sc=new Scanner(System.in);
		System.out.println("0보다 큰 정수주세요");
		int number=sc.nextInt();
		System.out.println(number);
		boolean rion =number>0;
		if((rion && number%2==0)) {System.out.println("짝");}
		if((rion && number%2!=0)) System.out.println("홀");
		
		//사용자에게 정수값을 받아서  홀 / 짝을 판별=>출력
		//if문을 이용해서 출력
		//단 입력받은 정수가 0보다 클경우에만 조건문을 실행
		//조건문을 만드려면 비교연산자를 통해 만듬
		//입력받은 정수를 나눈 나머지를 0과 동등비교\
		// number %2 ==0 짝
		//!number %2==0 홀
		//if문 중첩
	}
	//원섬후레이스
	//1.메ㅣ뉴판보여주기
	//2.메뉴번호로 입력빋기
	//3.수량도 입력받기 몇 잔 인지
	//4.조건문
	//fi문을 이용해 입력한 메뉴번호에 따라 메뉴면 대입하기
	//혹시나 없은 경우 없는메ㄴ라고대입하기
	//xxxx메뉴를 xxx잔 주문하셨습니다 출력해주기
	//진짜주문할건지 물어보 기
	//Y/N입력받아서 확인하기
	//단일문자가 Y또는 y와 일치한단면
	
	
	public  void methode4() {System.out.println("메뉴판보여주기");
	System.out.println("1.호박고구마");
	System.out.println("2.휘낭시에");
	Scanner sc =new Scanner(System.in);
	int menu = sc.nextInt();
	//System.out.plrintln("선택한 메뉴 번호 : " + menu);
	System.out.println("무슨 메뉴를 주문하실건가요?");
	int cup = sc.nextInt();
	System.out.println("몇 잔 주문하실 건가요?");
	
	
	
	
	
	
	
	

	

	
	
	}
	}
	
		
	

	


