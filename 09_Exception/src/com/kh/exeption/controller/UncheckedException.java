package com.kh.exeption.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
// 예외들을 처리하는 방법
// 프로그램 실행 시 발생하는 예외들
//	RunTimeExeption
//	NullPointExeption: 주소값 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외
//  ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근 했을때 발생하는 예외
//	ClassCastRxception : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
//	ArithmeticException :나누기 연산을 0으로 나누면 발생하는 예외
//	NegativeArraySizeException: 배열을 할당할 때 크기를 음수로 지정하면 발생하는 예외
	/*
	 * 예외들의 공통점: 전부 개발자가 예측이 가능함,
	 * 
	 */

//	ArithmeticException
/*	public void method1() {
// 사용자에게 두 개의 정수값을입력받아서 나눗셈을 한 뒤 결과를출력
	Scanner sc = new Scanner(System.in);
		System.out.println("첫번 째 정수를 입력해주세요");
		int num = sc.nextInt();
		System.out.println("두번 쨰 정수를 입력해주세요"+" 제발 0을 입력하지 마세요");
		int num2 = sc.nextInt();
	// num2에 0이 들어가면 에러가 발생
	// 방법1. 예외 발생 자체를 원천 차단해버림 ==사전에 차단해버림
	/*
	 * if (num2 != 0) { System.out.println("연산 결과:" + num / num2); } else {
	 * System.out.println("혼꾸녕 좀 나볼래?");
	 * 
	 * }
	 */

	// 방법2. 예외 처리를 진행
	/*
	 * 예외처리 예외상황을 감지하고 예외상황 발생 시 프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조취를 취하는 것
	 * 
	 * 
	 * try~ catch문 [표현법] try{ (num/num2) : 예외가 발생할수도 있는 구문 }catch(예외가 발생할 클래스 명,
	 * 변수명){ } 예외가 발생했을때 catch문을 사용해서 실행
	 * 
	 */
	//try

	//{
		//System.out.println(num / num2);
//
	//	System.out.println("올바른 정수 입력!");
	//}catch(
	//ArithmeticException e)
	{
		System.out.println("두번 쨰 정수에 0을 입력하시면 나눌 수가 없습니다.");
	}
	//try블럭을 통해 예외를 감지하고  예외 발생시 바로 catch문으로 이동 catch문에서 에러 발생시 대응한다.
	//System.out.println("프로그램 종료");
	// System.out.println(num/num2);
	//System.out.println("하하호호");}

	public void homeWork() {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("메뉴를 선택해주세요");
				System.out.println("1. 추가하기");
				System.out.println("2. 검색하기");
				int menuNo = 0;
				try {	menuNo = sc.nextInt();}
				catch(InputMismatchException e){
					System.out.println("숫자만 넣어주세요");
				}
				//예외 처리시 catch문에 적어야하는 내용이 출력문은 아님
				sc.nextLine();
				System.out.println(menuNo+"번 메뉴를 선택하셨습니다.");
			}
		}
	public void method2() {
		//System.out.println("안녕!");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요(0은 제외");
		try {
		int num = sc.nextInt();
//		InputMismatchExecption
		System.out.println("100을 입력값으로 나눈 결과 :"+(100/num));}
		catch(InputMismatchException e) {
			System.out.println("숫자로 된 정수 값이 아닙니다.");}
		catch(ArithmeticException e) {
			System.out.println("0이 아닌 수로 나누어 주세요");
		}
//		ArithmeticException		
		
		
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		//ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면 파업
		//InputMismatchException: 스케너 메소드의 자료형과 일치하지 않으면 파업
		//NegatuvearraySizeException : 배열의 크기를 음수로 지정하면 파업
		try {
			int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println(arr[100]);}
		catch(InputMismatchException e){System.out.println("정수를 넣어");
		e.printStackTrace();}//얘는 꼭 개발단계에서만 사용
		catch(RuntimeException e) {
			System.out.println("아마도 음수를 입력했거나 100보다 크지 않아서>?");
		}
		//RuntimeException : 부모 느낌 때문에 자식을 먼저 사용하고 그 후에 사용한다.
		
		
		/*
		catch(NegativeArraySizeException e) {System.out.println("음수 넣지마");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
		}*/
		
		
	}
}
