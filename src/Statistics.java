public class Statistics {
    private int activeMinutes;
    private double caloriesBurned;
    private double sleepHours;
    private double nutritionalIntake;

    public Statistics(int activeMinutes, double caloriesBurned, double sleepHours, double nutritionalIntake) {
        this.activeMinutes = activeMinutes;
        this.caloriesBurned = caloriesBurned;
        this.sleepHours = sleepHours;
        this.nutritionalIntake = nutritionalIntake;
    }

    public int getActiveMinutes() {
        return activeMinutes;
    }

    public void setActiveMinutes(int activeMinutes) {
        this.activeMinutes = activeMinutes;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public double getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(double sleepHours) {
        this.sleepHours = sleepHours;
    }

    public double getNutritionalIntake() {
        return nutritionalIntake;
    }

    public void setNutritionalIntake(double nutritionalIntake) {
        this.nutritionalIntake = nutritionalIntake;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "activeMinutes=" + activeMinutes +
                ", caloriesBurned=" + caloriesBurned +
                ", sleepHours=" + sleepHours +
                ", nutritionalIntake=" + nutritionalIntake +
                '}';
    }

    // Example usage
    public static void main(String[] args) {
        // Create a Statistics object
        Statistics stats = new Statistics(120, 500.5, 7.5, 2500);
        
        // Access and modify statistics
        System.out.println("Initial statistics:");
        System.out.println(stats);

        stats.setActiveMinutes(150);
        stats.setCaloriesBurned(600.7);
        stats.setSleepHours(8);
        stats.setNutritionalIntake(2700);

        System.out.println("\nUpdated statistics:");
        System.out.println(stats);
    }
}
