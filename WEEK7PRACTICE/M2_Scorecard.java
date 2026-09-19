import java.util.Scanner;

class Scorecard {

    private boolean[] results;
    private int answersRecorded;

    public Scorecard(int questionCount) {
        results = new boolean[questionCount];
        answersRecorded = 0;
    }

    public void recordAnswer(boolean correct) {

        if (answersRecorded < results.length) {
            results[answersRecorded] = correct;
            answersRecorded++;
        } else {
            System.out.println("Answer rejected: question limit reached.");
        }
    }

    public int getScore() {

        int score = 0;

        for (int i = 0; i < answersRecorded; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class M2_Scorecard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of questions: ");
        int questionCount = sc.nextInt();

        Scorecard scorecard = new Scorecard(questionCount);

        for (int i = 0; i < questionCount; i++) {

            System.out.print("Was answer " + (i + 1) + " correct? (true/false): ");
            boolean correct = sc.nextBoolean();

            scorecard.recordAnswer(correct);
        }

        System.out.println("Final Score: " + scorecard.getScore());

        sc.close();
    }
}