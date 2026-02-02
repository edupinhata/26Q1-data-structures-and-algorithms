import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int submissions;
        scanner.nextLine(); // Consume the newline character

        for (int i=0; i<testCases; i++) {
            submissions = findMaxSubmissions(scanner.nextInt());
            System.out.println(submissions);
            scanner.nextLine(); // Consume the newline character
        }
    }

    public static int findMaxSubmissions(int testDurationInMinutes) {
        int secondsPerTry = 30;
        int durationInSeconds = testDurationInMinutes * 60;

        return durationInSeconds / secondsPerTry;
    }

}