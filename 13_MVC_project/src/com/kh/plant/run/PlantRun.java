package com.kh.plant.run;

import com.kh.plant.view.PlantView;

public class PlantRun {

	public static void main(String[] args) {
	/*MVC 패턴 : view , Controlller
	 * 에플리게이션의 구조를 세가지 요솔 
	 * 라는 
	 * 
	 * VIeww: 사용자 인터페리스를 담당
	 * 사용자게게 정보 표시
*/	
		
		PlantView pv= new PlantView();
		pv.mainMenu();
		System.out.println();
		
}}
