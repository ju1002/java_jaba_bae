package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.vmolde.vo.Plant;

//	View : 시각적인 부분 담당 , 화면 입/출력
//ㅍ프로그램 실행 시 보여줄 화면을 출력해주는 기능
public class PlantView {
	// 저장소 : ArrayList
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();

	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("식물관리 프로그램");

			System.out.println("1.식물 추가하기");
			System.out.println("2.식물 전체조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록을 파일로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.println("어떤 기능을 이용하시겠어요");
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch(menuNo) {
				case 1:	break;
				case 2:
					break;
				case 3:findByKeyword();
				case 4:deletePlant();
					break;
				case 5:updatePlant();
					break;
				case 6:
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
					
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해 주세요.");
				sc.nextLine();
			}
			// CRUD
			// Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가하는 작업
			// Read : 만들어진 식물을 조회하는 작업
			// Update : 시존의 식물을 수정하는 작업
			// Delete : 식물을 삭제 하는작업
		}
	}

	private void creatPlant() {
		System.out.println("\n 식물추가 서비스 입니다.");
		System.out.println("식물 명을 입력해 주세요");
		String name = sc.nextLine();
		System.out.println("종류를 입력해주세요");
		String type = sc.nextLine();
		// 식물 VO 클래스에 대입랗 값 두개를 입력받았음
		// View 는 일단 할일이 끝남

		// 사용자가 입력한 식물명이랑 종류를 가지고 식물목록에 추가해줘 method를 사용해서 요청함
	}
	private void isEmpty() {
		List<Plant>plants = pc.readAll();
		if(plants.isEmpty()) {
			System.out.println("식물이 존재하지 않습니다.");
			System.out.println("새로운 식물을 추가해 보아요");
		
		}else{
			
			
		
		for (Plant p : plants){
			System.out.println("식물이름"+ p.getName()+", 식물종 : " + p.getType());
		}}
				

				
				
	}
	
	
	//사용자가 기무에 대한 키워드를 입력할 수 있는 화면을 출ㅋㅋㅋ
	/*1. 사용자가 입력한 키워드가 제목 또는 타입에 포함되어 있었따면 출룍
	 *
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 //4. 특정 식물을 삭제할 수 있는 화면을 출력해주는 기능
	 private void deletePlant() {
		 System.out.println();
		//삭제를 어떻게 할 수 있도록 만들어 줄 것인가?
		 //1. 식물 이름을 입력받아서 삭제
		 //2. 식물 타입을 입력받아서 삭제
		 //3. 식물이름과 타입을 입력받아서 삭제>>>이것으로 실행
		 //4. 그냥 아무것도 입력안받고 전체 삭제
		 
		 /*이름만 일치하면 삭제
		  * 타입만 일치하면 삭제
		  * 이름하고 타입하고 둘 다 일치해야 삭제>>이것으로 실행
		  * 이름 키워드가 포함되어 있으면 삭베
		  * 타입 키워드가 포함되어 있으면 삭제
		  * 이름 또는 타입에 키워드가 포함되어 있으면 삭제
		  */
		
		 System.out.println("식물의 이름을 입력해 주세요");
		 String name = sc. nextLine();
		 System.out.println("식물의 종류를 입력해주세요");
		 String type = sc.nextLine();
		 int count = pc.deletePlant(name, type);
		 //=0 =1
		 if(count >0) {System.out.println("삭제성공");
		 				System.out.println(name +"를 총"+ count+"개 삭제했습니다.");
		 				
			 
		 }else {
			 System.out.println("삭제할 식물을 찾지 못했습니다");
			 
		 }
		 System.out.println();
		 
	 }
	 //3번 
	 public void findByKeyword() {
	 
	 System.out.println("식물검색 서비스 입니다.");
	 System.out.println("검색어를 입력해주세요");
	 String keyword =sc.nextLine();
	 
	List<Plant> searched =  pc.findByKeyword(keyword);
	//경우의 수를 생각해야 함.
	//1.검색 결과가 있는거랑 없는것이 있디.'
	//있으면 보여주면 되고 없으면 없다고 알려줘야 함 조건문 사용
	if(searched.isEmpty()) {
		System.out.println("검색 결과가 존재하지 않습니다.");
		//searched는 null이 될 수없다 이미 객체를 생성해서 주소가 생겼기 때문에
	}else {//검색 결과가 적어도 하나는 있고 무한대로 있을 수도 있어서 반복문 사용
		System.out.println("조회 결과가 총"+ searched.size()+ "건 존재합니다.");
		for(Plant p : searched) {
			System.out.println("==============================================");
			System.out.println("이름 : "+ p.getName()+", 종류 : " +p.getType());
		}
		
	}
	
	 
	 //컨트롤러에게 기능을 수행하게 하기위해 메소드 호출후 매개변수에 인자값을 넣어서 보내줌
	
	 }
	//Composition 상속을 사용하지 않고 다른 페키지에 있는 것들을 사용하기 위해서 내 자신 안에서 필드로 만들어 
	 //의존성을 없애준다. 
	 // 자바는 오로지 값만 전달한다.
	
	//5.특정 식물의 정보를 수정할 수 있는 화면을 출력해주는 기능
	 private void updatePlant() {
		 //경우의 수 
		 //이름  이름 바꾸기
		 //타입 타입바꾸기
		 //이름타입 이름
		 //이름 타임 타입
		 //이름  타입
		 //타입    이름
		 //이름 타입 이름 타입
		 
		 //시용자에게 식물의 이름과 타입을 입력받아서
		 //일치하는 식물을 찾아서 
		 //새로운 식물의 이름과 타입으로 갱신
		 System.out.println("식뭉 정보 수정 서비스 입니다.");
		 //값을 총 4개 받아야 함 이름 타입 바꿀 이름 타입
		 System.out.println("기존 식물 이름");
		 String name = sc.nextLine();
		 System.out.println("기존 식물  타입");
		 String type =sc.nextLine();
		 System.out.println("새 식물 이름");
		 String newName = sc.nextLine();
		 System.out.println("새 식물 타입");
		 String newType = sc.nextLine();
		 //일단 1절은 끝남
		boolean result = pc.updatePlant(name,type,newName,newType);
			if(result) {
				System.out.println("식물의 정보가 갱신 되었습니다.");
			}else { System.out.println("식물이 존재하지 않습니다.");
				
			}
		 //참조 자료형이니까 주소값이 올라감
		 
	 
	 
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


}
