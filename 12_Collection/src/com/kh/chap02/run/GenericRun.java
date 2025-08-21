package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * 
		 * 제네릭<Generic> :일반화
		 * 컬렉션을 사용하면서 다룰 타입들을 미리지정할 수 있는 기능
		 * 
		 * 명시적으로<Integer>, <Plant>
		 * 특정 타입의 요소들만 컬랙션의 담을 수 있도록 지정할 수 있음
		 * 별도의 제네릭 없이 컬렉션 객체 생성( E == Object)
		 * 
		 * 1. 다룰 요소의 타입을 제한할 수 있음=>실수를 줄일 수 있음
		 * 2. 매 번 형변환 하는 정차를 없앨 수 있다. 왜냐하면 지정을했때문이다.
		 */
		ArrayList <Plant> plants =new ArrayList();
		
		plants.add(new Plant("괸엽", "신세베리아"));
		//plants.add("식물시작~"); //String 타입이어서 안됨
		plants.add(new Plant(" 관엽","폴리샤스"));
		
		Plant p = plants.get(0);
		for(Plant plant : plants) {
			System.out.println(p);
		}
		/*plants.add(new Plant());
		plants.add(1); // Object를 사용 하려면 기본 자료형이 아닌 참조 자료형이어야 한다.
		plants.add(1.1); //그러려면 wrappper클래스를 이용한다.
		*/                                                                            

	}

}
