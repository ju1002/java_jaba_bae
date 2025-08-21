package com.kh.chap01.controller;

import java.util.Arrays;

public class integers {
	
	private int[] integers;
	private int size;
	
	
	public integers() {
		integers = new int[3];
		
		//밖에서 값을 대입 해야 함 값을 바꿀거니까
		//배열은 값은 확장 불가능 하다
		// 배열은 없어지면 원래있던 값들도 같이 사라진다.
		//배열 확장을 위해 깊은 복사를 활용
	}
	public void add( int element) {
		if(integers.length == size+1) {
			
		
		//밖에서 값을 불러올 꺼니까 매개변수를 활용
		integers = Arrays.copyOf(integers,(integers.length *2));
		//이거는 계속 늘리는 거임
		//하지만 나는 배열이 꽉 차면 그때 늘리고 싶음
		//때문에 조건문 사용
		
		integers[size++] = element;}
	}
	@Override
	public String toString( ) {
		return Arrays.toString(integers);
	}
	
	
	public int get(int index) {
		return index;
	//밖에서 필드 값을 대입 하기 위해서 안에서 필드를 보여주는 get사용 
	// 밖에서 배열의 값을 불러오기 위해서 매개변수 를 활용
	}
	

}
