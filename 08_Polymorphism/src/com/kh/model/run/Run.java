package com.kh.model.run;

import com.kh.chap05.model.vo.Hiphop;
import com.kh.chap05.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		MusicI hiphop = new Hiphop();
		MusicI jazz = new Jazz(); 
		hiphop.play();
		jazz.play();
		
	}

}
