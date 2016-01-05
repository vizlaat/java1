package palindromString;
//Az alábbi program a betuk String-ből
// kiírja a palindrom részleteket.

public class palindromString {

	public static void main(String[] args) {
		String betuk = "aladar";
		int length = (int) (betuk.length());
		
		for (int i=0; i<length; i++){
			for (int j= i+1; j<=length; j++){
				String test = betuk.substring(i, j);
				if(isPalindrom(test)) System.out.print(test+" ");
			}
		}

	}
	
	public static boolean isPalindrom(String betuk){
		int length = betuk.length();
		char[] jegyek = betuk.toCharArray();
		for (int i=0; i<length/2;i++){
			if(!(jegyek[i]==jegyek[length-1-i])) return false;				
		}			
		return true;
		
	}

}
