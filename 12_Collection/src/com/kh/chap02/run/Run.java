package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class Run {

	public static void main(String[] args) {
		
		/*자바의 컬렉션(Collection)
		 * 여러개의 값을 다루기 위해서
		 * Abstract Date Type : 추상적 자료형 >>> Interface
		 * class => 구현체
		 * method => 구현 방법
		 * 
		 * ==========================================================================================
		 * 베열과 컬렉션의 차이점
		 * 
		 * - 배열의 불편한 점
		 * 1. 배열을 사용할 때 꼭 크기를 할당해야 함 => 한 번 지정된 크기는 변경이 불가능
		 * 2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어 주거나 땡시는 코드를 써야 함 
		 * 
		 * 
		 * 
		 * - 컬렉션
		 * 1. 크기의 제약이 없음
		 * => 처음 컬렉션을 사용할 때 크기를 지정하지 않아도 사용 할 수 있음
		 * => 만약 요소가 추가되면서 크기를 넘어서는 상황이 발생하면 알아서 확장됨
		 * 2. 중간에 값을 추가하거나 삭제하는 경우 기존값을 밀어주거나 땡겨주는 로직이 이미 구현되어 있음
		 * => 그떄그때 필요한 메소드들을 호출해서 사용하면 됨
		 * 
		 * == 중립
		 * - 배열의 경우 하나의 타입의 자료형만 사용할 수 있음
		 * - 컬렉션의 경우 여러 타입의 데이터들을 관리 할 수 있음 : 같은 타입의 데이터만 묶어서도 사용가능
		 * 
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져 있고, 조회의 목적= > 배열
		 * 데티어들의 추가, 수정, 삭제가 많이 일어난다=> 컬렉션
		 *
		 *개념적인 컬렉션의 종류
		 *- List 계열 : 다루고자 하는 값(Value) 만 저장  / 저장 시 순서 유지(Index), 중복값 허용
		 *				=> LinkedList, ArrayList, Vector 클래스로 구현됨 -> ArrayList 사용
		 *
		 * ArrayList : 값을 배열로 저장한다 추가나 삭제할 때 배열이어서 불편함
		 * 
		 * -Set 계열 : 다루고자 하는 값만 저장 / 저장시 순서 유지x , 중복값 허용x
		 * 			==> HashSet, TreeSet
		 * 			->> HashSet
		 * 
		 * Map 계열 : 키(key) - 값세트로 저장 / 저장 시 준서 유지x , 키 중복x , 값 중복o
		 * 					=> HashMap,TreeMap,MultiValueMap....
		 * 					->HashMap, Properties
		 * 
		 * ArrayList
		 * ArrayList생성 방법
		 * ArrayList 식별자 = new ArrayList();
		 * 1. 기본 생성자 호출로 만들기 => 기본 크기 10칸
		 * ArrayList 식별자 = new ArrayList(정수);
		 * 2. 인자로 전달한 정수값만큼의 크기를 가진 리스트를 만들겠다.
		 */
		ArrayList plants = new ArrayList(3); 
		// 내부적으로 크기가 3칸 짜리인 List를 만들겠다.
		// 배열타입[]arr = new 배열타입[3];
		System.out.println(plants);
		
		 //1.비어있는 List에 요소를 추가 할때
		//add(E e) : 해당 리스트 마지막에 인자로 전달된 요소를 추가해주는 메소드
		plants.add(new Plant("서양란", "호접란"));
		plants.add(new Plant("동양란", "황룡관"));
		plants.add(new Plant("관엽", "금전수"));
		System.out.println(plants);
		//기본 Object []의 크기를 넘어소는 요소가 
		//A//ays.copyof()메소들을 이용기은 =기ㅠ은      
		
		
		
		
		
		
		
		
		//2. 요소를 수정하는 메소드
		//set(intindex E e)List와 index위치에 값을 전달된  요로
		
		
		
		//3.remove(omtine: List의index위치체 담긴 요소를 삭제하는  법
		
		plants.remove(0);
		String str = (String)plants.remove(1);
		System.out.println(str);
		System.out.println(plants);
		Plant goldDragonCrown = (Plant)plants.remove(1);
		System.out.println(goldDragonCrown.getType()+"류의"+goldDragonCrown+ "이 삭제되었습니다.");
		
		//4. 리스트의 크기를 반환받기
		//size() : 리스트에 담긴 요소의 개수
		System.out.println(plants.size());
		System.out.println("마지막 인덱스 :" + (plants.size()-1));
		
		//5.List의 해당 index위치에 담긴 요소를 반환 받는 메소드'
		//get(int index) : E
		System.out.println(plants);
		Plant plant = (Plant)plants.get(0);
		
		System.out.println(plant);
		
		//1번 인데스에 위치한 식물의 이름을 변수로 대입해서 활용학 싶음
		String hongKongTree = ((Plant) plants.get(1)).getName();		 
		
		
		for(int i = 0; i<plants.size(); i++) {
			System.out.println("식물 종류" + ((Plant)plants .get(i)).getType());
		}
		//향상된 for문 > 값을 조회하는 못적으로 사용가능
		//for(값을 받아줄 변수: 순차적으로 요소에 접근할 배열 컬레션 () {}
	for(Object p : plants ) { System.out.println(p.toString()); //동적 방인딩

	}
		//6. 리스트 자르기
		//subList(int index1, int index2) : List
		//index1부터 index2까지의 요소를 추출해서 새로운 리스트를 반환
	List sub =plants.subList(0,1);
	System.out.println(sub);
	
	
		//7. 리스트에 요소를 와창 추가해주기
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅추가해 주는 메소드
		plants.addAll(sub);
		System.out.println(plants); //리스트는 데이터 값이 중복 될 수 있음
		
		//8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
		//isEmptu() : 리스트에 요소가 존재하지 않다면 true/요소가 하나라도 있다면 false
		System.out.println(plants.isEmpty());
		plants.clear();
		
	
	
	}
	
	
	
	

}
