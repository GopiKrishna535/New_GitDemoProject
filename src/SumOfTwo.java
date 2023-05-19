
public class SumOfTwo 
{
	public  int sum(int n1,int n2)
	{
		int sum=n1+n2;
		return sum;
	}

	public static void main(String[] args) 
	{
		SumOfTwo sot=new SumOfTwo();
		int add=sot.sum(2,3);
		
		System.out.println("Sum of Two numbers="+add);
	}	

}
