package introduction;

public class Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,8,7,6,5,4,3,2,1};
		for(int i=0; i< arr.length; i++)
		{
			if (arr[i] %2 == 0)
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				System.out.println(arr[i] + " this not multiple of 2");
			}

	}
	}
}
