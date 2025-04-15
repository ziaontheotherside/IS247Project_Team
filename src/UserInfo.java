/**
 * This class stores all the basic info about the user,
 * like their height, weight, goal, age, and gender.
 * 
 * It’s kind of like a profile that other parts of the app
 * can use to personalize workouts or track progress.
 * 
 * All the fields are private, so we use getters and setters
 * to access and update them safely.
 * 
 * @author Shiv
 * @version 1.0
 */
public class UserInfo {
    private double height;
    private double weight;
    private double goal_weight;
    private int age;
    private char gender;

    /**
     * Default constructor for creating a blank user profile.
     */
    public UserInfo() {}

    /**
     * Gets the user’s current height.
     * @return height in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Updates the user’s height.
     * @param height height in inches
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the user’s current weight.
     * @return weight in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Updates the user’s weight.
     * @param weight weight in pounds
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the user’s target or goal weight.
     * @return goal weight in pounds
     */
    public double getGoal_weight() {
        return goal_weight;
    }

    /**
     * Sets the user’s goal weight.
     * @param goal_weight target weight in pounds
     */
    public void setGoal_weight(double goal_weight) {
        this.goal_weight = goal_weight;
    }

    /**
     * Gets the user’s age.
     * @return age in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the user’s age.
     * @param age age in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the user’s gender.
     * @return gender (usually 'M' or 'F')
     */
    public char getGender() {
        return gender;
    }

    /**
     * Sets the user’s gender.
     * @param gender 'M' or 'F'
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
}
