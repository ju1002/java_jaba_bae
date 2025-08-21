package com.kh.oprerator;

public class E_Comparison {
	
	
	
	
	/*
	 * 비교연산자 (관계연산자)
	 * 두개의 값을 가지고 비교, 이항연산자ㅏ
	 * 비교연산을 한 결과 > 참인 경우 true,false
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 예정 
	 * !는 비교연산자 앞에 작성하면 그 빈대가 된다.
	 * 종류
	 * 동등비교, 대소비교
	 * 1. 동등비교 : 일치함을 비교
	 * a == b: a와 b가 일치합니까?
	 * 같다라고 정한게 아니라 의문문으로 생각해보자
	 *
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * 2. 대소비교: 크고 작음을 비교
	 * a<b :a가 b보다 작습니까?
	 * a>b : a가 b보다 큽니까?
	 * a<=b : a가 b 작거니 같습니까?
	 * a>=b : a가 b 크거니 같습니까?
	 * 
	 */
	
	public void methode() {
		System.out.println("호호호");
		
		int firstNumber = 10;
		int secondNumber = 25;
		System.out.println( " firstNumber < secondNumber:"+ (firstNumber<secondNumber));
		System.out.println("두 값이 같나요?"+ (firstNumber == secondNumber) );
		System.out.println("firstNumber가 짝수입니까?:"+ (firstNumber%2 == 0));
		System.out.println("secondNumber가 홀수 입니까?:"+(secondNumber%2 == 1));
		//무슨값이필요하지?
		//firstNumber
		//무슨연산을하지?
		//비교연산
		// 2로 나눴을때 나머지가 0임?
	}

}
