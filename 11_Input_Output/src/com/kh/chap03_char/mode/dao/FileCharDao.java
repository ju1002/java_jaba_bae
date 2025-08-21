package com.kh.chap03_char.mode.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	public void outputToFile() {
		//FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림
		
		//스츠림 선언
		/*FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
		
		//데이터 출력 >write()
			fw.write("와 신기하다");
			fw.write("E");
			
			
		}catch(IOException e) {
			System.out.println("다시 시도해주세요");
		}finally {
			//자원반납
			
			try {
				if(fw !=null) {
					fw.close();
					
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}*/
	
	
		//try~ with~resource구문
		/*
		 * try(스트림 객체생성){
		 * 
		 * 예외가 발생할 수도 있는 구문
		 * }catch(예외클래스 e){
		 * 
		 * 
		 * 예외가 발생했을때 실행하는 구문;
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해줌
		 * 혹여나 할 수도 있는 실수를 줄일 수있는 아주 훌륭한 문법
		 * 대전제 : Closeable를 구현할 것
		 */
		try(FileWriter fw =new FileWriter("c_char.txt")){ 
			fw.write("와");
			fw.write("e");
			
		}catch(IOException e) {
			e.printStackTrace();
		}}
	public void writeTil() {
		//사용자에게 오늘 학습내용을 입력받아서
		//외부파일에 내용을 출력
		//내보낼 파일명 : 2025년 08원 14일 오눌의 학습일자
		//날짜 출력 방법 Date
		Date now = new Date();
		//System.out.println(now);
		// 내가 원하는 날짜형식의 형태를 바꾸고 싶으면
		//날짜를 문자형식으로 바꿔줌
		new SimpleDateFormat("yyyy년 MM월 dd일").format(now); //String
		String titleDate = new SimpleDateFormat("yyyy년 MM원 dd일").format(now);
		
		//System.out.println(titleDate);
		//String fileName = titleDate + "오늘의 학습일지.txt";
		StringBuilder sb = new StringBuilder();
		sb.append(titleDate);
		sb.append("오늘의 학습일지.txt");
		
		//출력하려면 출력 스트림 작성
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		try {
			fw = new FileWriter(sb.toString());
			System.out.println("오늘배운 내용을 작성해보시오");
			String content = sc.nextLine();
			fw.write("오늘의 학습한 내용 : \t"+ content);
			
			
			
			
		}catch(IOException e) {
			System.out.println("문제발생");
		}finally {
			try {
				if(sc != null)sc.close();
				if(fw != null)fw.close();
				
			}catch(IOException e){
				System.out.println("자원 반납을 하다가 문제가 발생");
				
				
				
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
