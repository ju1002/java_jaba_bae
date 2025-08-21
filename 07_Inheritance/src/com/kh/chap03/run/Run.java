package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElecturnicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		Book book = new Book("그많던 싱아는 누가 다 먹었을 까","뭉친 지식 하우스",
				"싱아형",12000);
		 ElecturnicBook eb = new ElecturnicBook("노화 마인드 셋","맛있는사과"
				,"제임스",8000,"네이버");
		 PaperBook pb = new PaperBook("혼모노","최원재","인디고",16200,0);
	
	System.out.println(book.info());
	System.out.println(eb.info());
	System.out.println(pb.info());
	System.out.println(book);
	System.out.println(book.toString());
	System.out.println(eb);
	System.out.println(pb);
	LastTime lt = new LastTime();
	System.out.println(lt);
	//toString(): 해당 객체의 풀클래스 명 + "@" + 해당 객체
	}

}
