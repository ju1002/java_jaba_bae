package com.kh.chap02.loop;

public class B_While {
	public void methode1() {System.out.println("무한반복");}
	
	
	
	
	/* while문 
	 * [표현법]
	 * 초기식;(필수는 아님)
	 * while (조건식) {
	 *반복적으로 실행하고자 하는 코드; 
	 * 증감식; (필수는 아님) 
	 * 
	 * 
	 * 
	 * }
	 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자하는 코드가 실행
	 * for >개발자가 반복의 횟수를 명확하게 알고 있다.
	 * while>개발자가 반복의 횟수를 거늠할 수 없음.(무한반복)
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
	public void method2 () {
		int i=0;
		while(i<3) {System.out.println(i);
		i++;}
		
		//증감식과 출력문의 순서 변동이 가능함 그의 따라 출력되는 결과도 변함
		}

	public void method3()
	{int i=1;
	int sum = 0;//힙계를 저장해둘 변수
	while(i<=6) {
		if(i%2==0) { sum+=i;}
		i++;}
	System.out.println("합계:"+sum);
		
		//1~10까지의 정수 중 짝수의 합 출력
		//55
	}	
	
	public void method4() {
		
	//합계 >sum으로 무지성을 생각함
	//1부터 시작해서 1~10사이의 랜덤한 정수까지를 모두 더한 합계를 출력
	//Math라는 클래스가 가지고 있는 random()를 호출해서 만들어 볼 예정
		//Math.random();(System.out.println(Math.random());
		//random)결과값 0.0~~0.999999999999999
		//1단계 random () 호출 결과	
	}
	public void lotto() {
		//로또 번호 생성기 ver_0.1
		//1~45
		//6개 선택
		//0.0~44.999999999
		//0~44
		int num1 = (int)(Math.random()*45) +1;
		int num2 = (int)(Math.random()*45) +1;
		int num3 =(int)(Math.random()*45)+1;
		int num4 = (int)(Math.random()*45)+1;
		int num5 = (int)(Math.random()*45)+1;
		int num6 = (int)(Math.random()*45)+1;
		System.out.println("이번주는 이걸로 사야겠다");
		System.out.printf("%d,%d,%d,%d,%d,%d,num1,num2,num3,num4,num5,num6");	
	}
	//do-while
	//별도의 조건검사 없이 무조건 한 번은 실행~~~
	//조건이 true값이 아니더라도 한 번은 꼭 수핼!!!
	//[표현법]
	//초기식;//필수x
	//do{실행할 코드; 증감식; 필수x}while(조건식);
	public void methode5() {do {System.out.println("일단 한 번 해봐ㅏ");}while(false);
		
	}
	
	
	
		
		
	}
	
	
	
	
	

