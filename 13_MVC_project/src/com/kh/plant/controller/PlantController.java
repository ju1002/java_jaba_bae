package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.vmolde.vo.Plant;

public class PlantController {
	/*Controller : 사용자가 View 를 통해 요청했을 때
	 * 요청을 받아 처리해준 뒤 다시 처리결과를 View로 바꿔줌
	 */
	private List<Plant>  plants = new ArrayList();
	//초기화 블록 
	
	{
		plants.add(new Plant("안시리움" , "분재"));
		
	}
	 public void createPlant(String name , String type) {
		 
	 }
	 
	 public List<Plant>readAll(){
		 return plants;
	 }
	 //View 에서 식물 검색 요청이 왔을 때 호출되는 메소드
	 public List<Plant> findByKeyword(String keyword) {
		 //1. Plant[] => 배열을 통해 많은 자료를 보낼수 있지만 몇칸으로 할지 정확히 정하기가 어려움
		 //2. List<Plant>사용
		 
		 List<Plant> searched = new ArrayList();
		 //식물의 이름 또는 타입에 사용자가 입력한 키워드가 포함되어있을 경우
		 //싸그리 몽땅 다 들고가서 출력 해줄것 
		 //조회 => 사용자가 입력한 keyword사 포함된 Plant 객체의 필드값을 확인
		 // plants의 요소를 전부 다 하나하나 다 확인 해야 한다.
		 //1.plants의 요소를 정확히 특정할 수 없기 때문에 요소의 개수만큼 반복문 사용
		 for(int i = 0; i<plants.size(); i++) {
			 //요소를 변수에 대입
			 Plant plant = plants.get(i);
			 //plant 객체의 name필드 또는 type필드에 사용자가 입력한 keyword가 포함되어 있다면
			 //포함돼있는지 확인하는 메소드는 contains()메소드를 활용함
			 if(plant.getName().contains(keyword)||
				plant.getType().contains(keyword)) {
				 searched.add(plant);
			 }
		 }return searched;
	 }
	 
	 
	 
	 //View 에서 식물 삭제 요청이 왔을 때 호출되는 메소드
	 public int deletePlant(String name, String type) {
		 //사용자가 입력한 식물이름 + 식물 종류와 일치하는 필드값을 가진 Plant객체를 제거
		 //case1 동일한 이름 및 종류룰 가진 식물이 존재하지 않았따.
		 //case2 동잉한 이름 및 종류를 가진 식물이 딱 한개만 존재한다.
		 // case3 동일한 이름 및 종류룰 가진 식물이 여러개 존재 했따.
		 //성공/실패 여부에 따라서 View에게 반환값을 다르게 돌려주어야함
		 
		 
		 int count = 0;
		for(int i = 0; i < plants.size();i++) {
			if(name.equals(plants.get(i).getName())&&type.equals(plants.get(i).getType())){
				
				
				
				//요소를 제거
				plants.remove(plants.get(i));
				i--;
				count++; // 수가 계속 증가하니까
			}
		}
		 
		 
		 
		 
		 return count;
	 }
	 public boolean updatePlant(String name , String type , String newName, String newType) {
		 for(int i = 0; i<plants.size();i++) {
			 Plant p = plants.get(i);
			 if(name.equals(p.getName())&&(type.equals(p.getType()))) {
				 //사용자가 입력한 새 이름 및 새 타입으로 갱신
				 //plants.set(i, p);
				 //set = > 첫번째 인자인 인덱스 위치에 있는 요소를 두번째  인자로 바꿔주는 메소드
				 p.setName(newName);
				 p.setType(newType);
				 return  true;
			 }
		 }
		 return false;
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
		 
		 
	 
	 
	 
}
