package com.kh.oprerator;
import java.util.Scanner;
public class A_Arithmetic {
	
	//산수연산자 이항연산자
	//+ 덧셈 
	//- 뺄셈
	// *곱셈
	//  / 나눗셈 
	// % 모듈러 : 나눗셈에서의 나머지를 구함
	public void method() {
		int intNum = 10;
		int intNum2 = 3;
		System.out.println("num :" + intNum);
		System.out.println("Num2:" + intNum2);
		
		int sum = intNum + intNum2;
		System.out.println("두수의 합계 :" + sum);
		System.out.printf("num1 +num2 : %d\n", intNum + intNum2);
		System.out.println("num1 - num2 :" + (intNum - intNum2));
		//뺄셈의경우 괄호로 묶어주지 않으면
		//문자열과 num1을 하나로 합친뒤 정수를 빼기 때문에 연산이 불가능함
		
		//test();
		// 꼭 메인 메소드에서 꼭 호출 할 필요가 없다
		//연산 우선순위를 정하려면 ()사용 
		//다른값을써야지 하면 바로 변수 생각
		//*,/,% 요 친구들응 우선순위가 +, - 보다 높기 때문에 묶어주지 않더라도 
		//먼저 연산을 수행해서 결과를 얻을 수 있음
		// 가독성 향상을 위해 괄호를 사용하는것을 권장
		System.out.println("num1+ num2:" + intNum * intNum2);	
		System.out.println("num1+ num2:" + intNum / intNum2);
		
		
		
	}
	
	public void test() {
		System.out.println ("s에에에에");
	}
	//apthem 
	//사용자에게 값을 입력 scanner scanner사ㅏ용하려면 scanner를 불러와야함 
	//1나눠줄 학생의 수 nextiInt
	//2.사탕 개수 nextInt
	//인당 받을 수 있는 사탕의 개수 : 사탕의 개수/학생의 개수
	//남은 사탕의 개수: 사탕개수 %학생의 수  산술연산자 
	//출력형식
	//힉생 힌명딩 받을 수 있는 사탕의 개수
	//남은 사탕의 사탕 개수
	public void presentToStudent() {
		
		Scanner sc = new  Scanner(System.in);
		int student = sc.nextInt();
		int candy = sc.nextInt();
		System.out.println("학생은 몇명?");
		
		System.out.println(student);
		System.out.println("사탕은 몇개?");
		System.out.println(candy);
		System.out.println("인당받을 수 있는 사탕이 개수:"+ student/candy);
		System.out.println("남은 사탕의 개수:"+ candy%student);
		System.out.println("학생 한명당 받을 수 있는 사탕의 개수:"+ student/candy);
		System.out.println("남은 사탕의 사탕 개수"+ candy%student);
		
		
		
	}
	public void english() {
		Scanner sc =new Scanner(System.in);
		char languge = sc.nextLine().charAt(0);//단일 문자는 인덱스가 0임
		char result = (('a'<= languge)&&(languge<='z'))? '소':'대';
		System.out.println("입력하신" + languge + result+ "입니다");
		
		//조건식 ? 조건식이 true일 경우 결과 값 : 조건식이 false일 경우 결과 값
		
	}

}
