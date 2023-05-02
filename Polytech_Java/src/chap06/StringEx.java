package chap06;

public class StringEx {
	
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a.length());
		
		System.out.println(a.contains("#"));			//���ڸ� �����ϴ��� true, false�� ���
		
		System.out.println(a.concat(b));				//���ڿ� ����
		
		System.out.println(a.trim());					//���ڿ� ���� ��������
		
		System.out.println();
		
		
		String c = a.concat(b);
		System.out.println(c);
		
		System.out.println(c.replace("C#", "JAVA"));	// C# ���ڿ��� JAVA�� ����
		
		
		String s[] = c.split(",");						// , �� �����ڷ� ����
		
		for (String string : s) {
			System.out.println(string);
		}
		
		String sub = c.substring(4);					//4�� �ε������� ���ڿ� ����
		System.out.println(sub);
		
		System.out.println(c.charAt(3));				//3�� �ε����� ���� ���
		
	}
}
