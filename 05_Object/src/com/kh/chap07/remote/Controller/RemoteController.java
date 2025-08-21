package com.kh.chap07.remote.Controller;

import com.kh.chap07.remote.model.Television;

//데이터와 화면의 중간다리역할
public class RemoteController {
	private Television tv = new Television();
	private int channelNo;
//int형은 기본값이 0이어서 굳이 =0을 안해줘도됨

	public int powerOn() {

		if (!tv.isOn()) {
			tv.setOn(true);
			return 1;
		}
		return 0;
		// 티비가 꺼져있을때 이걸 키고 싶어 를 만들어야 함
	}

	public String channelUp() {
		if(!tv.isOn()) {

		// getter메소드를 호출해서 tv의 privae값을 가져온다.
		String[] channel = tv.getChannel();
		// 5번 인데스 이상부터는 채널이 없으니까 그이후에는 오류가 뜨잖아 그것을 없애주기 위해서
		if (channelNo < channel.length - 1) {
			return channel[++channelNo];
		}channelNo = 0;
		return channel[0];

		}
		return null;
	}

	public int getChannelNo() {
		return channelNo;
	}

}
