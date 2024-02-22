import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private List<Activity> activities;
    private List<Workout> workouts;
    private List<Goal> goals;

    public Tracker() {
        this.activities = new ArrayList<>();
        this.workouts = new ArrayList<>();
        this.goals = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    // Getters and setters if needed
    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }
}
