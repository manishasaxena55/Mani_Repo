import java.util.Scanner; 
public class SubtractProductSum{
	public static void main(String[] args){
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println("hi");

		result = productOfDigits(n) - sumOfDigits(n);
		System.out.println("Your result is: "+result);
		
	}
	public static int sumOfDigits(int n){
		int sum = 0;
		while(n>0){
//			System.out.println("inside sum");
			int digit = n%10;
			n = n/10;
			sum = sum+digit;
		}
		return sum;
	}
	public static int productOfDigits(int n){
		int product = 1;
		while(n>0){
//			System.out.println("inside product");
			int digit = n%10;
			n = n/10;
			product = product*digit;
		}
		return product;
	}
	
}
