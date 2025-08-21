package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		try {
		InetAddress localHost = InetAddress.getLocalHost();
		//locallost: 현재 프로그램을 동작시킨 장치를 의미
		//getLocalHost : 작업하고 있는 Host의 정보를 반환해주는 메소드
		System.out.println(localHost);
		System.out.println(localHost.getHostName());
		System.out.println(localHost.getHostAddress());
		
		
		
		//도메인네임을 통해서 서버컴퓨터와 관련돤 정보를 얻어 낼 수 있음
		//DomainName : 사용자가 서비스를 이용할 때 서버의 IP주소를 외우기 어려우니까
					//외우기 쉬운구조로 사용자에게 제공되는 이름
		//www.google.com > hosts파일 > DNS
		//google서버의IP주소를 가지고 웹서보로 HTTP요청
		InetAddress googleHost = InetAddress.getByName("www.google.com");
		//getByName() : 도메인네임을 이용해 서버의 정보를 반환
		System.out.print(googleHost);
		System.out.println(googleHost.getHostName());
		System.out.println(googleHost.getHostName());
		
		} catch(UnknownHostException e) {
			e.printStackTrace();		}
	}
//pc이름 / IP주소
		//서버는 분산구호이루어져있음
		//Client - Sever Mode1 		 
		/*현재 구동적인 서버가 존재한다면 클라이런트는 언제든 서버로요청을 보냏 수 있음
		 * 요청과 응답으로 프로그램이 동작함 
		 * 웹에서의 통신 방법: HTTP
		 * 순수 자바만을 사용해서 클라이언트와 서버의 간단한 통신 해보기
		 * 
		 * 
		 * 소켓(Socket):자원을 많이 소모함 통신하는 방법이 마치 전화와 같아 둘다 통신 장치를 갖고 있어야 하고 통산하는 계속 연결돼 있어야 함
		 * 
		 * Process(프로그램이 메모리에 적재된 상태)간의 통신을 담당
		 * 
		 * 스레드 : 실행하는 흐름의 단위를 말함.
		 * 
		 * 
		 */
		
		
		
		
}
