import java.util.Scanner;
public class exercise{
	public static void main (String[] args){

		System.out.print("Inserisci una numero: ");
		int n = new Scanner(System.in).nextInt();
				
			for(int i= 1; i < n+1; i++)
			{
				if(n%i == 0)
				System.out.println(i);	
			}		
	}
}