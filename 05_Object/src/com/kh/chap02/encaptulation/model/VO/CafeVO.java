package com.kh.chap02.encaptulation.model.VO;

public class CafeVO {
	// 카페의 정보를저장하는 VO클래스 생성
	// 필드부,생성자부 , 메소드부
	// 필드부
	/*
	 * 객체가 가질 수 있는 속성 정보나 데이터를 담는 부분 class가지고 있는 변수 == 멤버변수 필드 [표현법] 접근제한자 자료형
	 * 필드식별자;
	 */
	private String name; // 카페 이름
	private String address; // 카페 주소
	private int signatureMenuprice; // 가격

// 필드의 값을 바꿔주는 메소드 생성 
// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * DTO클래스의 무조건들어감 >>setter을 만들어줌 VO>>일반적으로 setter메소드를 구현하지 않음
	 * 
	 * setter만들기 규칙 1. setter메소드는외부에서 접근이 가능해야 하기 떄문에 접근제한자 public을 이용 2. set필드명으로
	 * 식별자를 작성하며 낙타봉표기법(came1Case)을 꼭 지키도록 한다.
	 */
//	고유메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
//	signatureMrnuPrice
	public void setSignatureMenuPrice(int signatureMenuPrice) {
//	외부에서 접근 못하게 private으로 했으니까 내부에서 접근하는 메소드를 만들어야 함
//	내부에서 받기 위해 set를 넣은 메소드 식별자를 만듬 그 후 외부에서 받을 값을 담을 공간을 변수를 광호 안에 넣는데
//	그때 괄호안에 있는것을 매개변수라 함

		// System.out.println("setter에서 전달 받은 정수 값:"+ signatureMenuPrice);
		// 필드가 밖에서 히면
		signatureMenuPrice = signatureMenuPrice;
//	받은 5000이라는 값을 heap영력 price영역에 넣어야 한다 그럴려면 먼저 주소를 알아야 함
		System.out.println("내 주소가 뭐지? " + this);
//	내 클래스 안에서 주소값을 알기 위해서 this를 사용
//	this : 해당 객체의 주소값을 가리키는 역할
		if (signatureMenuprice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000이상의 정수를 입력하세요");

		} else {
			this.signatureMenuprice = signatureMenuPrice;
		}
//		scope안에 
	}
	// 값을 받아서 사용해야함
	// 값을 받을 공간을 만들어 줘야 함
	// 여기서도 값을 받을 공간을 괄호안에 넣어줌
	// 그 값은 필드명과 같게 작성한다.
	/*
	 * 필드의 접근제한자를 private으로 바꿔줌 외부에서 접근 할 수 없음
	 */
// 필드 4개 만듬

	// 생성자부(Constructor)
	// 메소드(Method)부
	/*
	 * 기능을(Method) 구현하는 부분 값과 관련된 메소드가 들어가야 함 메소드 [표현법] 접근제한자 (예약어) 반환형
	 * 메소드식별자(이름)(매개변수) () { 메소드를 호출했을 떄 실행할 코드}
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한할 수 있음 빈환형 : void => 메소드를 호출했을 떄 return할 때 돌려줄 값이 없다.
	 * 반환 시 결과값의 자료형을 명시해준다. 즉 지정해준다.
	 * 
	 * 매개변수 : 메소드를 호출 할 떄 메소드에 값을 전달하고 싶을 때 전달 값을 받아주는 변수 메소드 범위에서만 사용 가능. 하지만 생략도
	 * 가능하다.
	 * 
	 */
	// public void open () {
	// dishWash();
	// cleaning();
	// windowCleaning();
	// }
	// private void dishWash () {
	// System.out.println("깨끗하게 빡빡");}
	// private void cleaning() {
	// System.out.println("청소도 빡빡");}
	// private void windowCleaning() {System.out.println("유리도 빡빡");}

//	현재 속성과 메소드를 묶었다 하나의 클래스에
//	객체간의 서로를 모르는게 좋다
	// 객체 내부적 관점 / 외부적 관점
	/*
	 * 문제의 원인 노출이 심함 너무 잘 알고 있음 private로 바꿔줌
	 */
	// cafe.dishWash();
	// cafe.cleaning();
	// cafe.windowCleaning();
//	name필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
//	필드를 수정하니까 public 사용 set를 사용 함 매개변수 자리에는 받을 값의 자료형과 이름은 동일하게 작성   
//	kh카페라는 값을 String name 에 대입 된다.
//	받은 kh카페라는 값을 name필드에 넣어줘야 함 
//	방법1. 주소를 알아야 함 
//	방법2. this를 사용
//	클래스 내부에서 필드 주소까지 찾아가는 방법은 ? this
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	두개 이상의 필드값을 변경하는 메소드는 set이 붙으면 안된다.

//	주소지를 반환해준는 메소드
	public String getAddress() {
		return address;
//	return value;
//	value를 메소드 호출 부분으로 반환하겠다.
//	메소드의 반환형과 반환하고자 하는값의 자료형이 일치하는가를 꼭 확인해라
//	void가 아니라 String가 와야 함
	}

	public int getsignatureMenuPrice() {
		return signatureMenuprice;
	}

//	모든 필드값을 확인할 수 있도록 반환해주는 메소드
//	name, address,signatureMenuPrice
//	return 할 때 반환할수 있는 값 단 한개
	public String info() {
		String info = "[name 필드값 : "+ name + ",address 필드값 :" + address+ ", signatureMenuPrice : " + signatureMenuprice +
				"[";
				return info;
//	문자열 값이기 때문에 void가 아닌 String값으로 바꿈
		}

}


