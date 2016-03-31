package palindromString;
//This program find all the palindrom sections in a given string.
//Az alábbi program a betuk String-ből
// kiírja a palindrom részleteket.

public class palindromString {

	public static void main(String[] args) {
		String letters = "aladar";
		int length = (int) (letters.length());
		
		for (int i=0; i<length; i++){
			for (int j= i+1; j<=length; j++){
				String test = letters.substring(i, j);
				if(isPalindrom(test)) System.out.print(test+" ");
			}
		}

	}
	
	public static boolean isPalindrom(String letters){
		int length = letters.length();
		char[] characters = letters.toCharArray();
		for (int i=0; i<length/2;i++){
			if(!(characters[i]==characters[length-1-i])) return false;				
		}			
		return true;
		
	}

}
