import java.util.Arrays;
import java.util.Random;

public class Homework11 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayTeam1 = new int[25];
        for (int index = 0; index < arrayTeam1.length; index++) {
            arrayTeam1[index] = random.nextInt(23) + 18;
        }
        System.out.println("The age of the 1st team players: " + Arrays.toString(arrayTeam1));

        int[] arrayTeam2 = new int[25];
        for (int index = 0; index < arrayTeam2.length; index++) {
            arrayTeam2[index] = random.nextInt(23) + 18;
        }
        System.out.println("The age of the 2nd team players: " + Arrays.toString(arrayTeam2));

        int sumTeam1 = Arrays.stream(arrayTeam1).sum();
        int sumTeam2 = Arrays.stream(arrayTeam2).sum();

        int averageAgeOfTheTeam1Players = sumTeam1 / (int)arrayTeam1.length;
        int averageAgeOfTheTeam2Players = sumTeam2 / (int)arrayTeam2.length;

        System.out.println("The average age of the 1st team players = " + averageAgeOfTheTeam1Players + " years old");
        System.out.println("The average age of the 2st team players = " + averageAgeOfTheTeam2Players + " years old");

        }
    }


