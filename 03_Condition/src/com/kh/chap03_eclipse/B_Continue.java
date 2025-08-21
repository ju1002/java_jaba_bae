package com.kh.chap03_eclipse;

import java.util.Scanner;

public class B_Continue {
	/*
	 * 
	 * continue:반복문 안에서 사용하는 문법
	 * 
	 * continue문을 만나면 continue이후에 어떤 코드가 존재하던 실행하지않고 pass
	 * 반복문 scope 최상단으로 올라가는것을 의미
	 */
	public void methode1() {
		//1부터 10까지의 반복을 하면서 정수값을 출력
		//반복횟수가 명확함 따라서 for문
		//홀 수 일때만 출력
		for(int i=1; i<=10;i++){
			if(i%2==0) { continue;}System.out.println(i);
			//continue를 만나면 4번 i++증감식으로 가고 다시2번i<=10으로 가게됨
		}
	}
	public void methode2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 서비스입니다.");
		while(true) {
		System.out.println("아이디를 입력해주세요(10자 이하)>");
		String userid = sc.nextLine();
		if(userid.length()>10) {System.out.println("아이디는 10자 이하만 사용 가능합니다.");
		continue;}
		else {System.out.println("사용 가능한 아이디 입니다.");
		break;}}}
	}


