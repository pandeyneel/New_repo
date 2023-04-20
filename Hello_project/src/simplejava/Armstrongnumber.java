package simplejava;

import java.util.Scanner;

public class Armstrongnumber 
{
	
	public void getdata(int a)
	{
		int sum=0;
		int temp=a;
		
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			sum=(sum+a*a*a);
			
		}
		System.out.println(sum);
		
	
		
	}
	public static void main(String[] args) 
	{
		Armstrongnumber ob=new Armstrongnumber();
		System.out.println("pls");
		Scanner sc=new Scanner(System.in);
		ob.getdata(sc.nextInt());
		
	}

}
