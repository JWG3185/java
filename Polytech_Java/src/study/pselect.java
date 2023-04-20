package study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class pselect {

   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   //{"김여원","김정현","김준성","김초봄","박규리","박민규",
   //    "박슬기","박주연","박지원","심소영","오연경","윤진수","이성진",
   //    "이유진","이태형","전병남","정성호","정승복","정웅기","조아름","최지현"}
   
   // 발표할 사람 뽑기
   // 전체 인원, 나중에 출력 값으로 바꾸기
   String P[] ={"김여원","김정현","김준성","김초봄","박규리","박민규",
		       "박슬기","박주연","박지원","심소영","오연경","윤진수","이성진",
		       "이유진","이태형","전병남","정성호","정승복","정웅기","조아름","최지현"};

   List<String> list = new ArrayList<>(Arrays.asList(P));     	// remove를 사용하기 위해 리스트로 변환
   //List<String> list = Arrays.asList(P);                  
   //Arrays.asList(P) 메서드로 생성된 리스트는 고정 크기를 가진 배열을 래핑
   //new ArrayList<>(Arrays.asList(P))  사용
   
   List<String> selected = new ArrayList<>();                 	// 선택된 발표자를 담기위한 빈 리스트
   
   
   System.out.println("발표자 수를 입력하세요>> ");               
   
   int num = sc.nextInt();
   for (int i = 0; i < num; i++) {
       int idx = (int) (Math.random() * list.size());   		// 리스트 크기에 맞는 랜덤 인덱스 선택
       String name = list.get(idx);                				// 랜덤 인덱스로 리스트에서 해당 발표자 이름 가져오기
       list.remove(idx);                        				// 리스트에서 발표자 제거
       selected.add(name);                         				// 선택된 발표자 리스트에 이름 추가
   }
   
   System.out.println(selected);                  				// 선택된 발표자 출력
   System.out.println();
   System.out.println();
   
   P = list.toArray(new String[0]);                  			// 프로그램 종료 후 다시 사용가능 할 수 있도록 
                                             					// 복붙하기 좋게 배열 형식으로 출력
   System.out.println("남은 사람들");
   System.out.println(Arrays.toString(P));
   
   String remain = Arrays.toString(P).replaceAll("^\\[", "{\"").replaceAll("\\]$", "\"}").replaceAll(", ", "\", \"");
   
   //  "^\\[" 라는 정규표현식 패턴을 사용해서 문자열의 처음에 있는 "[" 문자열을 "{"로 변경
   // "^" : 문자열의 시작을 의미
   // "\\[" : [ 문자열을 의미합니다. 
   // "[" 는 정규표현식에서 특수문자이므로, \\를 사용
   // "$" : 문자열의 끝을 의미
   System.out.println(remain);
   
   sc.close();
   
   }
   }
   
