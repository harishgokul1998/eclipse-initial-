package introduction;

public class str_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is a object we can define string in two ways - string literal, by new keyword
	/* String neww = "harish";
	 String ss = new String ("hello");
	 String dd = "hello  fine  tata";
	 String[] stt1 = dd.split(" fine ");
	 System.out.println(stt1[0]);
	 System.out.println(stt1[1]);
	 System.out.println(stt1[1].trim());
	 
	 for(int i=neww.length()-1; i>=0; i--)
	 {
		 System.out.println(neww.charAt(i));
	 }
	*/
    		
	String sdf	= "naveen";
	String ff = new String("hi");
	String dd = " hi hello  bye";
	String[] ade = dd.split("hello");
	System.out.println(ade[0]);
	System.out.println(ade[1]);
	System.out.println(ade[1].trim());
	
	for(int i=dd.length()-1; i >= 0; i--)
	{
		System.out.println(dd.charAt(i));
	}
	
	}

}
