package com.packge;

//1절 import절을 작성해서 어떤 패키지에 존재하는 클래스를 사용할 것인지 선언
import com.kh.variable.Casting;


import java.util.Scanner;
public class B_KeyboardInput {
	/* 키보드를 이용해서 사용자에게 값을 입력받을 예정
	 * 자바에서 제공해주는 Scanner라는 클래스를 사용합시다
	 * scanner클래스에 존재하고 있는 메소드를 호풀해서 입력을 받을 수 있음
	 * 
	 * 
	 * 
	 * 
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
	public void inputTest() {
	//2절 클래스의 별칭을 지어두면서 new(생성)를 해줌
		Scanner ca = new Scanner(System.in);
	//System.in : 표준 입력 도구에서 입력받은 값들을 받겠다.(바이트 단위)
		System.out.println("dk");
		
		//원섬후레이스
		//사용자에게 주문할 음료를 입력빋아서 출력해보자
		System.out.println("메뉴판");
		System.out.println("원섬후레이스에 오신것을 환영 합니다.");
		System.out.println( "한교동 갈릭 쉬림프");
		System.out.println("마마망고 수무디");
		System.out.println("아쭐망고");
		System.out.println("주문하실 메뉴를 입력해 주세요");
		
		String menu  = ca.next();
		//next() : 사용자가 입력한 값을 입력받음
		
		// 사용자가 입력한 값을 출력해 주기
		//"물을 주문해 주기"
		//사용자가 입력한 값 중 공백이 있을 경우에 공백문자 이전까지만 입력받음
		//사용자가 입력한 값을 립력해주기
		
		System.out.println(menu+ "를 주문하겠습니다.");
		
		//몇 잔 이요?
		System.out.print("몇 개 주문하시겠습니까?");
		int number = ca.nextInt();
		System.out.println(menu + "를" + number + "를 주문히셨습니까");
		System.out.print("주소지를 입력해주세요");
		// nextLine()사용자가 입력한 값을 공백과 무관하게
		ca.nextLine();
		String address = ca.nextLine();
		
		System.out.println(menu+ " " + number +"걔를" + address+ "로 배달합니다");
		
		
		//입력한것은 버퍼로 깂이 먼저 이동을 히게됨 (임시기억장치)
		//입력버퍼에서 저장공간 으로 어떻게 넘어가는지
		// nextLine() : 개행문자 이전까지 전체를 다 읽어옴 입력 버퍼에서 개행문자를 날려줌
		// 입력버퍼에 존재히는 개행문자를 날려줌
		
		 
		
		
	}
	
	
	
	

}
