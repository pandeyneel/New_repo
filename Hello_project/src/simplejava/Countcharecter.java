package simplejava;

import java.util.Scanner;

public class Countcharecter 
{
	public  void getno(String name)
	{
		int count=0;
		char temp;
		char[]a=name.toCharArray();
		for(int i=0;i<=name.length()-1;i++)
		{
			for(int j=i+1;j<=name.length()-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
				
			}
			temp=a[i];
			System.out.println("charecter "+a[i]+" is present"+count+"times in "+name);
		}
	}
	public static void main(String[] args) {
		
		Countcharecter ob=new  Countcharecter();
		System.out.println("please enter the input");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		ob.getno(name);
	}

}
