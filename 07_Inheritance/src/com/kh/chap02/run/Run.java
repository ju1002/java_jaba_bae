package com.kh.chap02.run;

import com.kh.chap02.model.vo.ItalyFood;
import com.kh.chap02.model.vo.JapanFood;
import com.kh.chap02.model.vo.KoreaFood;

public class Run {

	public static void main(String[] args) {
		
		KoreaFood kf = new KoreaFood();
		kf.setFoodName("비빔밥");
		System.out.println(kf.getFoodName());
		
		
		ItalyFood tf = new ItalyFood("기름파스타","기름",15,5);
		System.out.println(tf.info());
		JapanFood jf = new JapanFood("스시","밥",20,5);
		System.out.println(jf.info());
	}

}
