package introduction;

public class Core_java_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int mynum = 5;
		System.out.println("The number is "+mynum);
		String name = "harish";
		System.out.println("The name is "+ name);
		char initial = 'S';
		System.out.println("The name is "+ initial);
		boolean ini = true;
		System.out.println("The name is " + ini);
		*/
		
		//Array
		
	/*	int[] arr1 = new int[3];
		arr1[0] = 11;
		arr1[1] =22;
		arr1[2] = 33;
		//System.out.println(arr1[1]);
		for(int i=0; i< arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		
		String[] nn = {"haish", "sanjai", "senthil"};
		for(int i=0; i< nn.length; i++)
		{
			System.out.println(nn[i]);
		}
		
      */
		
		//enhanced for loop
		/*String[] name = {"haish", "sanjai", "senthil"};
		
		for( String sam :name)
		{
			System.out.println(sam);
		}
		*/
		
	   //Array	
		int[] arr5 = new int[5];
		arr5[0] = 22;
		arr5[1] = 33;
		arr5[2] = 44;
		arr5[3] = 55;   // array length - 5, i=0
		arr5[4] = 66;
		
		for( int i=0; i< arr5.length; i++)
		{
			if(arr5[i] % 2 == 0)
			{
				System.out.println("The number divided by 2 is "+ arr5[i]);
			}
			else
			{
				System.out.println("The number is not divided by 2 is "+ arr5[i]);
			}
		}
		
		
		//result 
		
	
		
		
		
		
		
		

	}

}
