package arrayToString;
//This program converts an array into a string in a spiral order. 
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
		
		String result = "";
		String section = ""; 
		int[][] work = input;
		while(work.length>0){
			section = copy(work);
			result = result + section;
			if(work.length>1 && work[0].length>1){
				work = deleting(work);
			}else {
				break;
				}
		}
		System.out.println(result);
		

	}
	public static int[][] deleting(int[][] table){
		int height = tabla.length;
		int length = tabla[0].length;
		int[][] answer = new int[height-2][length-2];
		for(int i=0; i<heihjt-2; i++){
			for(int j=0; j<length-2;j++){
				answer[i][j] = table[i+1][j+1];
			}
		}
		
		return answer;
	}
	public static String copy(int[][] table){
		int height = tabla.length;
		int length = tabla[0].length;
		String answer= "";
		//first row
		for(int i =0; i<length;i++){
			answer = answer + " " + table[0][i];
		}
		//last column
		for(int i = 1; i<height; i++){
			answer = answer + " " + table[i][length-1];
		}
		//last row
		for(int i=1; i<length;i++){
			answer = answer + " " + table[height-1][length-1-i];
		}
		//first column
		for(int i= 1; i<height-1;i++){
			answer = answer + " " + table[height-1-i][0];
		}
		return answer;
		
	}

}
