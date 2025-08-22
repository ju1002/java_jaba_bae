package com.kh.pravtice.list.music.comtroller;

import java.util.ArrayList;
import java.util.List;

import com.kh.pravtice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();

	public int addList(Music music) {
		//music == m
		// m을 list 맨 마지막에 추가함
		list.add(music);
		
		return 1;

		

		
		
		

	}
	public void addAtZero() {
		
	}
	public List<Music> printAll() {
		return list;
		
	}
	public Music searchMusic(String title) {
		if(title.equals(list.get(0))) {
			return list.get(0);
		}else {
			return null;
		}
		
		
	}
	public void removeMusic(String title) {
	
			
			
		}
			
		
		
		
		}
	


