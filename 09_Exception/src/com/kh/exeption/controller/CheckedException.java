package com.kh.exeption.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {
	
	/*
	 * CheckedException
	 * 
	 * 문법적으로 반드시 예외 처리를 해야하는 예외들
	 * >>주로 외부 매체 입/출력 시
	 */
	public void method1() throws IOException{
		Scanner sc = new Scanner(System.in);
		//방법1. try ~~catch 문 작성
		//방법2. throws : 코드 작성부 말고 메소드를 호출하는 부분으로 예외처리를 위임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		/*try{
		String ste = br.readLine();}
		catch(IOException e) {
			e.printStackTrace();
		}
		*/System.out.println(str);
	}
}
