package Exercises12_10;

import java.util.ArrayList;
import java.util.List;

public class OutOf {
	 static class OOMObject{
	 }
	 public static void main(String[] args) {
		 List<OOMObject> list = new ArrayList<OOMObject>();
		 while(true){
			 try {
				 list.add(new OOMObject());
			 }catch (OutOfMemoryError o) {
				 System.out.println("ƒ⁄¥Ê∑÷≈‰ ß∞‹");
			 }
		 }
	 }
}
