package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		
		for(int i=2; i<n-1;i++)
		if(n%2==0)
		{
			System.out.println("Prime number");
			break;
		}
else
{
	System.out.println("Not Prime number");
	break;
}
	}

}
