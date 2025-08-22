package com.kh.pravtice.list.music.view;

import java.util.Scanner;

import com.kh.pravtice.list.music.comtroller.MusicController;
import com.kh.pravtice.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	public void mainMenu() {
		while(true) {
		System.out.println("＊＊＊＊＊＊＊ 메인메뉴 ＊＊＊＊＊＊＊");
		System.out.println("1.마지막 위치에 곡 추가");   //addList()로 실행
		System.out.println("2.전체 곡 목록 출력");  //addAtZero()로 실행
		System.out.println("3.전체 곡 목록 출력"); //printAll()로 실행
		System.out.println("4.특정 곡 검색"); //searchMusic()로 실행
		System.out.println("5.특정 곡 삭제"); //removeMusic()로 실행
		System.out.println("6.특정 곡 정보 수정"); //setMusic()로 실행
		System.out.println("7.곡명 오름차순 정렬"); //ascTitle()로 실행
		System.out.println("8.가수명 내림차순 정렬"); //descSinger()로  실행
		System.out.println("9. 종료"); //"종료"출력 후 main()으로 리턴
		
		System.out.println("메뉴 번호를 선택해 주세요");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : addList(); break;
		case 2 : addAtZero(); break;
		case 3 :  break;
		case 4 : searchMusic(); break;
		case 5 : break;
		case 6 : break;
		case 7 : break;
		case 8 : break;
		case 9 : System.out.println( "종료"); return;
		default : System.out.println("없는 메뉴입니다.");
		continue;
		}
		
		return;
		}
		
		
	}
	public void addList() {
		
		System.out.println("＊＊＊＊＊＊＊＊ 마지막 위치에 곡 추가 ＊＊＊＊＊＊＊＊");
		System.out.println("제목 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 :");
		String singer = sc.nextLine();
		Music m = new Music();
		m.setTitle(title);
		m.setSinger(singer);
		Music music =mc.addList(m);
		if(music != null) {System.out.println("출력 성공");
			
		}else {System.out.print ("출력실패");
	}
	public void addAtZero() {
		
	}
	public void searchMusic() {
		
	}
	public void removeMusic() {
		
	}
	public void setMusic() {
		
	}
	
	public void ascTitle() {
		
	}
	public void descSinger() {
		
	}
}
