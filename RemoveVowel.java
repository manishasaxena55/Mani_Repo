import java.util.Scanner;
import java.util.Arrays;
public class RemoveVowel{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	String result = "";
	for(int i=0;i<input.length();i++){
		if(!isVowelNew(input.charAt(i))){
			result = result + input.charAt(i);	
		}
	}
	System.out.println(result);

	}	
	public static boolean isVowel(char input){
		if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u'){
			return true;
		}		
		return false;	
	}
	public static boolean isVowelNew(char input){
		System.out.println("start");
		Character[] vowelArr = {'a','e','i','o','u'};
		if(Arrays.asList(vowelArr).contains(input)){
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;

	}
}
