import facade.WorkoutPreparationFacade;
import subsystem.WorkoutPlan;

public class Main {
    public static void main(String[] args) {
        WorkoutPreparationFacade facade =
                new WorkoutPreparationFacade();

        WorkoutPlan plan = new WorkoutPlan("Pull-ups", 45);

        try {
            facade.prepareWorkout(plan, 80);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Workout preparation failed: "
                    + e.getMessage());
        }
    }
}