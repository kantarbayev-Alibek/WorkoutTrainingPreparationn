
package subsystem;

public class WorkoutPlan {
    private final String exercise;
    private final int duration;

    public WorkoutPlan(String exercise, int duration) {
        this.exercise = exercise;
        this.duration = duration;
    }

    public boolean isValid() {
        return exercise != null
                && !exercise.isBlank()
                && duration > 0;
    }

    public String getExercise() {
        return exercise;
    }

    public int getDuration() {
        return duration;
    }
}
