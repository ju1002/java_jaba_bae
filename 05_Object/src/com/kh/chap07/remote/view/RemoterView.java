package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.Controller.RemoteController;

//사용자에게 값을 입력받고 내용을 출력해주는 메소드를 넣어둘 클래스
public class RemoterView {

	private Scanner sc = new Scanner(System.in);
	private RemoteController rc = new RemoteController();

	// 프로그램 시작 시 보여질 메인메뉴를 출력해주는 메소드
	public void mainMenu() {

//
		while (true) {
			System.out.println("리모콘 조작 프로그램 입니다.");
			System.out.println("조작을 해보세요");
			System.out.println("이용하실 메뉴를 선택해주세요");
			System.out.println("1.전원켜기 :");
			System.out.println("2.채널바꾸기 :");
			System.out.println("3.채널 낮추기 :");
			System.out.println("4.전원  끄기 :");
			System.out.println("5.프로그램 종료 :");
			System.out.println("어떤 기능을 이용하시겠습니까>");
			int menuNo = sc.nextInt();
			sc.nextLine();
//	사용자가 어떤번호를 누르면 뭐가 나온다를 보기 위해 번호를 누른다면 이니까 if
			switch (menuNo) {

			case 1:
				powerOn();
				break;
			case 2:
				channelUp();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("리모콘 조작하기는 즐거우셨나요?");
				return;
			default:
				System.out.println("없는 메뉴를 선택하셨습니다. 다시 입력해주세요");
			}
//	5번을 누르면 프로그램 종료를 해야 하는데  그럴려면 while문 밖으로 나가야 함 while은 반복문이니까
//	떄문에 return을 통해 다시 가서 끝냄
		}
	}

	private void powerOn() {
		// RemoteController rc = new RemoteController();
		System.out.println("==================================");
		System.out.println("전원켜기 메뉴입니다.");
		System.out.println("==================================");
		int result = rc.powerOn();
		if (result > 0) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("이미 전원이 켜져 있습니다.");
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}

	private void channelUp() {
		// 컨트롤러야 채널올려줘 그리고 뭐하는지 알려줘
		String channel = rc.channelUp();
		if(channel != null) {
		int channelNo = rc.getChannelNo();
		System.out.println(channelNo + "번 채널입니다.");
		System.out.println("================================================");
		System.out.println(channel);}
		else {System.out.println("먼저 전원을 켬주시기 바랍니다.");}
	}

}
