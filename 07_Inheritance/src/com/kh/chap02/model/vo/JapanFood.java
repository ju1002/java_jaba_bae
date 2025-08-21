package com.kh.chap02.model.vo;

public class JapanFood extends Food {
	private int fresh;
	
	public JapanFood() {
		
	}
	public JapanFood(String foodName, String material, int cookingTime, int fresh) 
		{super(foodName,material,cookingTime);//부모의 매개 변수를 통해 대입
		this.fresh = fresh;
	}
	public int getFresh() {
		return fresh;
	}
	public void setFresh(int fresh) {
		this.fresh=fresh;
	}
	public String info() {
		/*return "음식명"+super.getFoodName()+
				"주재료"+ super.getMaterial()+
				"조리시간"+ super.getCookingTime()+
				"신선도"+fresh;*/
		return super.info()+"신선도"+ fresh;
	}
	
	

}
