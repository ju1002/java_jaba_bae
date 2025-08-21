package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	// 배열 part!
	/*
	 * 변수(Variable) 변수 : 메모리(RAM)공간에 DATA(VALUE)값을 저장하는 공간 특징 1.고유한 식별자를 가진다. 2.공간에
	 * 새로운 값을 대입해서 사용할 수 있다. 3.자료형이 정해져있다. 4.지역변수의 경우의 메모리의 Stack영역에 올라간다. 5.하나의
	 * 변수공간에는 하나의 값만 대입될 수 있다.>>>>>중요한 특징 특히 배열과 비교되는 특징! 6.초기화를 해야함 사용이 가능하다.
	 * 7.초기화는 한 번만 가능하다. 8.자료형은 크기가 정해져 있다. 9.자료현끼리의 변환이 가능하다. 10.선언된.Scope안에서만 사용이
	 * 가능하다. 11.변수끼리 연산도 가능하다.
	 */
	/*
	 * 배열(Array):하나의 배열에 여러개의 값을 담울 수 있다. 단,"같은 자료형의 값들"만 담을 수 있다.(제약조건) 동종
	 * 모음(homogeneous collection)이라고도 함 자바라는 언어 자체에 내장된 "유일"한 자료구조(값을 어떻게 저장하고 사용하고
	 * 검색하고 할 것인가)!
	 * 
	 * => 배열의 각 인덱스에 실제 값이 담김 index는 '0'부터 시작한다.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void methode1() {

		// System.out.println("법을 잘 지킵시다.");\
		// 임의의 정수 5개를 선언하고 초기화를 진행
		/*
		 * int num2=10; int num3=12; int num4=14; int num5=9; int num6= 1;
		 * 
		 * 
		 * int sum = num2+num3+num4+num5+num6; for(int i=1; i<=5; i++) {sum+=numi}
		 * numi라는 변수룰 선언 안했는데 지정해서 잘못됨 System.out.println(sum);
		 */
		// 배열 사용법
		// 1.배열 선언
		/*
		 * 배열선언 방법 1. 자료형 배열식별자(이름)[]; 2. 자료형[] 배열식별자;======>요 방법을 사용할 것
		 */
		// 배열 선언!
		// 식별자 뒤에 s를 붙여줌 단일이면 안붙임 보통은 s를 붙여줌
		// int[] nums;
		// 배열을 사용하려면
		// 2.배열 할당
		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 지정한 개수만큼 값이 들어갈 공간이 할당됨. [표현법] int[]
		 * num;//배열 선언 num = new int[몇칸이 필요한지 할당] num = new int[5] int[] arr = new
		 * int[5];//선언과 동시에 할당 배열은 참조자료형이다.
		 * 
		 * 
		 */
		// int[] nums = new int[2];//배열 선언 및 할당 nums라는 배열의 2칸을 할당
		int[] nums = new int[5]; // 참조자료형이라 함.
		// 참조자료형은 기본자료형과 달리 크기(Byte)가 정해져 있지 않다.
		// 개발자가 필요한 만큼 공간을 받아서 함 >>>>>동적할당 이라고도 함.
		// 배열의 값 담는 법
		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [표현법] 배열 식별자[인덱스] = 값;
		 */
		nums[0] = 10;
		nums[1] = 9;
		nums[2] = 3;
		nums[3] = 90;
		nums[4] = 32;
		// 5칸으로 할당한다 하면 0부터 시작이니까 인덱스4까지 가능
		// Systen.out.ptintln(nums);식별자를 담으면 안됨
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 배열을 사용해서 반복문 사용가능

	}

	// 목적:배열을 이해해보자!
	public void methodA() {
		/*
		 * int[] integers = new int[3]; //인덱스 개수 0.1.2 double[] doubles = new double[2];
		 * //0.1 char[] chars =new char[1]; //0 //배열식별자.>>>>>length: 배열의 크기(길이)>정수
		 * System.out.println(integers.length); System.out.println(doubles.length);
		 * System.out.println(chars.length); int i;
		 * 
		 * 
		 * i = 1; System.out.println(i); System.out.println(integers);
		 * System.out.println(integers[0]); integers[0] = 1; //integers주소 0번 인덱스의 1을
		 * 대입하는 방법
		 * 
		 * /*bollean/char/byte/short/length/int/float/double/long: 지역변수{}Scope안에 실제 값을
		 * 담을 수 있다 참조자료형: boolean[],chat[],byte[],int[],.....주소값을 담고 있는 변수:참조 변수(레퍼런스)
		 * 기본자료형은 메모리상의 공간을 만들고 1개의 값만 저장할 수 있다면 참조자료형은 메모리상의 stack이라는 부분의 메소드가 올라감 배열과
		 * heap라는 부분이 있는데 heap부분에서 주소를 받아 저장한다 여기서 주소안에는 여러개의 값이 넣어져있다. heap영역에서는 주소안에
		 * 무조건 값이 들어있어서 초기화할 필요가 없음?
		 * 
		 * 주소먼저 찾아감 integers로 이동 그 후 내가 선택한 인데스 칸 에서 내가 넣고 싶은 값을 지정 후 내가 선택한 인덱스의 대입한다.
		 */

		// 인포, A강의장, B강의장, C강의장, 사무실
		/*
		 * String[] kh; kh = new String[5]; //heap메로리에 5칸의 주소를 만들어
		 * System.out.println("종로점 주소"+kh);
		 * 
		 * kh[0] = "인포"; kh[1] = "A강의장";
		 * 
		 * //A강의장 풀력 System.out.println(kh[2]); System.out.println(kh[1]); //반복문 가능
		 * for(int index = 0;index <5; index++) {System.out.println(kh[index]); }
		 * 
		 * //(heap까지 감.값을 넣을 위치 지정, 넣을 값을 입력 후, =대입연산자를 이용해 값 인포대입한다. //선택지 즉 칸은 5개
		 * //kh의 주소값이 들어있음 //new String[5]값이 다 kh라는 변수에 다 들어가는게 아니라 주소값을 담는다.
		 */
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);
		int[] numbers1 = new int[3]; // heap에서 3index가 할당 됨 32번지
		int[] numbers2 = new int[3]; // heap에서 3index가 할당 됨 다른 곳에 3index인 주소가 생김 35번지 그래서 false
		System.out.println(numbers1 == numbers2);
		// 참조자료형에서는 --(동등비교 연산자) 사용시
		// 주소값을 비교하기 떄문에 원하는 결과를 얻을 수 없음
		// 문자열.equals("비교한 문자열");
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
		// 해쉬코드 : 주소값을 10진수 (int형태)형태로 나타낸 것

	}

	public void lootto() {
		// 로또번호 생성기
		int[] nums = new int[6]; // 0~5까지 index가 나뉘어짐
		// 먼저 static에 있는 공간을 불러줌
		nums[0] = (int) (Math.random() * 45) + 1;
		nums[1] = (int) (Math.random() * 45) + 1;
		nums[2] = (int) (Math.random() * 45) + 1;
		nums[3] = (int) (Math.random() * 45) + 1;
		nums[4] = (int) (Math.random() * 45) + 1;
		nums[5] = (int) (Math.random() * 45) + 1;
		// 중복되는 값은 묶는다
		// 중복되지 않는 것은 변수로 지정한다
		for (int i = 0; i < 6; i++) {
			nums[i] = (int) (Math.random() * 45) + 1;
		}
		// 반복하는 횟수가 정해져 있잖아 그니까 for문 사용
		// 반복하는 횟수가 무한대가 그럼 while문 사용
		// 이제 출력을 해야지
		// 배열에 들어가는 값 : 요소(elements)
		// System.out.println(Arrays.toString(nums));
		// Arrays.toString(배열식별자)

	}

	public void methodB() {

		// 5개의 요소를 담을 수 있는 String 배열을 선언 밋 할당하시오
		// 동물
		// 1.배열 선언 및 배열 할당
		// 2.배열에 각 index에 동물 대입
		String[] pet = new String[5];
		pet[0] = "조던이";
		pet[1] = "호랑이";
		pet[2] = "토끼";
		pet[3] = "말";
		pet[4] = "소";
		pet[5] = "개";
		// ArrayIndexOutofBounds
		// 배열의 인덱스가 범위를 벗어남
		// 오류뜨는 이유 내가 정한 index5인데 그 이상을 넘어선 index를 내가 값을 넣었기 떄문
		// 실행전 빨간줄이 뜨지 않는 이유는 문법적으로는 문제가 없음 하지만 실행을 해봐야 아는것도 있음
		// 생긱 안해도 괜찮은 것
		// 1.;
		// 2.어?조건이다 if문 사용
		// 3.어?합계이다 sum 사용

	}

	public void methodC() {
		// 사용자에게 세개의 정수를 입력받아서 입력받은 정수 중 최소값 구하기
		// 배열을 선택할 기준
		// 1. 두 개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 때
		// 1)사용자로부터 값을 입력받아서 배열의 각 인덱스에 대입

		Scanner sc = new Scanner(System.in); // 사용자에게 값을 입력받아
		int[] nums = new int[3]; // 3개의 정수라고 명확하게 말해서 배열을 사용해
		/*
		 * System.out.println("첫 번째 정수를 입력해 주세요"); //출력한번 해보고 nums[0]= sc.nextInt();
		 * System.out.println(nums[0]+"nums 라는 배열의 0번째 인덱스에 대입된 값"); nums[1]=
		 * sc.nextInt(); System.out.println(nums[1]+"nums 라는 배열의 1번째 인덱스에 대입된값");
		 * nums[2] = sc.nextInt();
		 * System.out.println(nums[2]+"nums 라는 배열의 2번째 인덱스에 대입된 값");
		 */
		// 각각의 nums라는 배열의 index의 내가 정한 3칸을 대입한다 그리고 출력을 해본다

		// 배열의 정의 : 배열은 물리적인 구조와 논리적인 구조가 동일합니다.
		// 물리적인 구조는 실제 메모리 상의 올라가는것
		for (int i = 0; i < nums.length; i++) {
			System.out.println("정수를 입력하시오");
			nums[i] = sc.nextInt();
			System.out.println("nums라는 배열의" + i + "번째 인덱스 값 " + nums[i]);
		}
		System.out.println(Arrays.toString(nums));

		// 2.해당 배열의 요소 중 가장 작은 값 ==최소값을 출력하는 것이 목적
		int min = nums[0];
		// 첫 번쨰요소를 최소값으로 넣어줌 기준이 되는 것
		/*
		 * if(min>nums[1]) {min= nums[1];
		 * 
		 * } if(min>nums[2]) {min= nums[2];}
		 */
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[1]) {
				min = nums[1];

			}
		}
		System.out.println("배열의 요소 중 가장 작은 값:" + min);
	}

	public void methodD() {
		// 한 번 할당 받은 배열의 크기를 변경할 수 없움!
		String[] name = new String[3];
		name[0] = "배";
		name[1] = "주";
		name[2] = "영";
		System.out.println(Arrays.toString(name));
		name[2] = "용";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());
		name = new String[4];
		name[3] = "못";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());
		// java의 특징인 자동메모리 관리 name이 원래 가리키던 aaa가 배열을 다른 수로 할당을 함으로써 주소가 달라지고 name는
		// 다른 주소bbbb를 가리키게됨 그의 따라 aaa는 가리킴을 못받고 시간이 지나면 aaa는 g.c(쓰레기 수집가)가 aaa를 수집함 하지만
		// g.c가 언제 작동하지는 모름
		// 기존배열식별자에 할당만 새롭게 한다면
		// => 기존 참조하고 있던 연결이 끊기고 새로운 배열을 참조함.
		// null : 아무것도 존재하지않음
		/*
		 * 참조자료형애는 null이라는 값이 들어감 주소값이 존재하는가 그렇지 않은가
		 */
		name = null;// 현재 연결고리를 끊고 싶다.
		System.out.println(name);
		name[0] = "배조용";

		// 가리키고 있는 대상이 null인데 주소가 없는데 어디 접근함?

	}

	public void methodE() {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(Arrays.toString(arr));
		// 배열 어케씀? >>>>>>>
		// 선언과 동시에 요소를 대입해서 사용한다.
		int[] arr1 = new int[] { 1, 2, 3, };
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr2));
	}

	public void methodF() {
		int[] orign = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(orign));
		int[] copy = orign;
		orign[2] = 32;
		System.out.println(Arrays.toString(orign));
		System.out.println(Arrays.toString(copy));

		System.out.println(orign.hashCode());
		System.out.println(copy.hashCode());

	}

	public void methodG() {
		int[] orign = { 1, 2, 3, 4, 5 };
		int[] copy = new int[6];

	}
}

//프로그래밍 언어 세대 별 구분
//1세대 : 기계어 2진수
//2세대 : 어셈블리어 기계어를 추상화 시키기 시작 함.
//3세대 : 고급언어 현 시대의  주류언어 인간이 이해하기 시작하게된 언어 ex)java
//프로그래밍 언어 : 컴퓨터를 동작 시키기위한 언어 
//java의 특징 하드웨어와 운영체제의 종속을 안 받음
//jvm: 가상의 컴퓨터 
//메소드는 호출해야 작동이 됨
//main method는 jvm이 호출함0
