package Main;

import java.io.File;

public class Temp {
	//	D:\
	public static void main(String[] args) {
		File f = new File("D:\\工数上机实验报告");
		File[] fil = f.listFiles();
		File newf = new File("D\\");
		for(File fi : fil) {
			System.out.println(fi.getName());
		}
	}
	
	public static void copyFileFolder(File src, File dest) {
		if(src.isDirectory()) {
			File[] srcArray = src.listFiles();
			
			for(File fi : srcArray) {
				System.out.println(fi.getName());
			}
		}
	}
	
}
