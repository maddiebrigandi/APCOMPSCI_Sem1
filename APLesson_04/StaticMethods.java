public class StaticMethods
{
	public static void main(String[]args)
	{
		int sum = add(5, 5);
		print(sum);
	}
	
	public static int add(int one, int two)
	{
		return one + two;
	}
	
	public static void print(int s)
	{
		System.out.println("The sum of your number is " + s);
	}
}