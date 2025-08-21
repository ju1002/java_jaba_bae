package com.kh.chap01.run;

import com.kh.chap01.controller.integers;

public class Run {

	public static void main(String[] args) {
		//정수값을 여러 개 다루고 싶음 정확하게 몇개의 정수를 다룰지 알 수 없음
		/* 보톨 여러개의 값을 다루니까 배열을 떠올림
		 * 정수 값이 많이 필요할때도 있고 적게 필여할  수 있어서 가변적으로 값을 얻고 싶음
		 * 보통 배열은 값이 가변적이지 않아서 하기가 힘듬
		 * 때문에 가변적으로 하기 위해서 클래스를 만들어보자!
		 * 
		 * 
		 */
		/*int[] intergers = new int[3];
		intergers[0] = 1;
		intergers[1] = 2;
		intergers[2] = 3;
		*/
		integers integers =new integers();
		/*integers.add((10));
		integers.add(60);
		integers.add(30);
		*/
		
		int element = integers.get(2);
		integers.get(10);
		
		System.out.println(element);
		System.out.println(integers);
		
		
		
		
	}

}
