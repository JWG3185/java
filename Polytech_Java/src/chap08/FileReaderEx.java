package chap08;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {

//	1. ���ܻ�Ȳó��
//	public static void main(String[] args) throws IOException {
//		
//		FileReader fin =  new FileReader("C:\\javaex//ex.txt");
//		
//		int c;
//		
//		while((c=fin.read())!=-1) {
//			System.out.print((char)c);
//		}
//		
//		fin.close();
//	}
	
//	2. �ѱ� ����
//	public static void main(String[] args) {
//		FileReader fin;
//		
//		try {
//			fin = new FileReader("C:\\javaex\\ex.txt");
//			
//			int c;
//			
//			while((c=fin.read())!=-1) {
//				System.out.print((char)c);
//			}
//			
//			fin.close();
//			
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
//	3. �ѱ۱��� �ذ�	
	public static void main(String[] args) {
		FileInputStream in;
		
		try {
			in = new FileInputStream("C:\\javaex\\ex.txt");
			InputStreamReader is = new InputStreamReader(in, "UTF-8");
			int c;
			
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			is.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
