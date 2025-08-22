package com.kh.pravtice.list.music.comtroller;

import java.util.ArrayList;
import java.util.List;

import com.kh.pravtice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();

	public int addList(Music music) {
		//music == m
		//그 m을 list 맨 마지막에 추가한거네
	
		list.add(music);
		
		return 1;
		
		
		

	}

}
