package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int output =0;
		int input = 131;
		int temp = input;
		for (int i = input; i > 0; i= i/10) {
			int reminder = input%10;
			output = (output*10)+reminder;
			input = input/10;
			
		}
if(temp==output)
	System.out.println("Number is Palindrome");
else
	System.out.println("Number is not Palindrome");
	}

}
