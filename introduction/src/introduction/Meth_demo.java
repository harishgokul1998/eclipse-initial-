package introduction;

public class Meth_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meth_demo har = new Meth_demo();
		String name = har.getdata();
		System.out.println(name);
		
		meth2 hh = new meth2();
		hh.getuserdata();
		getdata2();
		

	}
	
	public String getdata()
	{
		System.out.println("hello");
		return "harish";
	}
	
	public static String getdata2()
	{
		System.out.println("hlo");
		return "harish";
	}

}
