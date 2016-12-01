import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/*By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

        3
        7 4
        2 4 6
        8 5 9 3

        That is, 3 + 7 + 4 + 9 = 23.

        Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.*/
public class Problem67 {

    public static void main(String[] args){
        ArrayList<int[]> triangle = new ArrayList<>();
        try (Scanner fileIn = new Scanner(new File("C:\\Users\\moresimp\\IdeaProjects\\EulerProject\\src\\p067_triangle.txt"))) {
            while(fileIn.hasNext()){
                String oneLine = fileIn.nextLine();
                String[] numberArray = oneLine.split(" ");
                int[] numbers = new int[numberArray.length];
                for(int index = 0; index < numberArray.length; index++){
                    numbers[index] = Integer.parseInt(numberArray[index]);
                }
                triangle.add(numbers);
            }
        } catch (Exception e){
            System.out.print(e.getMessage());
        }

        for(int rowIndex = triangle.size()-2; rowIndex >=0; rowIndex--){
            int[] actualLine = triangle.get(rowIndex);
            int[] previousLine = triangle.get(rowIndex+1);
            for(int position = 0; position < actualLine.length; position++){
                actualLine[position] += previousLine[position] > previousLine[position+1] ? previousLine[position] : previousLine[position+1];
            }
        }

        System.out.print(triangle.get(0)[0]);



    }


}
