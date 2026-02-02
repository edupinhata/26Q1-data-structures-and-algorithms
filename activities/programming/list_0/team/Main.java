import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numProblems = Integer.parseInt(scanner.nextLine());

        int willMakeSolution = 0;
        for (int i=0; i< numProblems; i++){
            String problemInput = scanner.nextLine();
            if ( inputHasAtLeastOnes(problemInput, 2) ){
                willMakeSolution++;
            }
        }

        System.out.println(willMakeSolution);
    }

    public static boolean inputHasAtLeastOnes(String input, int minNumOfOnes){
        String[] parts = input.split(" ");
        int count = 0;
        for (String part : parts) {
            if (part.equals("1")) {
                count++;
            }
        }
        return count >= minNumOfOnes;
    }
}