package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolView {
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	private Fan loginFan;

	// 프로그램을 실행헀을 떄 가장 먼저 보여질 화면 출력해주는 기능
	// 로그인에 성공한 회원의 정보를 담아줄 필드
	public void mainMenu() {
		System.out.println("\n\n aespa 커뮤니티에 오신것을 환영합니다.");

		while (true) {

			System.out.println("이용하실 서비스를 선택해주세요");
			System.out.println("1.aespa 정보보기");
			System.out.println("2.회원가입");
			System.out.println("3.로그인");
			System.out.println("4.게시판 서비스");
			System.out.println("5.프로그램 종료");

			System.out.println("메뉴번호 입력");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				info();
				break;
			case 2:
				signUp();
				break;
			case 3:
				login();
				break;
			case 4:
				boardMenu();
				break;
			case 5:
				break;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다. > 다시입력해 주세요");
			}

		}
	}

	private void info() {
		System.out.println();
		System.out.println("aespa 정보보기 서비스 입니다.");
		System.out.println("1. 윈터의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 카리나의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");

		System.out.println("이용하실 메뉴를 입력해 주세요");
		int menuNo = sc.nextInt();
		sc.nextLine();

		switch (menuNo) {
		case 1, 2, 3, 4:
			findMember(menuNo);
			break;
		case 5:
			findAll();
			break;
		case 6:
			return;// 메인메뉴로 다시 돌아가야 하니까 return으로 함
		}

	}

	private void findMember(int menuNo) {
		// 특정멤버의 주소값을 반환해줄래?
		// 어떤멤버를 달라고 요청할건지 정해서 요청해야 함
		Idol idol = ic.findMember(menuNo);
		System.out.println("♥              " + idol.getName() + "                ♥");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("전투기술 :" + idol.getSkill());
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("포지션 : " + idol.getPosition());
		System.out.println();

	}

	private void findAll() {
		// 모든멤버의 정보는 컨트롤러의 리스트에 있는데 담겨져있는 주소를 달라하려면 요청을 해야 하는데 요청은 메소드로 호출한다.
		// 모든멤버의 정보를 접근할 수있는 값을 줘 ==주소값
		List<Idol> aespa = ic.findAll();
		if (aespa.isEmpty()) {
			System.out.println("멤버가 다 탈퇴하였습니다");

		} else {
			for (Idol i : aespa) {
				System.out.println("§");
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 :" + i.getPosition());
				System.out.println("기술 : " + i.getSkill());
				System.out.println();
			}
		}
	}

	// 여기는 회원 가입

	private void signUp() {

		// Fan이라는 자료형에 맞춰 필드에 set할 값 3개를 사용자에게 입력받음
		// userId usetPwd nickName

		// 아이디 입력할 때 제약 조건을 줘보자
		// 아이디는 4글자에서 10글자 사이일 것
		// 아이디는 다른 Fan의 아이디와 중복되면 안될 것
		// 아이디는 4글자에서 10글자 사이만 가능
		// 뭐 써야 할까 사용자가

		String userId = sc.nextLine();
		while (true) {
			System.out.println("\n에스파 커뮤니티에 오신것을 환영합니다.");
			System.out.println("회원가입 서비스입니다.");
			System.out.println("가입하실 아이디를 입력해주세요");
			if (!(3 < userId.length() && userId.length() < 11)) {
				System.out.println("아이디는 4글자에서 10글자 사이만 가능합니다");
				break;
			}

			// 중복체크
			// 여기는 중복체크 하는 곳이 아니다. 여기는 보여주는 곳이니까 연산하는 컨트롤러로 보내줌
			// 보낼려며 메소드 호출

			boolean duplicateId = ic.checkId(userId);

			if (duplicateId) {
				System.out.println("이미 존재하는 Id입니다.");

			} else {
				System.out.println("사용 사능한 아이디입니다.");
				break;
			}
		}
		System.out.println("비밀번호를 입력해주세요");
		String userPwd = sc.nextLine();
		System.out.println("닉네임을 입력해 주세요");
		String nickName = sc.nextLine();

		// 뷰는 일단 자신의 할일을 1절까지 마무리 함
		// 사용자가 입력한 아이디와 비밀번호와 닉네임을 가지고 Fan객첼흘 생성헤서 필드에 담아서
		// 코트롤러에 럾ㄴ즌
		boolean result = ic.signUp(userId, userPwd, nickName);
		if (result) {
			System.out.println("회원가입에 실패했습니다.다시시도해주세요");
		} else {
			System.out.println("회원가입 성공!!");
		}

	}

	public void login() {
		System.out.println("\n로그인 서비스 입니다.");

		System.out.println("아이디를 입력해주세요");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String userPwd = sc.nextLine();

		Fan fan = ic.login(userId, userPwd);

		if (fan != null) {
			System.out.println(fan.getNickName() + "님 환영합니다");
			loginFan = fan;
		} else {
			System.out.println("로그인에 실패하셨습니다. 아이디 비밀번호를 다시 입력해 주세요");
		}

	}

	private void boardMenu() {
		while (true) {
			System.out.println("\n에스파 게시판 입니다.");
			System.out.println("이용하실 메뉴를 입력해주세요");
			System.out.println("1. 게시글 작성");
			System.out.println("2. 게시글 전체 조회");
			System.out.println("3. 게시글 상세조회");
			System.out.println("4. 메인메뉴로 돌아가기");
			System.out.println("당신의 선택은????");
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				post();
				break;
			case 2:selectBoardList();
				break;
			case 3:findByBoardNo();
				break;
			case 4:
				return;
			}
		}

	}

	public void post() {
		System.out.println("\n게시글 작성 서비스입니다.");

		// 전제조건 : 로그인한 사용자만 게시글을 작성할 수 있음

		if (loginFan != null) {

			System.out.println("게시글 제목을 입력해주세요");
			String boardTitle = sc.nextLine();

			System.out.println("게시글 내용을 입력해주세요");
			String boardContent = sc.nextLine();
			
			ic.post(boardTitle, boardContent, loginFan.getUserId());
			System.out.println("게시글 작성 성공");
		} else {
			System.out.println("로그인 후 이용가능한 서비스 입니다.");

		}
	}
	
	
	public void selectBoardList() {
		System.out.println();
		System.out.println("\n전체 게시글 목록입니다.");
		System.out.println();
		
		
		
		List<Board> boardList = ic.selectBoardList();
		
		
		
		if(boardList.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다.");
			System.out.println();
			System.out.println("첫 게시글의 주인공이 되어보세요!");
			
		}else {
			
			for(Board board:boardList) {
				System.out.println("글 번호 :"+ board.getBoardNo()+"\t");
				System.out.println("글 제목 :"+ board.getBoardTitle()+"\t");
				System.out.println("작성자 :"+board.getUserId()+"\t");
				System.out.println("작성일 :"+board.getCreateDate());
				System.out.println();
			}
			
			
			
			
			
			System.out.println("게시글이 존재합니다.");
			
		}

	}
	public void findByBoardNo() {
		System.out.println("\n게시글 상세 보기 서비스 입니다.");
		selectBoardList();
		System.out.println("상세보기를할 번호를 입력해주세요");
		int boardNo= sc.nextInt();
		sc.nextLine();
		Board board = ic.findByBoardNo(boardNo);
		
		if(board != null) {
			System.out.println("======================");
			System.out.println(board + "번 게시글 상세보기");
			System.out.println("\n제목"+board.getBoardTitle());
			System.out.println("\n내용"+board.getBoardContent());
			System.out.println("\n작성자 :"+board.getUserId()+"\t작성일 :"+board.getCreateDate());
		}else {
			System.out.println(boardNo+"번 게시글은 존재하지 않습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
