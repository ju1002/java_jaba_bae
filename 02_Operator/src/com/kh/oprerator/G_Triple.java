package com.kh.oprerator;
import java.util.Scanner;

public class G_Triple {
	public void methode1() { 
		System.out.println("시즌 메뉴핀:");
		System.out.println("1.더 멜론오브 멜론 프라프치노");
		System.out.println("2. 수박 망고 프라프치노");
		System.out.println("3.카페 브륄레 프라푸치노");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴번호를 입력해주세요 >");
		int menu = sc.nextInt();
		String selectedMenu = (menu == 1)? "더 멜론오브 멜론프라프치노를 주문하셨습니다."
				            : (menu == 2)? "수박망고 프라푸치노를 주문하셨습니다."
				            : (menu == 3)? "카페 브륄레를 주문하셨습니다."
				            : "없는 메뉴를 주문하셨습니다.";
	System.out.println(selectedMenu);

		
	}
	
	/*삼항 연산자: 피연산자가 3개 => 값3개와 1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 조건문: 값에 따라 연산을 처리하는 방식
	 * 결과값이 true일 경우 첫 번쨰 문장을 처리
	 * 결과값이 false일 경우 두번쨰 문장을 처리
	 * 
	 * 
	 * 
	 * 
	 * 
	 * [표현식]
	 * 조건식? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * ?앞에는 조건식이 들어간다 조건식은 항상 비교연산자로 만드는데 결과는 참,거짓으로 나온다
	 * 참일 경우 결과값: 조건식이 거짓인 경우결과값
	 * 선택한 번호에 따라 서 메뉴명을출력
	 * 1번입력시 ==" 거 멜론 오브 멜론 프라푸치노를 주문하셨습니다."
	 * 메소드가 끝나면 처음 원래있던곳으로 돌아감
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	//메인메소드 를 호출히는 것은  프로그렘을 실행하는 것이다. : 저장장치에 적재 (이런 영어 모든것이 소스코드이다) 사람의 언어를 컴퓨터의 언어로 변환 (컴파일러) 소스코드를 컴퓨터가 실행할 수 있게 하는 것이 (프로그렘)
	//프로그램이 실행 되고 프로그램이 메모리 상에 존재해서 실행되는 상태를 프로세스
	
	
	//stack static 으로 메모리를 나눈다 했을 떄 메인 메소드는 static에 위치한다 이름처럼
	// stack에는 그외의 메소드가 적제됨 
	
	//홀짝구하기
	public void methode() {
		//사용자에에 정수 값을 하나 입력받아서
		//입력받은 정수가 홀 / 짝판별해서 출석
		//입력도구 별칭짓기
		Scanner sc =new Scanner(System.in);
		//필요한 겂을 입력받을 수 있또록 메세지 출력
		System.out.println("이게맞나?");
		//저장해서 계산을 해야해 정수형 변수를 선언한 뒤 스캐너의 메소드를 호출해서 입력 버펑[ 있는 정수 값을 받아와서
		//정수형 변수 공간에 초기화
		int num= sc.nextInt();
		System.out.println("모범시민이 되어볼까?"+ num);
		//num %2 !=0
		//num %2 ==1
		//num %2 ==0 연산 판별은 이걸로 한번해보자
		char oddEven= (num%2 == 0)? '짝':'홀';
		System.out.println("입력하신" + num+'은' + oddEven + " 수입니다.");
	}
	public void methode3() {
		Scanner sc =new Scanner(System.in);
		System.out.println("고무신");
		char name = sc.nextLine().charAt(0);
		System.out.println(name);
		String result = ( 'a'<= name)&&(name<='z')? "소":"대";
		System.out.println(name + "은"+result);
		//이게 알파벳 하나만 말하는게 아니라 말파벳 공통으로 해야함
		//name=='a'~'z'||'A'~'Z'
		//'a'<=name<'z' ==소문자
		
		//name A a
		
	
		
	}
	//사용자에게 알파벳 한 글자를 받아서 입력 받은 값이 대문자인지 판별해서 출력하시오
	//xx사욘자가 입력한  알파벳 은 소문자/ 대문자 입니다.
		
		
		
		
		
		
		
		
		
		
	}


