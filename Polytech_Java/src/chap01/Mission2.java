package chap01;

//정수형의 2개의 input parameter를 입력 받은 후
//더 큰 수 를 return 하는 max메소드를 작성하라
public class Mission2 {
	
	public static int max(int x, int y) {
		if (x>y)
			return x;
		else 
			return y;
	}
	
	public static void main(String[] args) {
	int x = 10;
	int y = 20;
	System.out.println("더 큰 수는 : " + max(x,y));			
	}
}
