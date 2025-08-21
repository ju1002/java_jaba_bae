package com.kh.chap01.run;

import java.util.Scanner;

public class B_Else {
	/*
	 * if ~else
	 * [표현법]
	 * if[조건식] {조건식의 결과가 true일 떄 실행할 코드} -a
	 * 
	 *
	 * } else { 조건식의 결과가 false 였을때 실행할 코드 }-b
	 * 조건식의 결과가 true일때 a를 실행 
	 * 조건식의 결과가 false 일때 b를 실행
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	public void methode1() {
		//시용자에게 정수를 입력 받아서 0보다 큰지 아닌지 판별 후 출력
		Scanner sc =new Scanner(System.in); 
		System.out.println("정수 주세여");
		//사용자가입력한값을 변수에 담아야함
		int number =sc.nextInt();
		//출력 한번 해줌
		System.out.println(number);}
		//이제 0보다 큰지 안큰지를 판별해야함
		//0보다 크다면? 물음표니까 조건문인걸 떠올림
		//조건문이면 if
		//if(사용자가 입력한 정수가 0보다 클경우) {System.out.println("입력한값이 0보다 큽니다!");
		
		
   
	
	
	
	
	    
	    /*사용자에게 나이를 입력 박고
	     * 입력받은 나이에 따라 각기다른 내용을 출력
	     * 1~12 어린이
	     * 13~17 청소년
	     * 18~ 성인 입니다
	     * 자바에서는 조건식이 한번에1<=num<=12 이렇게 한번에 안됨
	     * 따라서 나눠서 해야함
	     * &&으로 묶어서 해야함
	     */
	    public void methode3() {
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("나이를 입력해주세요");
	    	int num1 =sc.nextInt();
	    	System.out.println(num1);
	    	if(1<=num1&&num1<=12) {
	    		System.out.println("어린이 입니다");
	    	}
	    	else if(13<=num1&&num1<=17) {System.out.println("청소년 입니다");}
	    	else {System.out.println("올바른 값을 입력해주세요");
	    	}
	    	//가장 넓은 범위에 조건문 먼저 하면 좋다
	    	//가장 적은 범위에 조건문이 마지막 else에 오도록 하는것이 간추릴 수 있다.
	    	if(num1<1) {System.out.println("올바른 나이를 입력해주세요");}
	    	else if(num1>=18) {System.out.println("성인 입니다.");}
	    	else if(num1<=12) {System.out.println("어린이 입니다.");}
	    	else{System.out.println("청소년 입니다.");}
	    	
	    	}
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
   

	
		//만약에 else를 안쓰면 if!(number>0)~~~~
	// 불필요한 연산이 줄어든다는 것은> 처리속도가 향상됨.
/*if ~else 
 * if (조건식1) {조건식1이 true일 경우 실행할 코드
 * }else if(조건식2) {조건식2가 true일 경우 실행할 코드}
 * else if(조건식3) {조건식3이 true일 경우 실행할 코드}
 *else if (조선식4) {조선식4가 trued일 경우 실행할 코드}
 *else{앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드}
 * 
 * 
 * 
 * 
 * 정수를 입력받아서 0보다 큰지 / 0인지/0보다 작은지 출력
 * 
 * 
 */
     
