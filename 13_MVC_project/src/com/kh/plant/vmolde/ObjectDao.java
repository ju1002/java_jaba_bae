package com.kh.plant.vmolde;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.plant.vmolde.vo.Plant;

public class ObjectDao {
	public void outputFile() {
		Plant plant = new Plant("홍콩야자", "괸엽");
		/*기반 스트림 = FileOutputStream
		 * 보조스트림 = ObjextOutputStream
		 * 출력 = writrObject()
		 */
		
	}

	
	
	
	
	
	public void inputFile() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))){
			ois.readObject();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
