package helloworld;
import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		int n ; 
		Scanner input = new Scanner(System.in);
		System.out.println("Input n : ");
		n = input.nextInt();
		if (n > 0) 
		{
			if ( ktra(n) == 1 )
				System.out.println(n + " la so nguyen to");
				else
					System.out.println(n + " khong phai la so nguyen to ");
			
		}
	}
	private static int ktra(int n) {
		int dem = 0 ;
		for (int i = 1; i <= n ; i ++) 
		{
			if (n%i == 0)
				dem++ ; 
			
		}
		if (dem == 2) 
			return 1; 
		else
		return 0;
	}


}