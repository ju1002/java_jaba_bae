package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		// 사용자에게 식당의 정보를 받아서
		// 3개의 식당정보를 입력 받는다.
		// 필드의 값을 받음
		// 레스토랑에 사용자가 입력한 값을 필드에 대입하고 싶다.
		// 어떻게 할까?
		// 1번 setter호출
		// 2번 생성자 매개변수로 인자값 전달
		Scanner sc = new Scanner(System.in);
		Restaurant r0 = null;
		Restaurant r1 = null;
		Restaurant r2 = null;
		for (int i = 0; i < 3; i++) {
			System.out.println("식당의 상호를 입력해주세요");
			String storName = sc.nextLine();
			System.out.println("식당의 주소를 입력해주세요");
			String address = sc.nextLine();
			System.out.println("식당의 주력 메뉴를 입력해 주세요");
			String mainMenu = sc.nextLine();
			if (i == 0) {
				r0 = new Restaurant(storName, address, mainMenu);
			} else if (i == 1) {
				r1 = new Restaurant(storName, address, mainMenu);
			} else {
				r2 = new Restaurant(storName, address, mainMenu);
			}
			/*System.out.println(r0.info());
			System.out.println(r1.info());
			System.out.println(r2.info());*/

		}
		System.out.println("가게명을 입력해주세요");
		String searched = sc.nextLine();
		if(searched.equals(r0.getStorName())) {
			System.out.println(r0.getMainMenu());
		}
		if (searched.equals(r1.getStorName())) {
			System.out.println(r1.getMainMenu());
		}
		if(searched.equals(r2.getStorName())) {
			System.out.println(r2.getMainMenu());
		}
		
		}
		
		Restaurant[] restaurants = new Restaurant[3];
		
	}
		//식당들이 가지고 있는 storName의 필드값과 비교하려면
		//식당의 3개 를  비교해야함
	/* //사용자에게 상호명을 입력받아서 
	* 입력받은 상호와 일치하는 식당의 메인 메뉴를 출력해주는 프로그램
	// 중복되고 반복되니까 묶어준다 for문으로
	/*
	 * System.out.println(r.info()); Restaurant r2 = new Restaurant(storName2,
	 * address2, mainMenu2); System.out.println("식당의 상호를 입력해주세요"); String storName2
	 * = storName2; System.out.println("식당의 주소를 입력해주세요"); String address2 =
	 * address2; System.out.println("식당의 주력메뉴를 입력해주세요"); String mainMenu2 =
	 * mainMenu2; System.out.println("식당의 상호명을 입력해주세요"); String storName3 =
	 * storName3; System.out.println("식당의 주소를 입력해주세요"); String address3 = address3;
	 * System.out.println("식당의 대표메뉴를 입력해주세요"); String mainMenu3 = mainMenu3;
	 * Restaurant r3 = new Restaurant(storName3, address3,mainMenu3);
	 * System.out.println(r.info()); System.out.println(r2.info2());
	 * System.out.println(r3.info3()); //입력받은 식당의 정보를 출력해주는 프로그램 // 사용자에게 상호명을 입력받아서
	 * 
	 */


