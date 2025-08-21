package com.kh.chap04.model.vo.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {
	
//	상속이 문제를 일으키는 예시
	public static void main (String[] args) {
		//Properties : Map계열> Key + Value 세트로 저장함
		//사용목적 : 외부 파일에 입/출력을 하기위한 용도
		//.properties파일로 입/출력
		//변경하지 않는 설정 정보
		//해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		//Properties에 요소를 추가할때 put 말고 set으로 추가해라
		Properties prop = new Properties();
		//prop.put("키",new Fish());
		prop.setProperty("List","ArrayList");
		prop.setProperty("Set","HashSet");
		System.out.println(prop);
		try {
			
			
			
			//prop.store(new FileOutputStream("test.properties"),"쓰고싶은거");
			
			//입력
			//load(inputStream is) : 입력 받을 때 씀
			//prop.load(new FileInputStream("test.properties"));
			//System.out.println(prop.get("Map));
			
			//XMl로 출력
			//파일의 확장자가 xml이다.
			//가독성이 좋다.
			prop.storeToXML(new FileOutputStream("test.xm1"),null);
			
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		 
	}

}
