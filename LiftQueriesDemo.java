package Try;

import java.util.Scanner;

public class LiftQueriesDemo {
	public static void main(String [] args) 
	{
		int a=1,b=7,n,call;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of test case");
		n=sc.nextInt();
		while(n!=0) {
			System.out.println("Enter the test case");
			call=sc.nextInt();
			if(Math.abs(call-a)<=Math.abs(call-b))
			{
				System.out.println("A");
				a=call;
			}
			else {
				System.out.println("B");
				b=call;
			}
			n--;
		}
	}

}
