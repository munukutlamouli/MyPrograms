
public class OddPalindrome {

	public static void main(String[] args) {
		int number = 1521;
		int rev;
		if(checkAllDigitsOdd(number)){
			rev = reverse(number);
			if(checkPalindrome(number,rev))
				System.out.println("number is odd palindrome");
			else
				System.out.println("number is not odd palindrome");
		}
		else
			System.out.println("number is not odd palindrome");

	}

	public static boolean checkAllDigitsOdd(int number){
		int digit;
		int count = 0;
		while(number > 0){
			digit = number % 10;
			if(digit % 2 == 0)
				count++;
			number = number / 10;
				
		}
		if(count == 0)
			return true;
		else 
			return false;
	
		
	}
	public static int reverse(int number){
		int digit;
		int reverse = 0;
		while(number > 0){
			digit = number % 10;
			reverse = 10 * reverse + digit;
			number = number / 10;
		}
		return reverse;
		
	}
	public static boolean checkPalindrome(int number, int reverse){
		if(number == reverse )
			return true;
		else
			return false;
		
		
	}
}

