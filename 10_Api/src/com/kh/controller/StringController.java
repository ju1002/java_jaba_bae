package com.kh.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringController {
	public void method3() {
		String exam = new String ("hello");
		String str = "hello";
		
		System.out.println(System.identityHashCode(str));
		str = "bye";
		System.out.println(System.identityHashCode(str));
		str ="!!";
		System.out.println(System.identityHashCode(str));
	}
	//배열 특 논리적인 값과 물리적인 값이 같다.
	//identityHashCode를 이용해 글자 만큼의 칸수의 배열의 값을 구함
	//배열은 똑같은 주소를 가질 수 없음
	//여러개의 값을 넣을 수 있는것은 배열 밖에 없다.
	//문자열 리터럴은 대입연산자를 사용해 대입합
	//String Constant Pool영역에 등록됨
	//특 : 동일한 내용의 문자열 리터럴이 존재할 수 있음
	//String 특 : 불변
	//문자열을 통해 더하기를 하면 계속해서 새로운 공간이 생김 때문에 잘 사용하지 않음
	public void method4() {
		Arrays.toString(new int[2]);
		//StringBuffer
		//Buffer : 임시저장공간
		//문자열은 불변객체라서 내용물이 변경될 때 마다 새로운 공간을 할당해서 집어넣는다.
		//이를 해결하기 위해서 임시공간(Buffer)을 준비해서
		//임시공간에 차곡차곡 담았다가 한번에 처리해주는 믈래스
		
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("world");
		System.out.println(sb);
		//append는 문자열을 더할때 사용함
		StringBuilder sr = new StringBuilder();
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		//StringBuffer와 StringBuilder
		//StirngBuffer는 동시제어 기능이 있지만 StringBuilder에는 동시제어 기능이 없어서 더 빠르고 동시제어와 같은 용도로 사용할 수 있는 다른 것들이 많아 서 
		// 굳이 StringBuffer을 사용하지 않는다.
		//따라서 StingBuilder을 사용함.
	}
	//문자열과 관련된 메소드들
	public void stringMethod() {
		
		String str1 = "경실련하이텔 아카데미";
		System.out.println("str1의 길이"+ str1.length());
		
		//1.문자열 .length() : int
		//문자열의 길이를 반환
 		//2.문자열.charAt(int index):char
		//한문자를 반환
		char ch = str1.charAt(3);
		System.out.println("하 :"+ch);
		//3.문자열.substring(int beginindex) : String
		//문자열의 beginindex위치에서 문자열 끝까지의 문자열을 추출해서 반환
		String PhoneNumber = "010-2381-1932";
		System.out.println(PhoneNumber.substring(4));
		System.out.println(PhoneNumber.substring(4,8));
		//4.문자열.indexOf(str) : int
		System.out.println(str1.indexOf("하"));
		System.out.println(PhoneNumber.indexOf("9"));
		String[] emails = {"hong@kh.com","kim@kh.com","hitel@kh.com","hhaahhoo@kh.com"};
		for(int i = 0; i<emails.length; i++) {
			System.out.println(emails[i].substring(0,emails[i].indexOf("@")));
		}
		//5.문자열.toCharArray(): char[]
		//문자열의 각 문자들을 char[]로 반환해주는 메소드
		char[] chArr = emails[0].toCharArray();
		for(int i = 0; i<chArr.length; i++) {
			System.out.println(chArr[i]);
			System.out.println(String.valueOf(chArr));
			//6.문자열.replace(char old, char new ) : String
			System.out.println(emails[0].replace("kh","naver"));
			
			//7.문자열.trim(): String
			String str3 ="                         Jaba                                  ";
			System.out.println(str3.trim());
			//8.문자열.toUpperCase() : STring > 싹다 대문자로 바꾸기
			//문자열.toLowerCase() : String> 싹다 소문자로 바꾸기
			System.out.println("정말하시겠어요(Y/N");
			String answer = "y";
			if(answer.equals("Y") || answer.equals("y")) {
				System.out.println("참을 수가 없다.");
			}
		}
		//char[] > String
	}
	public void split() {
		//문자열 분리시키기
		String str = "배고파요 ,졸려요,하기싫어요,즐거워요";
		//문자열.split(String 구분자 뭘로 구분할건지) :string[]
		String[] arr = str.split(",");
		for(int i = 0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println();
		//향상된 for문
		//초가식,조건식, 증감식 안씀
		//for(값을 받아줄 변수 선언: 순차적으로 요소에 접근한 배열||컬렉션){}
		//배열의 요소를 수정할 순 없음
		
		for(String s:arr) { System.out.println(s);
		
		
		
		
		//java.utill.StringTokenizer클래스를 이용하는 방법
		StringTokenizer stn = new StringTokenizer(str,",");
		System.out.println("토크나이저로 뽑아야지!!");
		System.out.println(stn.nextToken());
		
		
	 while(stn.hasMoreTokens()) {// 남아있는 토큰이 있다면 true/토큰 다뽑혔으면 false
		 System.out.println(stn.nextToken());
	 }
		}
	}
	
	
	
	
}
