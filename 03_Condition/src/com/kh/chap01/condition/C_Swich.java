package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Swich {
	public void methode2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("메뉴명을 입력해주세요");
		String name = sc.nextLine();
		System.out.println(name);
		
		
		int price=0;
		switch(name){
			case"부대":price=13000;break;
			case"수졔비":price=10000;break;
			case"제육":price=8000;break;
			case "칼국수":price=8000;break;
			default: System.out.println("그런메뉴 없습니다.");
			return;
			//break를 만나면 빠져나오는 부분
			
		}
		//가격이 있을때만 뽑고 싶으면
		if (price!=0) {System.out.println(price+"원입니다");
		}
		
	
	
	
	
	}
	
	
	//return을 만나면 빠져나오는 부분
	/*현재 실행되고 있는 메소드 영역을 아예 빠져나감
	 * 메소드를 호출한 곳으로 돌아감
	 * 메소드 밖에 위치
	 */
		/*switch(name) {case"부대찌개":System.out.println("11000원입니다.");break;
		case"떡갈비":System.out.println("13000원입니다.");break;
		case"수제비":System.out.println("9000원입니다.");break;
		case"제육" :System.out.println("8000원입니다.");break;
		case"칼국수":System.out.println("8000원입니다.");break;
		default:System.out.println("그런 메뉴 없습니다.");
		//중복제거하기 
		//1. 중복된 부분은 하나로 묶기
		//2. 중복이 되지 않는 부분은 변수로 처리
	
	
	
	
	
	
	
	
	}
		
	
	public void methode3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇층 가세요?(B1/B2/B3)");
		String floor=sc.nextLine();
		System.out.println(floor);
		switch(floor) {case "B1" :System.out.println("지하 1층 입니다");break;
		case"B2":System.out.println("지하 2층 입니다.");break;
		case"B3":System.out.println("지하 3층 입니다.");break;
		
		}
		
		
		
		
		
		//메뉴주문
		//부대찌게,떡
		//사용자에게 구메할 음식의 이름을 받아서
		//각 음식마다 가격을 출력해줄것
		//10000.,130000,9000,8000,7000
	
		
	
		
		
	}
	/*swich문 이것도 조건문임
	 * [표현법]
	 * switch(case문에 기술할 동등비교할대상 정수|| 실수||문자||문자열){case각각의 경우의 수를 적음 case: 값(경우의 수) ; break;
	 * case 정수 ,문자,실수.문자열: 실행할 코드
	 * 
	 * switch(정수||문자||실수||문자열{
	 * case 값1 : 실행할 코드a;//동등비교대상==값1true일 경우 실행할 코드a를 수행
	 * case 깂2 : 실행할 코드b;//동등비교대상==값2true일 경우 실행할 코드 b를 수행
	 * case 값3 : 실행할 코드c;//동등비교대상 == 값3true일경우 실행할 코드 c를 수행
	 * 
	 * default:그외의 나머지 값
	 * break:switch 영역을 빠져나감
)	 * break; 
	 */
	
	
	//조건문
	public void login() {
		//로그인 구현하기!
		//개발자로서 첫번째 단계 기획 / 설계
		//기획> 뭘 만들지?
		//설계> 어떻게 만들지?
		//아이디 비밀번호 입력
		//1.사용자가 입력한 아이디 
		//2.사용자가 입력한 비밀번호
		//3. 어떤 자료형인지
		//4. 보통은 문자열이니까>Strig타입
		//5. 로그인전 필요한 선행작업: 회원가입
		
		
	// 1. 회원가입 시 사용자가 원하는 아이디와 비밀번호 값을 입력하여 회원가잉ㅂ을진행함
		//2. 가입시 시 사용자가 입력한 아이디와 비밀번호 값이 일치해서 입력할 경우 로그인 창 출력
		
		
		
		String id ="user01";
		String password= "pass01";
		String name="홓길동";
		
		System.out.println("kh업텐");
		System.out.println("============");
		System.out.println("로그인 서비스");
		System.out.println("==================");
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------");
		String userId = sc.nextLine();
		System.out.println("아이디");
		
		System.out.println("비밀번호");
		String userPwd=sc.nextLine();
		System.out.println("-------------");
		//만약에 사용자가 ㅇ로그인 시 입력한 아이디 값과 회원가입 시 가입한 아이디 값이 동일하고
		//사용자가 로그인 시 입력한 비밀번호 값과 회원가입 시 가입한 비밀번호 닶이 동일하다면
		if(userId.equals(id)&&userPwd.equals(password)) {
			System.out.println("로그인 성공"+name +"님 환영합나다");
		}else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않음.");}
		//기본자료형 : boolean,char,String,int,long,byte,short,float,double
		//기본자료형의 경우 동드비교 연산자룰 수행하는데 있어 문제가 없음
		//탐조자료형: 그외
		//동등비교 연산자를 통해서 값을 비교하는것이 불가능
		//실제 변수에 담기는 값이 '주소값'이기 때문
		// 문자열의 값을비교 
			
		}

		
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
