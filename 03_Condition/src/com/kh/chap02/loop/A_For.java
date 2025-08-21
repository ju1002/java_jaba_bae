package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void methode0() {
		System.out.println("자 월요일 힘냅시다");
		for(int i=0; i<5; i++) {
			System.out.println("으아아아아아앙");
			
			
		}
		
		
	}

/*
 *  
 *  for문 
  
 *  for(){}

 *  괄호안은 반복의 횟수를지정하는 부분
 *  초기식;조건식;증감식 세가지로 이루어짐
 *  ;;세미콜론으로 구분함
 *  
 *  [표현법]
 *  for(초기식;조건식;증감식){내가 반복적으로 실행하고자 하는 코드;}
 *  -초기식: 반복문을 시작할때 "초기에 단 한번만 실행" 될 구문
 *  반복을 할때 필요한 변수를 선언하고 초기화 하는 구문 (제어변수) > int i=0;
 *  -조건식: "빈복문이 실행괸 조건" 을 작성하는 구문
 *  조건식의 결과가 true일 경우 반복을 수행
 *  조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴>i<5;
 *  - 증감식 : "반복문은 제어하는 변수에 대압된값" 을 증감하는 구문 
 *  보통 초기식에서 선언된 변수를 가지고 증감식 작성
 *  이 떄, 보편적으로 증감연산자를 사용함>ㅑ++
 *  for:~동안
 */
    public void methode1() {
    	//1
    	//2
    	//3
    	//4
    	//5
    	/*System.out.println(1);
    	System.out.println(2);
    	System.out.println(3);
    	System.out.println(4);
    	System.out.println(5);
    	System.out.println(6);
    	System.out.println(7);
    	System.out.println("1\n2\n3");*/
    	
    	
    	//for(int i= 1; i<=2000; i++) {System.out.println(i);}
    	// 초기식이 1번 먼저 뵈야함 결과 i는 1임 조건식이 2번 조건식의 결과가 true 3번{}안으로 1번 반복 4번 증감 결과 i++ 1이 증가함 2 이다 4번이 끝나면 2번으로 이동 여기서 부터 1cycle끝남 
    	//그다음 cycle로 2번부터 시작 2는5보다 작니? true 실행결과 2번 반복이라고 출력 그 후 2가 1증가 해서3이 됨 3cycle 그 후 다시 또 2번 3이 5보다 작니? true 그다음 3번 반복 출력 3의 
    	//1증가 4 4cycle 4는 5보다 작니? true 4번반복 출력 4의 1증가 해서 5 5cycle 5는 5보다 작거나 같니? true 5번반복 출력 5의1증가해서6이됨 6cycle 6은 5보다 작거나 같니?false 그 후 
    	// for문 {}바깥으러 이동 그럼 끝끜 끛 끞 끜끝 끛 끞 끜끝 끛 끜 끝 끛끞
    	//or(int i=1; i<=5; i++) {System.out.println(i+"번 반복");}}
    	// 보통 i,j,k를 보통 쓴다.
        for(int i =0; i<3; i++) {
        	System.out.println(i);
        	
        	//for(int i=0; i<5; i+=2) 2씩 증가 함
        	//for(int i=0; i<6; i--) 1씩 감소 함
        	
        	
        	
        	
        	
        	
        }}
        
        
        
        
        
        
        
        
        
        
        public void gugudan() {
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("구구단을 외자");
        	System.out.println("몇단을 출력하시 겠습니까?");
        	
        	int gugu = sc.nextInt();
        	System.out.println(gugu+"단을 출력하겠습니다.");
        	
        	
        	//코드 작성 전 구구단이 어떻게 되는지 먼저 생각
        	// 문법 적용전 출력 결곽가 어떻게 되는지 먼저 확인
        	//그 후 어떤 문법을 적용할지 생각
        	//System.out.println(("5x1="+5)
        	//고정되는게 System.out.ptintln, *곱하는 수 1~9까지 이것은 고정 나머지는 변함
        	//System.out.println(gugu+"곱하는 수 
        	
        	for(int i = 1; i<=9;i++) {System.out.println(gugu+ "x"+i+(gugu*i));
        	}
        	
        	//구구단 프로그램
        	//사용자에게정수를 입력 받아서 
        	//사용자가 입력한 정수를이용해서 구구단을 출력해보기
 
        	
        }
    	
        public void methode3() {
	    
	        for (int i=0; i<3; i++) {
		        for(int j=0; j< 3; j++) {
		        	System.out.print("★");
		        }
		        System.out.println();
	        }
//for (int i=0; i< 100 ; i++) {System.out.println((i+1)+"번째 반복입니다");
//if((i+2) %10==0 ) {System.out.print("♥");}

}
//}
        public void methode4() {
        	for(;;) {System.out.println("구구단 프로그램");
        System.out.println("1.구구단 프로그램 시작하기");
        System.out.println("2.구구단 프로그램 설명보기");
        System.out.println("3 프로그램 종려하기");
        Scanner sc= new Scanner(System.in);
        int menuNo =sc.nextInt();
        sc.nextLine();
        if(menuNo ==1 ) {gugudan();}
        else if (menuNo ==2 ) {System.out.println("구구단 을 동작시켜줘요");}
        else if (menuNo ==3 ) { System.out.println("프로그램을 종료합니다");}
        else{System.out.println("없는 구구단입니다.");}}
        
        
        
        }

        
        
        
        
        }


