package com.kh.chap02.encaptulation.run;
import com.kh.chap02.encaptulation.model.VO.CafeVO;
public class Run {
	//캡슐화(encapsulation)
	//속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것  
	//정보은닉(information hiding) 알약이라고 생각해 보면 캡슐 안에 내용물을 외부로 부터 보호하려고 하는것이다.
	//값을 저장하는게 VO클래스 만들기

	public static void main(String[] args) {
//	접근제한자 예약어   반환형 메소드식별자 (매개변수)
//	주소값에는 접근하고 참조 할 수 있다.
	
	 CafeVO cafe = new CafeVO();
	 //변수선언   대입연산자  객체생성 ==메모리에 적재
	//cafe.menu
	//필드가 보이지 않아서 (외부에서 접근이 불가능 해서) 오류 발생
	//접근제한자를 public에서 private로 변경했기 때문에 직접접근 불가능
	//직접 접근이 불가능 하기 떄문에 간접적으로 접근 할 수 있는 방법을 만들어줌
	//cafe라는 클래스에 getter/ setter라는 
     //cafe.dishWash();
	//cafe.cleaning();
	//cafe.windowCleaning();
	//cafe.open();
		
		cafe.setSignatureMenuPrice(5000);
		cafe.setName("kh카페");
		cafe.setAddress("종각역");
		
		String info = cafe.info();
		System.out.println(info);
	}
		//5000원이라고 하고 >>> 5000을 인수
		//메소드 호출부에서는 오로지 값만 넘길 수 있음
		//내가 넘기고 싶은 값을 괄호 안에 넣어서 보내준다
	
// setter은 셋팅 해!
// 데이터를 반환해주는 기능의 메소드 : getter() 내놔!
//	1.getter() 는 접근자제한자 public을 사용한다.
//	2. get필드명으로, 낙타봉 표기법을 사용한다.
//	3. 모든 필드에 대해서 반드시 무조건 꼭 다 절대로 만들어줘야함.
//	메소드를 호출
	}
	
	

//	getter() / setter()다 만들었다 > 캡슐화가 끝남
	/*캡슐화 방법
	 * 1. 값을 숨긴다>> 필드의 접근제한자를 public대신 private 선언한다.
	 * 2. 외부에서 접근할 수 없게 만들었기 때문에 메소드를 통해 접근할 수 있도록 만들어준다. >>getter() / setter()구현
	 * 데이터를 숨김 >>> 객체간의 결합도를 낮춤 >>책임을 분리시킨다.>>>책입을 분리시킨다.
	 * 쉽게말해 내꺼 내가하자
	 * 
	 */
