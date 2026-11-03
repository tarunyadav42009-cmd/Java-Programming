import java.util.Scanner;

public class typecasting extends teacher {
    
    public void wpm() {
        Scanner A = new Scanner(System.in);
        sub();
        pub();
        Scanner scanner = new Scanner(System.in);

        String prompt = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Type this exact sentence as fast as you can:\n");
        System.out.println("\"" + prompt + "\"");
        System.out.println("\nPress ENTER when you are ready to start...");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("START TYPING NOW:");
        String userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis();

        double timeTakenInSeconds = (endTime - startTime) / 1000.0;

        int totalCharacters = userInput.length();

        // Standard WPM formula: (Characters / 5) / Minutes
        double minutes = timeTakenInSeconds / 60.0;
        int wpm = (int) ((totalCharacters / 5.0) / minutes);

        System.out.println("\n--- RESULTS ---");
        System.out.println("Time taken: " + String.format("%.2f", timeTakenInSeconds) + " seconds");
        System.out.println("Your Speed: " + wpm + " WPM (Words Per Minute)");

        System.out.print("Performance: ");
        if (wpm < 30) {
            System.out.println("Slow. Keep practicing to build muscle memory!");
        } else if (wpm >= 30 && wpm <= 50) {
            System.out.println("Average. This is the standard typing speed.");
        } else if (wpm > 50 && wpm <= 80) {
            System.out.println("Fast! You are a fluent typist.");
        } else {
            System.out.println("Pro! Your speed is exceptional.");
        }

        scanner.close();
        System.out.println("\n--- Displaying Stored Data ---");
        System.out.println("Name: " + nm);
        System.out.println("Code: " + roll);
        System.out.println("Subject: " + book);
        System.out.println("Publication: " + nr);
        System.out.println("Speed: " + wpm);

        A.close();
    }

    public static void main(String[] args) {

        typecasting e1 = new typecasting();
        e1.wpm();

    }
}
