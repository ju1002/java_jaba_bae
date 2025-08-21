package com.kh.chap04.assist.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
//	기반스트림이 input/output계여링ㄹ 셩우
//	보조스트림도 input/ output계열일 경우;;;
//	기반스트림이 ㄲReader/Wrier일 계열일  병우

	// BufferedReader/BufferedWriter
	// 속도 향상이 목적인 보조스트림
	// 임시공산을 제공해서 한번에 모아두었다가 한꺼에 입/출력을 진핼
	public void outputFile() {
	FileWriter fw =null;
	BufferdWriter bw = null;
	try {
		fw= new FileWriter("c.buffer txt");
		bw = new BufferedWriter(fw);
		
	}catch (IOException e) {
		e.printStackTrace();}finally 
	{try {
		if(fw!=null) {fw.close();}
			bw.close();}catch(IOException e) {
		}
	}
}
	
	public void inputFile() { 
		//FileReader를 기반으로 BufferedReader를 사용해서 입려받기
		try(BufferedReader bfr = new BufferedReader(new FileReader("c_Buffer.txt"))){
			String str = "";
			while((str = bfr.readerLine())!=null) {
				System.out.println(str);
				
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

























}
