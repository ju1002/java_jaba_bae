package com.kh.chap03_eclipse;

import java.util.Scanner;

public class A_Break {
	
	/*주의사항 : switch문 내부에 작성하는 break문과는 구분을 해야할 필요가 있음!
	 * switch문 내부에 있는 break는 switch문을 빠져나가는 용도로 사용
	 * break:break문을 만나는 순간 "가장 가까운 반복문"을 빠져나감
	 * break;문이 속해 있는 반복문"한 겹"만 빠져나감
	 */
	public void methode1() {
		//System.out.println("안녕 나는 메소드 1이얌~");
		
		
		
		//무한 반복하면서 랜덤한 정수(1~100)를 생성해서 출력하다가
		//무한 반복이니까 while
		//랜던함 정수니까 Math
		while(true) {
			int num = (int)(Math.random()*100)+1;
			System.out.println(num);
			//생성된 정수값이 50이면 멈춰!
			//조건
			if(num==50) {System.out.println("멈춰~");
			break;
			}
			
			
			
			
		}
	}
	public void methode2() {
		Scanner sc =new Scanner (System.in);
		while(true) {
			System.out.println("아무거나쓰셈 종료를 원한다면 'exit'를 입력해 주세요");
			String keyword= sc.nextLine();
			System.out.println(keyword+"은"+keyword.length()+"글자입니다");
			if(keyword.equals("exit")) {System.out.println("프로그램을 종료합니다");
			break;}
			}
		
		
		//무한 반복하면서 사용자에게 매 번 문자열을 입력받은 후
		//해당 문자열의 길이를 출력
		//단,사용자가 입력한 문자열이"exit"과 같다면 반복을 종료
	}
	
	
	//매번 사용자로부터 정수값을 입력받고 
	//만약 입력한 숫자가 0보다 작다면"프로그램을 종료합니다" 문구를 출력라고 종료하시오

	public void methode() {
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("숫자를 입력해주세요");
			int num= sc.nextInt();
			System.out.println(num+"=>0보다 작습니다.");
			if(num<0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			}
	}
	///사용자로부터 한 개의 정수값을 입력받아서
	//입력받은 숫자로부터 1까지의 모든 숫자를 출력해보아요ㅣ
	//단 입력받는 정수가 1보다 커야함
	// 만약 1미만의 숫자를 입력 받았다면 "1이상의 숫자를 입력해주세요"라고 출력한 뒤
	//다시 사용자에게 값을 입력 받을 수 있도록 만들자
	//
	public void methode3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이야");
		//while(true) {
			System.out.println("숫자를 입력해주세요");
			int num=sc.nextInt();
			if(num>1) {for(int i=num; i>0;i--) {System.out.println(i+"");} 
			System.out.println();
			}
			else {System.out.println("1이상의 숫자를 입력해주세요");}
			}
			//System.out.println("정답입니다");
			//if(num<1) {System.out.println("틀립 답입니다");
				//System.out.println("1이상의 숫자를 입력해주세요!");
				//break;
			}
					
		
		
		
		
	
	
	



