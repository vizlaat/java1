package arrayToString;
//This program conerts an array into a string in a spiral order. 
// Az alábbi program az input téglalap alakú tömb
// elemeit csigavonalban sorbarendezve egy String-be (eredmény) írja át.
public class arrayToString {

	public static void main(String[] args) {
		int[][] input = new int[][]{
			{1,2,3},
			{5,6,7},
			{9,10,11},
			{12,13,14},
		};
		
		String eredmeny = "";
		String szakasz;
		int[][] munka = input;
		while(munka.length>0){
			szakasz = kimasolas(munka);
			eredmeny = eredmeny + szakasz;
			if(munka.length>1 && munka[0].length>1){
				munka = torles(munka);
			}else {
				break;
				}
		}
		System.out.println(eredmeny);
		

	}
	public static int[][] torles(int[][] tabla){
		int magassag = tabla.length;
		int hossz = tabla[0].length;
		int[][] valasz = new int[magassag-2][hossz-2];
		for(int i=0; i<magassag-2; i++){
			for(int j=0; j<hossz-2;j++){
				valasz[i][j] = tabla[i+1][j+1];
			}
		}
		
		return valasz;
	}
	public static String kimasolas(int[][] tabla){
		int magassag = tabla.length;
		int hossz = tabla[0].length;
		String valasz= "";
		//elso sor
		for(int i =0; i<hossz;i++){
			valasz = valasz + " " + tabla[0][i];
		}
		//utolso oszlop
		for(int i = 1; i<magassag; i++){
			valasz = valasz + " " + tabla[i][hossz-1];
		}
		//also sor
		for(int i=1; i<hossz;i++){
			valasz = valasz + " " + tabla[magassag-1][hossz-1-i];
		}
		//elso oszlop
		for(int i= 1; i<magassag-1;i++){
			valasz = valasz + " " + tabla[magassag-1-i][0];
		}
		return valasz;
		
	}

}
