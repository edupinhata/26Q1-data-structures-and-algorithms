import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] problemInput = scanner.nextLine().split(" ");
        int participants = Integer.parseInt(problemInput[0]);
        int kWinners = Integer.parseInt(problemInput[1]);

        int[] scores = stringToIntArray(scanner.nextLine());

        int winners = kWinners;

        if ( scores[winners-1] > 0 ){
            while (winners < participants && scores[winners-1] == scores[winners]){
                winners++;
            }
        } else {
            while (winners>0 && scores[winners-1] <= 0){
                winners--;
            }
        }

        System.out.println(winners);
    }

    public static int[] stringToIntArray(String spacedStringList){
        String[] stringList = spacedStringList.split(" ");
        int[] intList = Arrays.stream(stringList).mapToInt(score -> Integer.parseInt(score)).toArray();
        return intList;
    }

}