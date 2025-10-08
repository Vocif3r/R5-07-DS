public class Q5
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		String s = "";
		for (int i = n; i >= 1; i--)
		{
			s = "";
			for (int j = 1; j <= i; j++)
			{
				s += " ";
				s += j;
			}
			System.out.println(s);
		}
	}
}
