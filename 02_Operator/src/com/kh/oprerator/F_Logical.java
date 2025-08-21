package com.kh.oprerator;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
public class F_Logical {
	
	
	
	public void methode7() {
		int num = 10;
		boolean result = false&& (num>0);
				
		boolean result2 = (num <0)&&(num==10);
				//숏 서킷 연산
			}
	
	/*논리연산자: 두개의 논리값을 연산하는 연산자
	 * 
	 * [표현법]
	 * 논립값 논리연산자 논리값=> 결과값도 논리값
	 * 종류 
	 * 
	 * 1. AND연산자: 논리값 &&논리값
	 * 좌항과 우항의 값이 모구 true여야만 최종 결과 값이 true
	 * 2.OR연산자: 논리값 || 논리값
	 * 좌항과 우하의 값 중 하나라도 true일 경우 최종 결과값이  true
	 * 
	 * 
	 * 
	 * 
	 */
	public void methode2() {
		
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		System.out.println(num2);
		boolean result2 = (1<=num2) && (num2<=100);
		System.out.println("정수가 1~100 사이의값입니까?:"+ result2 );
		
		
		}
			
	
	public void methode() {
		//계획
		//시용자예게 정수값을 하나 입력받은 후 
		//사용자가 입력한 정수 값이 0보다 크면서 짝수인자 판변
		//그리고 나서 결과를 출력
		//
		//
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력해주셰요>:");
		int num =sc.nextInt();
		//System.out.println(num); //임의로 변수를 놓고 출력해서 확인헤본다
		//2.무슨값?
		//1. 0보다 큰가?(대소비교) num> 0
		//2. 2로 나는 나머지가 0과 일치하는가?(동등비교) 사용자가 입력한 값(num)%2 == 0
		
		//2개의 조건을 다 만족하려면 AND연산자를 사용해야함 
		// 표기법은 && : 그리고 이면서 이고
		boolean result = (num>0)&&(num%2==0);
		//사용자가 입력한 정수가 0보다 크다 그리고 사용자가 입력한 정수를 2로 나눴을때 나머지가 0인가요?
		System.out.println("0보다큰면서 짝수입니까?:"+ result);}
		
	 
			//사용자에게 정수값을 받아서 
			//변수에 대입한 뒤
			//출력해보세요
		
		//사용자가 입력한 정수가 1~100 사이의값인지 확인하기
		// 무슨값?
		//1. 사용자가 입력한 정수 ==number
		//2.1(비교할 값)
		//3.100(비교할 값)
		
		//어떤연산?
		//(0<number)&&(number>100)
		//(100>=number)&&(1<=number)
		//(1<=number)&&(number<=100) 이게제일 보기 편하긴 함 왜냐하면 우리가 알아야할 값은 저 두 논리조건을 동시에 만족을 하는 number을 알아야 하니까 number가 가운데 오게 함 그 동시가 중요하니까  
		
	public void methode3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("한글자만 출력해저");
			
			char letter = sc.nextLine().charAt(0);
			System.out.println(letter);
			//개행문자 이전까지 넣는다
			/*
			 * 
			 * 
			 * String str = "kh정보교육원";
			 * 
			 * char ch = str.charAt(2);System.out.println(ch);
			 * 
			 * index: 0부터 시작
			 * 
			 * 1. 무슨값? ==1.letter
			 * 2A
			 * 3a
			 * 2.연산?
			 * 동등비교 뭐링 똑같은지 보는거니까
			 * 단일문자의 경우 동등비교 연산이 가능한가=?
			 * 가능하다 왜?
			 * char형이 int형으로 자동형변환이 일어난 뒤 연산을 함
			 * 
			 * || :이거나 또는
			 *
			 * 			 
			 * 
			 * 
			 * 
			 */
			boolean result2 = (letter == 'a') || (letter == 'A');
			System.out.println("사용자가 입력한 값이 'A'또는 'a'인가요?:"+ result2);
			/*AND(&&) : 두개의 조건이 모두 true일 경우 true
			 * true&&true :true
			 * true&&false: false
			 * false&&false: false
			 * false&& true: false
			 * 
			 * or(||) : 두개의 조건 중 하나라도 true일 경우 true
			 */
				//숏 서킷 연산
	
			
			
			
			
			
			
		}
			
			//사용자에게 한 글자를 입력 받아서 
			//입력받은 값이 A a인지 확인 해서 출력
			
		
			
		
		
		
		
	}


