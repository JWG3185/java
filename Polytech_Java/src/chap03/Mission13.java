package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission13 {

	public static void main(String[] args) {
		// H ±×¸®±â
		int H[][] = 
			{
					{1, 0, 0, 0, 1},
					{1, 0, 0, 0, 1},
					{1, 1, 1, 1, 1},
					{1, 0, 0, 0, 1},
					{1, 0, 0, 0, 1}
			};
		
		for(int i = 0; i < H.length; i++)
		{
			for(int j = 0; j < H[i].length; j++)
			{
				if (H[i][j] == 1)
				{
					System.out.print("¡á");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
}
