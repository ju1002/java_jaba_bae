package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		//소스코드를 이용해서 파일을 만들어보자
		//File클래스를 가지고 작업
		//java.io 패키지에 존재
		
		//파일클래스를 객체 생성
		//1.파일명을 먼저 설정
		File folder = new File("folder");
		folder.mkdir();
		//파일 만들기
		//경로지정까지
		try {
			File file2 = new File("folder/test.txt");
			file2.createNewFile();
			folder.createNewFile();
			
			System.out.println("파일 맞니?"+file2.isFile());
			System.out.println("파일명 :"+file2.getName());
			System.out.println("상위 폴더 : "+file2.getParent());
			System.out.println("절대경로: "+file2.getAbsolutePath());
			System.out.println("파일 크기 : "+ file2.length());
			
		}
		catch(IOException e) {
			e.printStackTrace();
			}
		//createNewFile(): 파일 생성 메소드
		//예외처리를 해야만 사용가능
		//폴더 만들기
		//folder
		//makeDIrectory  mkDir()
		
		
		
		/*
		 * => IO(Input % Output), 입/출력
		 * 프로그램 상의 데이터를 외부매체 (모니터,스피커 , DB,프로세스, 콘솔, "파일)로 출력
		 * 입력장치(마우스,키보드,마이크,"파일")로 입력받는 과정
		 * 
		 * IO를 진행하고 싶으면 
		 * 우선적으로 반드시 프로그램과 외부매체 간의 통로를 만들어줘야함
		 * 통로 : Stream이라고 함 
		 * Stream 특징
		 * 단방향이다 >>>내가 출력을 한다해서 출력용 Stream을 만들었다 치면 출력밖에 못함.
		 * 				입력용과 출력용이 따로 존재한다. 일방통행같은 것
		 * 
		 * 선입선출이다 (First In First Out) 앞에가 나가야 뒤에것이 나감 >>시간지연 문제 발생
		 *
		 *Stream의 구분
		 *Stream 사이즈 구분
		 * 바이트 스트림 : 1Byte짜리가 이동할 수 있는 통로
		 * 				>>입력(XXXInputStream)/출력(XXXOutputStream)
		 * 문자 스트림 : 2Byte짜리가 이동할 수 있는 통로
		 * 			>>>입력(XXXReader)/출력(XXXWriter)
		 * 외부매체와의 직접적인 연결 여부
		 * 기반 스트림: 외부매체와 직접적으로 연결되는 스트림
		 * 보조 스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도로 만들어진 스트림
		 * 			단독 사용 불가(반드시 기반스트림이 존재해야만 사용이 가능함)
		 * 			속도향상 ,자료형에 맞춰서 변환, 객체단위로 입출력, 바이트 <=> 문자
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
