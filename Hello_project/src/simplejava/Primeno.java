package simplejava;

import java.util.Scanner;

public class Primeno 
{
	public void getno(int no)
	{
		if((no+1)%2==0)
		{
			System.out.println("prime no");
		}
		else {
			System.out.println("not primeno");
		}
		
	}
	public static void main(String[] args) {
		Primeno ob=new Primeno();
		System.out.println("pleae");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		ob.getno(no);
	}

}
