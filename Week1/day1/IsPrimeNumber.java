package Week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=44, count=0;
		if(n<2)
		{
			System.out.println("The given number is " + n + " is not Prime");
			System.exit(0);
			
			
		}
		for (int i = 1; i <=n; i++) {
		if (n%i==0) 
			count +=1;
			
		}	
		if(count>2)
		{
			System.out.println("The given number is "+ n +" is not prime");
		}
		else
		{
			System.out.println("The given number is "+ n +" is  prime");	
		}

	}

}
