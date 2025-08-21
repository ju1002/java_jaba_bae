package com.kh.chap04.model.vo.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

public class Run {

	public static void main(String[] args) {
		//Map
		//Key+Value세트로 저장
		// HashMap
		//[표현법]
		//Map 객체이름 = new HashMap()
		//키 == 식별자 => 생선 이름
		//벨류 == 생선 객체
		Map<String,Fish> aquarium = new HashMap();
		//비어있는 맵에 요소를 추가해보기
		//List,Set => add() Collection을 구현한 클래서여서 같음
		//HashMap 은 put()을 이용해 요소를추가한다.
		//key 와 value를 함께 요소를 추가함
		//put(K key , V value)
		aquarium.put("농어", new Fish("단맛","회"));
		aquarium.put("대방어", new Fish("기름맛","회"));
		aquarium.put("연어", new Fish("담백한 맛","스테이크"));
		aquarium.put("고등어", new Fish("맛있음","구이"));
		aquarium.put("메기", new Fish("흙맛", "매운탕"));
		System.out.println(aquarium); //저장순서가 보장안됨 즉 내사 순서대로 했어도 출력을 하면 순서가 뒤죽박죽이 됨
		//Value값의 경우 중복으로 저장이 가능하다.
		//key값이 같고 value값이 다르면 기존에 있던 같은 키의 value값이 같은 키지만 다른 value값으로 덮어씌어짐.
		//get(Object key) : Object
		//전달된 key값에 해당하는 value값을 반환해주는 메소드
		//key > value를 찾아옴
		System.out.println(aquarium.get("농어"));
		System.out.println(aquarium.get("광어"));
		System.out.println(aquarium.get("메기"));
		//없는 key값을 넣으면 null값이 나온다.
		//siz(): Map에 담겨있는 요소의 개수
		System.out.println(aquarium.size());
		//replacce(K key, V value) : 키값으로 요소를 찾아서 value의 값을 바꿔줌
		aquarium.replace("참치", new Fish("고소한막","구이"));
		System.out.println(aquarium);
		//replace는 존재하지 않는 key값을 넣고 value를 바꿔주려하면 추가하지 않는다 이게 put으로 요소를 넣는것과 다른점이다.
		//remove(Object key)=> 해당 키 값을 찾아서 => 키+벨류 세트로 지워주는 메소드
		aquarium.remove("참치");
		System.out.println(aquarium);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//Map에 들어 있는 모든 요소들에 순차적으로 접근해야 한다면?
		//Map는 요소의 반복문을 사용 못함
		//Key값들만 Set로 바꿀 수 있음
		//Set으로 바꾸면 Iterator를 사용할 수 있기 때문에 반복 가능하다
		//keySet()호출하기
		//Map이 가지고 있는 Key들만 Set에 담는다.
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishSet);
		//Iterator로 바꿔보자
		Iterator<String> itKey = fishSet.iterator();
		//반복문 사용하기
		while(itKey.hasNext()) {
			String key = itKey.next(); System.out.println(key+"+======"+aquarium.get(key));
			
		}
		System.out.println("==================================================================================================");
		
		//entrySet()을 이용하는 방법
		//Map이 가지고 있는 Key와 Value세트를 Set에 담기
		//묶어줄 포장지가  필요한데 그게 entrySet이다/
		Set<Entry<String ,Fish>> entrySet = aquarium.entrySet();
		System.out.println(entrySet);
		
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey()+":::::"+e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
