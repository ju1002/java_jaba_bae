package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		Member member2 = new Member("dfs");
		Member member3 = new Member("user", "user2" ,"user3");
		System.out.println(member3.info());
					//객체 생성	//생성자 호출 : 객체의 초기 상태
	}

}
