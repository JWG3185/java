package study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class pselect {

   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   //{"�迩��","������","���ؼ�","���ʺ�","�ڱԸ�","�ڹα�",
   //    "�ڽ���","���ֿ�","������","�ɼҿ�","������","������","�̼���",
   //    "������","������","������","����ȣ","���º�","������","���Ƹ�","������"}
   
   // ��ǥ�� ��� �̱�
   // ��ü �ο�, ���߿� ��� ������ �ٲٱ�
   String P[] ={"�迩��","������","���ؼ�","���ʺ�","�ڱԸ�","�ڹα�",
		       "�ڽ���","���ֿ�","������","�ɼҿ�","������","������","�̼���",
		       "������","������","������","����ȣ","���º�","������","���Ƹ�","������"};

   List<String> list = new ArrayList<>(Arrays.asList(P));     	// remove�� ����ϱ� ���� ����Ʈ�� ��ȯ
   //List<String> list = Arrays.asList(P);                  
   //Arrays.asList(P) �޼���� ������ ����Ʈ�� ���� ũ�⸦ ���� �迭�� ����
   //new ArrayList<>(Arrays.asList(P))  ���
   
   List<String> selected = new ArrayList<>();                 	// ���õ� ��ǥ�ڸ� ������� �� ����Ʈ
   
   
   System.out.println("��ǥ�� ���� �Է��ϼ���>> ");               
   
   int num = sc.nextInt();
   for (int i = 0; i < num; i++) {
       int idx = (int) (Math.random() * list.size());   		// ����Ʈ ũ�⿡ �´� ���� �ε��� ����
       String name = list.get(idx);                				// ���� �ε����� ����Ʈ���� �ش� ��ǥ�� �̸� ��������
       list.remove(idx);                        				// ����Ʈ���� ��ǥ�� ����
       selected.add(name);                         				// ���õ� ��ǥ�� ����Ʈ�� �̸� �߰�
   }
   
   System.out.println(selected);                  				// ���õ� ��ǥ�� ���
   System.out.println();
   System.out.println();
   
   P = list.toArray(new String[0]);                  			// ���α׷� ���� �� �ٽ� ��밡�� �� �� �ֵ��� 
                                             					// �����ϱ� ���� �迭 �������� ���
   System.out.println("���� �����");
   System.out.println(Arrays.toString(P));
   
   String remain = Arrays.toString(P).replaceAll("^\\[", "{\"").replaceAll("\\]$", "\"}").replaceAll(", ", "\", \"");
   
   //  "^\\[" ��� ����ǥ���� ������ ����ؼ� ���ڿ��� ó���� �ִ� "[" ���ڿ��� "{"�� ����
   // "^" : ���ڿ��� ������ �ǹ�
   // "\\[" : [ ���ڿ��� �ǹ��մϴ�. 
   // "[" �� ����ǥ���Ŀ��� Ư�������̹Ƿ�, \\�� ���
   // "$" : ���ڿ��� ���� �ǹ�
   System.out.println(remain);
   
   sc.close();
   
   }
   }
   
