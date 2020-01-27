

public class IPAddressFormat{
public static void main(String[] args){
	String adress = "1.1.1.1";
	StringBuilder result = new StringBuilder();
	for (int i=0;i<adress.length();i++){
		if(adress.charAt(i)=='.'){
			result.append("[.]");
		}	
		else{
			result.append(adress.charAt(i));
		}
	}
	System.out.println(result);
	}
}
