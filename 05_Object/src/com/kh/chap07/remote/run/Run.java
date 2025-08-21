package com.kh.chap07.remote.run;

import com.kh.chap07.remote.view.RemoterView;

public class Run {
//프로그램 실행만 할거임 화면띄우기
	public static void main(String[] args) {
		RemoterView view = new RemoterView();
//		먼저 내기 하고자 하는 게 다른 클래스에 있으니까 그 하고자 하는것을 이 클래스에서 띄울거니까 
//		실행 클래스의 기능을 담아여기에 생성 시켜 객체생성 먼저
		view.mainMenu();
//		내가 실행하고자 하는 메소드 mainMenu메소드를 호출(실핼)\
		// System.out.println("리모콘 조작하기는 즐거우셨나요?");
		// 실행만 하니까 출력문은 ㅊ출력하고자 하는 클래스에 두자

	}

}
