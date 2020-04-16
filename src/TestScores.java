import java.util.Arrays;
import java.util.Scanner;

/*
Pseudocode:
import scanner
import Arrays

declare class
declare method
declare vars for scanner input, score, highest, lowest, average, total, allscores
begin for loop
prompt user to enter score
initialize vars based on input
end loop
calculate total, average
print highest, lowest, average, allscores
 */
public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score, highest, lowest, total;
        float average;
        int [] allScores = new int [10];

        System.out.println("Enter a score (1/10): ");
        score = input.nextInt();
        allScores[0] = score;
        total = score;
        highest = score;
        lowest = score;
//        average = score;

        for (int i = 1; i < 10; i++) {
            System.out.printf("Enter a score (%s/10): \n", i + 1);
            score = input.nextInt();
            allScores[i] = score;
            total += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        average = (float)total/10;

        System.out.printf("The highest score is %d.\n" +
                "The lowest score is %d.\n" +
                "The average score is %.2f.\n" , highest, lowest, average);
        System.out.println("All the scores are " + Arrays.toString(allScores) + ".");
    }
}
