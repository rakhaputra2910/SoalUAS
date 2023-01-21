import java.util.Scanner;
public class SoalUAS {
		public static void main(String[] args)
		{
			int rows = 4;
			for (int i = 1; i <= rows; i++) 
	                { 
	                        for (int j = rows; j > i; j--)
				{
					System.out.print("  ");
				}

				for (int k = 0; k <= i; k++)
				{
					System.out.print (k +" ");
	               
	               
				}
				System.out.println();
			}
		}
	
}
