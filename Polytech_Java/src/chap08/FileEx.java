package chap08;

import java.io.File;

public class FileEx {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\javaex\\file.txt");
		
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		System.out.println(f.length());
		
		f = new File("C:\\\\javaex");
		
		if(f.isDirectory()) {
			System.out.println("디렉토리가 맞습니다.");
		}
		
		File[] subfiles = f.listFiles();
		
		for (File file : subfiles) {
			System.out.printf("%-10s",file.getName());
			System.out.println(file.length() + "byte");
		}
		
	}
}
