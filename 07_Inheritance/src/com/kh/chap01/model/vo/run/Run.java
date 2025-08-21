package com.kh.chap01.model.vo.run;

import com.kh.chap01.model.vo.ItalyFood;
import com.kh.chap01.model.vo.JapanFood;
import com.kh.chap01.model.vo.KoreaFood;

public class Run {

	public static void main(String[] args) {
		KoreaFood kf = new KoreaFood("비빔밥","밥",5,2);
		ItalyFood iy = new ItalyFood("기름파스타", "기름", 15,5);
		JapanFood jy = new JapanFood("초밥","밥", 10,10);
		System.out.println(kf.info());
		System.out.println(iy.info());
		System.out.println(jy.info());
		
		/*매 클래스마다 중복된 코드들을 하나하나 기술하다보면
		 * 코드의  추가 또는 수정과 같은  유지보수 시 전부  한땀한땀 찾아서 고쳐야하는 번거로움이 생김
		 * 
		 * 상속이라는 개념을 적용해서
		 * 매 클래스마다 중복된 필드,메소드들을
		 * 단 하나의 클래스(부모클래스)로 만들어 놓고,정의를해두고
		 * 해당 부모클래스가 가지고 있는 요소를 상속받아서 사용하는 형태로 진행
		 * 
		 */
		
	}

}
