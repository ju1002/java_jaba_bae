package com.kh.last.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {

//	List를 생성과 동시에 리스트에 추가 할 수 있다.asList
		/*List<String> names = Arrays.asList(" 홍길동","고길동", "짱구 ");
		for(String name : names) {
			System.out.println(name+"은(는) 정말 못말려");
		}
		System.out.println("++++++++++++++++++");
		
		names.stream()
			.map(name->name+"은 못말려~")
			.forEach(System.out::println);
		//stream은 반복문을 돌릴때 굳이 for문을 사용하지 않고 데이터를 동일한 방법으로 사용가능
		//스트림(Stream) 컬렉션 , 배연 여러개의 데이터를 다루는 것들을  선언적으로 처리해주는 API
		//for문은 어떻게 반복하는지가 구체적
		//함수형은 무엇을 할지 행위에 집중
		//파이프라이닝 여러 연산을 연결
		// 60점 이상인 점수의 평균을 구해봐야겠다
		int[] scores = {88,50,72,60,100,20,40};
		int sum =0;
		int  count = 0
		(int score :scores) {
			if(score>=60) {
				
			}
		}
		//먼저 60점 이상의 것들을 더한걸 변수에 담아 놓는다
		//몇명인지도 저장할 변수 필요 나눌꺼니까
		//반복문을 돌리고 반복하면서 조건을 써야 함 점수가 60점 이상인지 아닌지 
		//60점넘은거에  점수를 대입하고 count를 통해 인원수를 알아야함
		//더한거를 count개수 센걸로 나눈다. 그 값을 또 변수에 담아야 함
		//double 을 통해 나눈 값을 담을 자료형을 정하고 하면 결과 값이 정수로나옴  이유는 정수형 나누기 정수형이니까 정수형이나옴  떄문에 내가 소수점 자리 까지 알고 싶으면 double로 바꿔야 함
		//sum/count면 (double)sum/count 더블은 8비트여서 count는 따로 안바꿔줘도 자동으로 형변환이 됨 비트가 더 작아서 큰거랑 나누면 자동을 바뀜
		
		
		
		
		double average =(double)sum/count;
		System.out.println(average);
		
		double streamAvg = Arrays.stream(scores)
								.filter(score-> score >=60)
								//람다식 ->
								.average()
								.orElse(0.0);
//	메소드식별자(매개변수){
		//return값}
		/*print(int a){
		 * return a;}
		 * 
		 * 
		 * (int a)->{
		 * return a;}
		 * 
		 * (int a) -> return a;
		 * 
		 * 
		 * (int a) -> a;
		 * (a)->a;
		 * 매개변수가 하나밖에 없으면
		 * a->a;
		 * 최종적으로 이렇게 줄일 수 있다.
		 */
		
		/*익명클래스 : 선언과 동시에 객체를 생성하는 것
		 * ex) 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		//생성자도 없고 클래스도 없으니까 사용못함
		SimpleCal adder =new SimpleCal() {
			@Override
			public int cal (int a, int b) {
				return a+b;
			}
				
		};
		SimpleCal minuser=new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a-b;
			}
		};
		System.out.println("5+3 = "+adder.cal(5, 3));
		System.out.println("5-3= " + minuser.cal(5, 3));
		
		SimpleCal adder2 = (a,b) -> a+b;
		
		//a와 b를 받아서 더하기를 만들어 준다
		
		SimpleCal minuser2 = (a,b)-> a-b;
		
		//a와 b를 받아서 둘이 뺴기를 만들어 준다.
		System.out.println("2+4 - "+adder2.cal(2,4));
		System.out.println("2-4 " +minuser.cal(2,4));
		
		//map() ,filter()
		//filter => 조건에 맞는것만 필터링할 수 있음
		List<String > coffee = Arrays.asList("아메리카노","라떼", "콜드부르","에스프레소","헤이즐넛");
		//글자수가 5개이상만 검출
		List<String> longNameCoffee = new ArrayList();
		for(String c: coffee) {
			if(c.length() == 5) {
				longNameCoffee.add(c);
			}
		}
		System.out.println(longNameCoffee);
		coffee.stream()
			  .filter(c-> c.length()==5)
			  .collect(Collectors.toList());
		System.out.println(coffee);
			  //이렇게 해서 위의 반복문을 줄일 수 있다
	 //map -> 스트림을 이용해서 데이터 변환하는 용도
		List<Integer> nameLength = new ArrayList();
		for(String name : coffee) {
			nameLength.add(name.length());
		}
		System.out.println(nameLength);
		
		List<Integer> lengths = coffee.stream()
									  .map(c->c.length())
									  .collect(Collectors.toList());
		System.out.println(lengths);
		
		coffee.stream().map(c->c+"의 길이:"+c.length())
					   //.forEach(1->System.out.println(1));
						  .forEach(System.out::println);
							//전부다 반복
		
		System.out.println("===========================");
		
		List<Person> people = Arrays.asList(
				new Person("배주영","인천",24),
				new Person("채동민","서울",30),
				new Person("김도현","대전",15),
				new Person("고도훈", "서울",66)
				);
		System.out.println("서울 사람만 출력하기");
		System.out.println("원래우리의 방삭");
		for(Person person:people) {
			if("서울".equals(person.getAddress())) {
				System.out.println(person);
			}
		}
		System.out.println("스트림 방식");
		people.stream().filter(person -> "서울".equals(person.getAddress()))
						.forEach(System.out::println);
		//필터를 이용해 걸러내고 
		//메소드만 참조해서 줄력을 해준다.
		
		//이름과 주소 출력하기
		System.out.println("전통적인 방식");
		for(Person person:people) {
			System.out.println(person.getName()+"님은 "+person.getAddress()+"에 삽니다");
			
		}
		System.out.println("스트림 방식");
		people.stream().map(person->person.getName()+"님은"+person.getAddress()+"에 삽니다")
					   .forEach(System.out::println);
					   
		//map을 통해  forEach를 톨해 메소드를 호출해 출력함
		//스트림 사용할 때 둘다 중간연산하는 역할을 함
		//스트림의 주요중산 연산
		//1.fillter() : 조건에 맞는요소만 필터링 한다
		//2.map() : 요소를 반환할때 사용하는 연산
		//3.distinct() : 요소의 중복을 제거할때
		//스트림의 주요 최종 연산
		//1.collect() :결과를 컬렉션으로 변환
		//2. forEach() : 모든 요소에 대한 작업 수행
		//3. count() : 요소 개수 반환
		//4. reduce() : 요소를 결합해서 단일 결과 만들어낼때
		
		System.out.println("=============================================");
		
		
		
		
		
		
		
		
		
		
		
		//메소드 참조
		
	}
	
	
	//함수형 인터페이스 선언 
	@FunctionalInterface //이거 인터페이스 함수형이야~ 컴파일러가 아 이거 함수형 인터페이스구나!
	interface SimpleCal{
		int cal(int a,int b); //하나의 추상메소드만 가지고 있어야함
	}

}
