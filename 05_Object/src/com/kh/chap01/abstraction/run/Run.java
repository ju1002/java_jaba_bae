package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {}
//	public static void main(String[] args) {
//	객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(개체)를 속성솨 행위를 가진 객체로 만들어서 
//	객체간의 상호작용을 통해 프로그래밍 하는 기법
//  정보와 기능을 하나로 묶어 RAM에 올려 놓는것이 객체 지향 프로그램의 시작점이다.
//	힉생관리 프로그램을 만든다면 학생이 객체가 되는것 
//	구현하고자 하는 프로그램에 객체를 만들기 위해서는( 생성하기 위해서는) >>>> 클래스를 먼저 생성해야함!
//	클래스란 : 각 객체들의 정보 (속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
//			내가 생각하는 모양새를 만드는 설계도 개발자가 만드는 사용자 정의 자료형
//  클래스 : VO(Value Object)	
		
		
		
//		Puppy solder = new Puppy();	참조자료형이라함
		/* alt 방향키 : 내가 선택한 행 위치 조정
	 * ctrl d :  행 삭제
	 * ctrl / : 주석 처리
	 * ctrl shift f : 코드를 정리 
	 * 
	 */
		
//	현실세계
//	동물 > 고양이
//	고양이 정보
//	종 렉돌
//	이름 : 조던이
//	나이 : 1
//	성별 : 암컷
//	색상 : 흰색
//	몸무게 : 4kg
//	위와 같은 과정을 추상화 한다 함.
//	위 과정을 올라가면 추상화 하는것이고 밑으로 내려가면 구체화 되는거임.
		
		
//	객체 생성해보기
//	고양이 객체 생성
//	객체 생성 
//	Puppy smart = new Puppy(); //객체를 생성해서 변수를 선언한 것
	//System.out.println(smart.name);
//	stack에 smart라는 변수 공간이 만들어짐 대입연산자 외쪽 heap 영역에 Puppy에 대한 여러 속성들이 뭉쳐 있는 주소가 생김
//	그 주소를 smatr라는 공간에 주소를 넣는 것이다.
//  객체가 올라가는 것은 heap영역
//	smart.sniff(); //.참조 연산자 뒤에 있는 sniff는 heap영역에 객체 Puppy class라는 객체 생성 그 클래스 안에는 값이6개가 있다 smart가 그 주소르 가리키고 
//	주소에 있는 Puppy의 주소 fdsfad라고 한다면 sniff는 그 전체 객체를 가리킴.
//	만약 내가 설정한 객체의 sniff 안에 name부분에 값을 넣고 싶으면
//	smart에 먼저 접근 그 후 그 smart가 가리키는 주소 안에 내가 넣고 싶은 영역 name을 참조연산자.을 이용해 접근함
	
	/*smart.name = "조던이";
	smart.species = "렉돌";
	smart.age = 1;
	smart.gender = "암";
	smart.color = "하얀색과 회색이 섞인";
	smart.weight = 3;
	System.out.println(smart.name + "는");
	System.out.println(smart.age + "살");
	System.out.println(smart.species +"종");
	System.out.println(smart.gender + "컷");
	System.out.println(smart.weight + "kg 입니다.");
	System.out.println(smart.color + "");
// 내가 name이라는 공간에 조던이를 넣고 싶단면 	먼저 smart로 진입후 name를 .을 이용해 name 공간에 접근함
	
	
	
	Puppy solder = new Puppy();
//	new를 만나는 순간 heap영역에 Puppy만큼 공간이 생김 heap영역에 생겼으면 객체 고유의 주소가 생긴다
	solder.name = "상근이";
	solder.age = 22;
	solder.species = "그레이트 피레니즈";
	solder.gender = "수컷";
	solder.color = "흰색";
	solder.weight = 60;
	
	System.out.println(solder.name + "는");
	System.out.println(solder.age + "살");
	System.out.println(solder.species+ "");
	System.out.println(solder.gender + "");
	System.out.println(solder.color +"");
	System.out.println(solder.weight + "kg입니다잉~");
	
	System.out.println("======================");
	
	smart.sniff();
	solder.sniff();
	
	System.out.println( solder.name + "가 멍하고 짖습니다");
	solder.weight = solder.weight- 5;
	System.out.println("상근이 다이어트 전 몸무게");
	System.out.println(solder.weight);
	solder.bark();
	solder.bark();
	solder.bark();
	System.out.println("난 후");
	System.out.println(solder.weight);
	
	if ( solder.weight >15) {System.out.println(solder.name + "가 멍하고 짖습니다");
	solder.weight = solder.weight-5;
	}
	else { System.out.println("너나 짖어라");
	//조던이를 각각의 객체에서 뽑고 싶으면
//	각각의 개체의 내부에서 꺼내면 됨
//	내부에서 빼는건 상관없음 그냥 출력
//	각 객체의 이름을 넣어서 출력하고 싶은데 어떻게 해야할까?
//	객체의 관점 
//	내부적 관점 
//	외부적 관점
//	과제 
//	현실세계의 존재하는 나만의 무언가를 찾아서
//	VO클래스를 만들고
//	puppycarerun클래스를 참고하여 생성한 객체를 관리할 수 있는 프로그램을 작성하시오.
//	개수)  VO클래스 5개 +VO관리 프로그램 5개
/*각 VO클래스의 최소 필드 수 5개
 * 최소 한개 이상의 필드 값을 변경할 수 있는 메소드 작성 >>> Puppy클래스의 bark()처럼
 * 제출할 곳 : 우리 게시판 게시글 작성
 * 게시글제목 : 이름 VO클래스 만들기
 * 메모리 구조 그려보기
 */
		
	
	
	
//	}
//}
//	}