package failedtests;

import java.util.Scanner;

public class Palindrom 
{
	public void pali(int n)
	{
		int last; int  temp ; int sum=0;
		temp=n;
		while(n>0)
		{
			last=n%10;
			sum=(sum*10)+last;
			temp=n/10;
			
		}
		System.out.println(sum);
		if(sum==n) {
		System.out.println("palindrom");}
		else {
			System.out.println("not palindrom");
		}
	}
	public static void main(String[] args) {
		Palindrom ob=new Palindrom();
		System.out.println("pls enter");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ob
		.pali(n);
	}

}
