import java.util.Date;

public class Activity {
    private String type;
    private double duration;
    private double distance;
    private double caloriesBurned;

    public Activity(String type, double duration, double distance, double caloriesBurned) {
        this.type = type;
        this.duration = duration;
        this.distance = distance;
        this.caloriesBurned = caloriesBurned;
    }

    // Getters and setters if needed
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    
    public static void main(String[] args) {
        // Create instances for different activities
        Activity running = new Activity("Running", 60, 5, 300);
        Activity swimming = new Activity("Swimming", 45, 1.5, 200);
        Activity walking = new Activity("Walking", 30, 3, 150);
        Activity cycling = new Activity("Cycling", 90, 10, 400);

        // Print information about each activity
        System.out.println("Running: Duration - " + running.getDuration() + " minutes, Distance - " + running.getDistance() + " km, Calories Burned - " + running.getCaloriesBurned() + " kcal");
        System.out.println("Swimming: Duration - " + swimming.getDuration() + " minutes, Distance - " + swimming.getDistance() + " km, Calories Burned - " + swimming.getCaloriesBurned() + " kcal");
        System.out.println("Walking: Duration - " + walking.getDuration() + " minutes, Distance - " + walking.getDistance() + " km, Calories Burned - " + walking.getCaloriesBurned() + " kcal");
        System.out.println("Cycling: Duration - " + cycling.getDuration() + " minutes, Distance - " + cycling.getDistance() + " km, Calories Burned - " + cycling.getCaloriesBurned() + " kcal");
    }
}
