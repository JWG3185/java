package study;

import java.util.Random;
import java.util.Scanner;

public class Java3_mission2 {

	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        
        boolean state = true;
        
        while(state) 
        {
        	int ran = r.nextInt(100);
        	int count = 0;
        	int max = 99;
        	int min = 0;
        	System.out.println("수를 결정하였습니다. 맞추어보세요\n0-99");
	        
        	while(true)
	        {	
	        	count++;
	        	System.out.print(count + ">>");
	        	int num = scan.nextInt();
	        	
	        	if(num < ran)
	        	{	
	        		System.out.println("더 높게");
	        		System.out.println(num + "-" + max);
	        		min = num;
	        		continue;
	        	}
	        	else if(num > ran)
	        	{	
	        		System.out.println("더 낮게");
	        		System.out.println(min + "-" + num);
	        		max = num;
	        		continue;
	        	}
	        	else
	        	{
	        		System.out.print("맞았습니다.\n다시하시겠습니까(y/n)>>");
	        		String answer = scan.next();
	        		if (answer.equals("y"))
	        		{
	        			break;
	        		}
	        		else
	        		{
	        			state = false;
	        			break;
	        		}
	        	}
    
	        }
        }
}
}