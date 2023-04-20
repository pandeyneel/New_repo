package simplejava;

import java.util.Scanner;

public class Ifthechar 
{
	public void getsum(String name)
	{
		int temp;int sum=0;
		char[]c=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--)
		{
			if(Character.isDigit(c[i]))
			{  c[i]++;
				System.out.println(c[i]);
			}
			else {
				System.out.println("unable to perform");
			}
			
			//System.out.println(sum);
		}
		
		
	}
	public static void main(String[] args) {
		Ifthechar ob=new Ifthechar();
		System.out.println("please enter the input");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		ob.getsum(name); 
	}

}
