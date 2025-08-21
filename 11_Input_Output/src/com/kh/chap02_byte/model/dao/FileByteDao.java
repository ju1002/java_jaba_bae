package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO(Data Access Object)
//데이터가 보관되어있는 공간에 직접 접근해서
//입력/출력하는 메소드들을 만들어줌
public class FileByteDao {
	// 파일에 데이터를 출력(Byte Stream사용)
	public void outputToFile() {
		// Scanner sc = new Scanner(System.in); //이것도 외부로 출력하는 것이기 때문에 반납 해야함
		// sc.close();

		// 출력 :프로그램 내의 데이터를 밖으로 내보내는 것
		// FileOutputStream :"파일"로 데이터를 출력할 떄, 파일과 연결하는1Byte단위의 스트림
		// 1.FileOutputStream 객체생성
		// 파일과 연결하는 스트림을 생성하는 과정
		// constructure 기본생성자가 없다 때문에 만들어줘야 함]
		// 어떤 파일과 연결할건지 결정해야 함
		// handled 예외처리 해라
		FileOutputStream fos = null;
		try {
			// 생성자 호출 시 인자값으로 파일명을 전달하는데 파일명이 존재하는 않을경우
			// 해당 파일을 생성하면서 통로를 연결
			fos = new FileOutputStream("a_byte.txt", true);
			// 매개변수 생성자 호출시
			// 두번째 인자로 true값을 전달한다면 > 해당 파일 내용에 이어서 작성
			// 안쓰면 > 덮어쓰기
			// f5누르면 됨

			// 2. 연결 통로를 가지고 데이터를 출력: write() 호출
			fos.write(97);
			fos.write(98);
			fos.write(99);
			byte[] arr = { 101, 102, 103 };
			fos.write(arr);

			fos.write('A');
			fos.write('B');

			fos.write('배');
			fos.write('주');
			fos.write('영');

			// fos.close();
			// 이름은 안됨 1Byte범위만 되기 때문에
			// 한글은 2Byte기 때문에 깨짐
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// 약속!!! 스트림 사용이 끝났다면 반드시
			// 코드상에서 사용이 전부 종료되었다면 자원반납을 해주어야함
			// .close() 자원반납하는 방법
				return;
		}finally {
			//finally는 무조건 그 밑에 finally블럭 구문을 수행 return이 있으면 그밑에 구문이 수행이 
			//안되니까 finally를 만들어 우리의 약속인 .close()를 지켜준다.
			
		}
		try {
			if (fos != null) {
				fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // 꼭 지켜야 하기때문에 밖에 있어야 함
	}
	//프로그램 <<외부매체(파일)
	//입력 : 파일로 부터 데이터를 가지고 오겠다.
	//FileInputStream
	//파일로부터 데이터를 가져와서 입력 받을 건데, 1Byte단위로 입력받겠따.
	
	public void inputFromFile() {
		
		FileInputStream fis = null;
		//아까 같은 오류가 발생할 수 있기 때문에 밖에다 객체생성 한다.
		try {
			//객체 생성 >> 스트림 연결하기
			//스트림으로 입력받기
			//read()호출
			//1Byte단위로 읽어옴
			/*System.out.println((char)fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/
			//반복문을 사용 그러면 더이상 파일을 읽을 수 없을때 어떤값이 나오는지 알아야 함
			/*while(true) {
				
				int value = fis.read();
				
				if(value != -1) {
				System.out.println(value);}
				else {
					break;
				}
				
			}
			*/
			int value = 0;
			while((value = fis.read()) != -1){
				System.out.println((char)value);
				//메소드 호출시 반환 값이 있으면 값이라고 생각하자
			}
			
			
			
		fis =new FileInputStream ("a_byte.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
