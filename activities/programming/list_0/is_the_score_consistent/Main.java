import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int testCases = scanner.nextInt();
       scanner.nextLine(); // Consume the newline character
       for (int i=0; i< testCases; i++) {
          String[] currentScore = scanner.nextLine().split(" ");
          String[] desiredScore = scanner.nextLine().split(" ");

          int A = Integer.parseInt(currentScore[0]);
          int B = Integer.parseInt(currentScore[1]);
          int C = Integer.parseInt(desiredScore[0]);
          int D = Integer.parseInt(desiredScore[1]);

          if (A <= C && B <= D) {
              System.out.println("POSSIBLE");
          } else {
              System.out.println("IMPOSSIBLE");
          }
       }
   } 
}
