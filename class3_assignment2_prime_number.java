package Class3_assignments;

public class class3_assignment2_prime_number {
	
	int num;
	
	public class3_assignment2_prime_number()
	{
		num = 0;
	}
	
	public class3_assignment2_prime_number(int a)
	{
		num = a;
	}
	
	public boolean check_prime()
	{
		int factor;
		for(factor = 2; factor <= (num-1);factor++)
		{
			if(num % factor == 0)
				break;
		}
		if(num == factor)    // 'num' should have only two factors i.e. 1 and itself, if it is a prime number.
			return true;
		return false;
	}

}
