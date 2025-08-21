package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.MBTI;

public class Run {
	public static void main(String[] args) { 
		//HashSet
		//Value값만 저장, index개념 없음==순서보장x , 중복x
		
		//[표현법]
		//HashSet객체명 = new HashSet();//빈 HashSet이 만들어짐
		
		//문자열만 담을 수 있는 HashSet
		
		Set<String> set = new HashSet();
		//요소추가 add(추가할 요소)
		set.add("안녕하세여");
		set.add("으아아앙");
		set.add(new String ("반갑습 니다"));
		set.add(new String ("너의 하루가 궁금해"));
		set.add("재미가 없어,,,");
		set.add("너무 졸려");
		set.add("하루하루가 지겨워");
		set.add("돌멩이가 되고싶어");
// 배열은 정해진 크기의 정보를 다룰 때 사용
//	List 사용목적 다룰 값의 양을 가늠할 수 없을때
//	
		
		/*System.out.println(set);//저장 순서 보장x, 중복 허용x
		//컴퓨칭 사고 -==컴퓨처는 어떻게 동작하는기?
		//요소개수 수하기
		System.out.println(setd의 요소 새수+set.size())
		
		/*Set<MBTI>mbt = new HashSet();
		MBTI istj= new MBTI("i"+s):
		*/
		/*
		 * equals()호출의 결과가== true이고 hashCode()의 반환값을 동들비교 연산자를 통해 비뇨했을 때
		 * 값이 일치하다면 =>동일 객체로 판단(중복저장을 하지 않음)
		 * 필드의 값은 같은데 주소값이 달라서 동일객체가 아닌것으로 판단하기 때문에
		 * VO클래스는 내부에 equals()와 hashCode()를 오버라이딩
		 */
		System.out.println("=======================================");
		
		for(MBTI e : mbti) {
			System.out.println(e);
			//Set의 요소들을 List에 옯겨담아 인덱스를 활용
			//List도 그렇고 Set도 그렇고 전부 다 Iterator구현중
			// 모근 실제 객체를 Iterator타입으로 사용할 수 있음(다형성 적용)
			// List계열 Set계열은 전부다 iterator()를 호출해서 반복을 시킬 수 있음
			//Map계열에서는 바로는 불가능
		}
		List list = new ArrayList();
		list.addAll(mbti);
		for(int i = 0 ; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("======================================");
		//Iterator(반복자)
		Iterator it = mbti.iterator();
	}
}
