package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {
		System.out.println("최대등록 가능한 회원 수는" + mc.SIZE + "명입니다");
		System.out.println("현재 등록된 회원수는" + count + "명입니다.");

		if (count != 10) {
			System.out.println("1. 새회원 등록");
		} else {
			System.out.println("회원 수가 모두 꽉 찼기 떄문에 이일부 메뉴만오픈됩니다.");
		}
		System.out.println("2. 회원정보 검색");
		System.out.println("3.회원정보 수정");
		System.out.println("4.회원 삭제");
		System.out.println("5.모두 출력");
		System.out.print("메뉴변호");}}

public void findAll() {
	System.out.println();
	System.out.println("회원 전체 조회 서비스 입니다.");
	Member[] members = mc.getM();
	int count = mc.existMemberNum();
	if (count >0) {
		for(int i = 0; i<members.length; i++) {
			if(members[i]!=null) {
				System.out.println("================");
				System.out.println("아이디: "+members[i].getId());
			}
		}
	}
}
	private void deletlMember() {
		System.out.println("회원 삭제 서비스 입니다.");
		System.out.println("삭제 하실 회원의 아이디를 입력해주세요");
		String userId = sc.nextLine();
		System.out.println("삭제하실 회원의 비밀번호를 입력해주세요");
		String userPwd = sc.nextLine();
		int result = mc.deleteMember(userId,userPwd);
		if(result>0) {
			




}
	
	}
	

	
	
	