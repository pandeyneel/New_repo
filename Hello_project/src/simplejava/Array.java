package simplejava;

import java.util.ArrayList;

public class Array 
{
	public void  arraylists()
	{
		ArrayList<String> ob=new  ArrayList<>();
		ob.add("nilesh");
		ob.add("nikhhil");
		ob.add("shivam");
		//ob.add(123, null);
		System.out.println(ob.get(0));
		
		
	}
	public static void main(String[] args) 
	{
		Array og=new Array();
		og.arraylists();
		
	}

}
