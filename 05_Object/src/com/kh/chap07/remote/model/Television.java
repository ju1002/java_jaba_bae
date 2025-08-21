package com.kh.chap07.remote.model;

//내가 실핼하고자 했던 채널 바꾸지나 종료하는거 같은 실행을 하기 위해 필요한 값들을 저장하는 공간
public class Television {
	private boolean on;
	private String[] channel;

	// 생성자
	public Television() {

		channel = new String[5];
		channel[0] = ("스포츠 TV");
		channel[1] = ("무한도전");
		channel[2] = ("ebs 교육방송");
		channel[3] = ("카툰네트워크");
		channel[4] = ("tvn drama");

	}

	public String[] getChannel() {
		return channel;

	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	/*
	 * 채널 어떡하지? 2.String[]
	 */
}
