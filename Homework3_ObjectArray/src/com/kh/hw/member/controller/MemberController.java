package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	public int existMemberNum() {
		int count = 0;
		// if(m[0] !=null)count++;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null)
				count++;
		}
		return count;
	}

	public boolean checkId(String inputId) {

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;

		/*
		 * if(m[0].getId().equals(inputId)) { return true; } if
		 * (m[1].getId().equals(inputId)) { return }
		 */

	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null)
				m[i] = new Member(id, name, password, email, gender, age);
			break;
			
		}
	}
	
	
	
	public void deletelMember(String userId, String userPwd) {
		for(int i = 0; i<m.length; i++) {
			if (m[i] !=null&&m[i].getId().equals(userPwd)) {
				m[i].getPassword().equals(userPwd)){
				m[i] = null;
				return;
				}
			}
			return ;
		}
	}
}
