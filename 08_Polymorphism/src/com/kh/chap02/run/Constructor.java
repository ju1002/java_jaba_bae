package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.RiceWineDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Constructor {

	public static void main(String[] args) {
		SojuDrinker s1 = new SojuDrinker();
		SojuDrinker s2 = new SojuDrinker();
		BeerDrinker b1 = new BeerDrinker();
		BeerDrinker b2 = new BeerDrinker();
		RiceWineDrinker r1 = new RiceWineDrinker();
		RiceWineDrinker r2 = new RiceWineDrinker(); 
		
		s1.drink();
		s2.drink();
		b1.drink();
		b2.drink();
		r1.drink();
		r2.drink();
		
		s1.eat();
		s2.eat();
		b1.eat();
		b2.eat();
		r1.eat();
		r2.eat();
//묶는 법 소주 먹는 사람들 막걸리 먹는 사람들 맥주먹는 사람들 묶어 볼까?
		
	System.out.println("=========================");
	SojuDrinker[] sojuArr =new SojuDrinker[2];
	BeerDrinker[] beerArr = new BeerDrinker[2];
	RiceWineDrinker[] rwArr = new RiceWineDrinker[2];
	sojuArr[0] =s1;
	sojuArr[1] =s2;
	beerArr[0] = b1;
	beerArr[1] = b2;
	rwArr[0] = r1;
	rwArr[1] = r2;
	for(int i = 0; i<sojuArr.length; i++) {
		sojuArr[i].drink();
		sojuArr[i].eat();
	}
	for(int i = 0; i<beerArr.length; i++) {
		beerArr[i].drink();
		beerArr[i].eat();}
	for(int i = 0; i<rwArr.length; i++){
		rwArr[i].drink();
		rwArr[i].eat();
	
	}
//	한꺼번의 술먹는 사람으로 묶자
	System.out.println("=====================");
	Drinker[]drinkArr = new Drinker[6];
	drinkArr[0]= s1;
	drinkArr[1]= s2;
	drinkArr[2] = b1;
	drinkArr[3] = b2;
	drinkArr[4] = r1;
	drinkArr[5] = r2;
	for(int i = 0; i<drinkArr.length; i++) {
		drinkArr[i].drink();
		drinkArr[i].eat();
	}
// 다형성으로 정리
	//디형성을 적용하기 위한 대 전제는 상속이 되어야 함.
	//다시한번 자식클래스는 부모클래스의 자료형을 상속받아 사용가능!
	//@Override를 통해 drinkArr로 묶어도 자식들이 오버라이딩을 해서 
	//자식들의 메소드가 호출됨
	//상속과 다형성은 무조건 같이 사용함!
	//부모타입으로 묶어서 사용하면 됨!
	}

}
