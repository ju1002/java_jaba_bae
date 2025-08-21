package com.kh.chap05.constructor.model.vo;

public class Member {
//	Member class를 만든 목적 : 내가 만든 웹 사이트에 있는 회원들의 정보를 관리 하기 위해
	private String userId;
	private String userPwd;
	private String nickName;
//	생성자부
/*
 * 
 * 생성자(Constructor) : 객체를 생성하는데 사용하는 특수한 유형의 메소드
 * [표현법]
 * 접근제한자 클레스 식별자(매개변수 (생략가능)) {
 * 해당 생성자를 통해서 객체 생성 시 실행하고자하는 코드;
 * 
 * }
 */
	//public Member() {
		//기본 생성자(매개 변수 없음)
		//System.out.println("야야야야");
		//기본생성자는 객체를 생성할 목적으로 호출해서 사용
		//기본생성자는 생략해도 에러가 발생하지 않음
		// 클래스 내부에 생성자를 하나도 작성하지 않으면 JVM이 기본생성자를 자동으로 만들어줌!
		//기본생성자를 항상 작성하자!!
		/*생성자의 역할
		 *-- 기술적인 관점 : 객체가 생성된 때 어떤 상태로 시작을 해야하는가
		 *-- 개념적인 관점 : 객체가 처음부터 유효한 상태를 가지도록 강제
		 *객체라는 것은 애초부터 모두가 유효한 상태로 있어야 함}
		 */
		/*생성자의 종류 
		 * 1. 매개변수가 없는 생성자 > 기본생성자
		 * 2. 매개변수가 존재하는 생성자 
		 * > 객체를 생성과 동시에 유효하게 만들어줌
		 * 매개변수가 존재하는 생성자
		 * 기본생성자 및 모든 필그를 매개변수로 가지고 있는 생성자 생성
		 * 직접접근으로 사용하고 있던 실행틀래스의 코드들을 전부 다 getter /setter대체
		 */
	public Member () {} //<<<얘는 무조건 있어야 함!
	public Member(String useId) {
		System.out.println("매개변수가 한개만 존재");
		
	}
	public Member (String userId, String userPwd, String nickName) {
		//System.out.println("매개변수가 2개인 생성자");
		//System.out.println("전달받은 아이디 값 : " +userId);
		//System.out.println("전달받은 비밀번호 값 : "+ userPwd);
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
//		new 하면 필드가 생성됨
//		많이 하는 실수 변수의 순서 잘 보면서 작성 하자
//		생성자가 만들어지는 순간 
		/*1. 반드시 생성자의 이름을 클래스의 이름과 동일하게 작성해야 함
		 * 2.반환형이 존재해서는 안됨
		 * 3. 매개변수 생성자를 명시적으로 작성하면 기본생성자를 만들어주지 않음
		 * 우리는 꼭 기본생성자를 억지로 열심힘 작성하는 습관을 들여야 함
		 * 4. 생성자는 동일한 이름으로 여러 개 생성이 가능하지만 매개변수가 중복되어선 안됨!
		 */
	}
	
	
	
	
	
	
	
	
	
//	메소드 부
//	모든 필드에 대해 getter /setter/ info 만들기
	public String getUserId() {
		return userId;
	};
	
	public String getUserPwd() {
		return userPwd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setUserId(String userId) {
		this.userId= userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String info() {
		String info = "사용자 아이디 : "+userId 
					+ " 사용자 비밀번호 : "+ userPwd 
					+ " 사용자 이름 : " + nickName;
		return info;
	}


			

}
