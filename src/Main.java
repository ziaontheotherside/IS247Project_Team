import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean menuOption = true;
        int userChoice;
        double user_height;
        double user_weight;
        double user_goal_weight;
        int user_age;
        char user_gender;

        System.out.println("Welcome to MuscleMind!");
        System.out.println("Before we can begin tracking your progress..\n");

        System.out.println("What is your age?");
        user_age = input.nextInt();
        System.out.println("What is your gender (M/F)?");
        user_gender = input.next().charAt(0);
        System.out.println("What is your height (in)?");
        user_height = input.nextDouble();
        System.out.println("what is your weight (lbs)?");
        user_weight = input.nextDouble();


        while (menuOption == true) {
            System.out.println("=== MuscleMind Tracker ===");
            System.out.println("1. Record Workout");
            System.out.println("2. Track Progress");
            System.out.println("3. Schedule Workout");
            System.out.println("4. Suggested Workouts");
            System.out.println("5. Manage User Profile");
        }


        input.close();
     }
}
