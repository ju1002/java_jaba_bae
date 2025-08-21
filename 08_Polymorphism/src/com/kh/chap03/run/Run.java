package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		 FootBall fb = new FootBall();
		 fb.rule();
		 BaseBall bb = new BaseBall();
		 bb.rule();
		  Sports[] sports = new Sports[2];
		  sports[0] = fb;
		  sports[1] = bb;
		  for(int i = 0; i<sports.length; i++) {
			  sports[i].rule();
		  }
		 //Sports s = new Sports();
		 System.out.println();
		// s.rule();
	}
//추상(abstract) [표현법]
//접근제한자 abstract class 클래스식별자
//접근제한자 abstract 반환형 식별자();
//클래스에도 abstract가 들어가야 사용가능
//추상 클래스로 지정한 것은 객체생성이 안된다.
//클래스 내부에 요소로 추상메소드를 하나라도 선언하는 순간
//클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정의해야함!
//추상클래스==필드+메소드+추상메소드(생략가능)!!
	/*1. 기술적으로는 개발자가 판단했을 때 이 클래스는 부모 클래스 역할로만 사용할 것이소'
	 * 객체 생성은 불가능 해야한다 라고 생각이 들면 추상클래스로 선언
	 * 2. 개념적으로 개발자가 판단했을 때 해당 클래스가 구체적으로 구현된 상태가 아닌것 같다
	 * 하는 생각이 들면 추상클래스로 선언
	 * 
	 *  객체생성은 불가능하게 하고 공통적인 속성 및 메소드 그리고 타입만 다형성을 적용하게 하고 싶다.
	 */
	
	



}
