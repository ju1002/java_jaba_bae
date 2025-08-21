package com.kh.chap03.model.vo;

public class MBTI {
	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFeelling;
	private String judginPerceiving;
	public MBTI() {
		super();
	}
	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFeelling,
			String judginPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFeelling = thinkingFeelling;
		this.judginPerceiving = judginPerceiving;
	}
	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}
	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}
	public String getSensingiNtuition() {
		return sensingiNtuition;
	}
	public void setSensingiNtuition(String sensingiNtuition) {
		this.sensingiNtuition = sensingiNtuition;
	}
	public String getThinkingFeelling() {
		return thinkingFeelling;
	}
	public void setThinkingFeelling(String thinkingFeelling) {
		this.thinkingFeelling = thinkingFeelling;
	}
	public String getJudginPerceiving() {
		return judginPerceiving;
	}
	public void setJudginPerceiving(String judginPerceiving) {
		this.judginPerceiving = judginPerceiving;
	}
	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition
				+ ", thinkingFeelling=" + thinkingFeelling + ", judginPerceiving=" + judginPerceiving + "]";
	}
	//결론적으로 우리가 해야할 일 : 필드의 값이 동일하다면 equals와 hashcode를 톨해 구현해줘야 한다.
	@Override
	public boolean equals(Object obj) {
		MBTI mbti = (MBTI)obj;
		if (!this.introversionExtroversion.equals(mbti.introversionExtroversion)||
				!this.sensingiNtuition.equals(mbti.sensingiNtuition)||!this.thinkingFeelling.equals(mbti.thinkingFeelling)
				||!this.judginPerceiving.equals(mbti.judginPerceiving)) {
			return false;
		}
		return true;
	}
	@Override
	public int hashCode() {
		return (introversionExtroversion + sensingiNtuition+ thinkingFeelling + judginPerceiving).hashCode()
;	


	/*
	 * equals()호출의 결과가== true이고 hashCode()의 반환값을 동들비교 연산자를 통해 비뇨했을 때
	 * 값이 일치하다면 =>동일 객체로 판단(중복저장을 하지 않음)
	 * 필드의 값은 같은데 주소값이 달라서 동일객체가 아닌것으로 판단하기 때문에
	 * VO클래스는 내부에 equals()와 hashCode()를 오버라이딩
	 */
	
	
	}}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

