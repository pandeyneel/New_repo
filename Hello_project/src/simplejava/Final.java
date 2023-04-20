package simplejava;

 class Final 
{
	 void no()
	 {
		 System.out.println("just to chek");
		 try {
			System.out.println("tryy block scc");
			int number=56/0;
			System.out.println(number);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exeption handled");
		}
		
		 System.out.println("last code");
	 }
	 public static void main(String[] args) {
		 Final ob=new  Final();
		 ob.no();
	}

}
