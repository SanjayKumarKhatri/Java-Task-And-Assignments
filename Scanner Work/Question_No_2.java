import java.util.*;
class Question_No_2 {

		public static void main(String[] args) {
			
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = ob.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: "+factorial);
	}
	static int fact(int n)
	{
		int output;
		if(n==1){
			return 1;
		}
		output = fact(n-1)* n;
		return output;
	}
}

