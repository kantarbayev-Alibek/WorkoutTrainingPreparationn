package facade;

import subsystem.AthleteReadiness;
import subsystem.EquipmentChecker;
import subsystem.ScheduleChecker;
import subsystem.WarmUpGuide;
import subsystem.WorkoutPlan;

public class WorkoutPreparationFacade {
    private final EquipmentChecker equipmentChecker;
    private final ScheduleChecker scheduleChecker;
    private final AthleteReadiness athleteReadiness;
    private final WarmUpGuide warmUpGuide;

    public WorkoutPreparationFacade() {
        equipmentChecker = new EquipmentChecker();
        scheduleChecker = new ScheduleChecker();
        athleteReadiness = new AthleteReadiness();
        warmUpGuide = new WarmUpGuide();
    }

    public void prepareWorkout(WorkoutPlan plan, int energyLevel) {
        if (plan == null || !plan.isValid()) {
            throw new IllegalArgumentException("Invalid workout plan.");
        }

        if (!scheduleChecker.hasTime(plan.getDuration())) {
            throw new IllegalStateException("Not enough time for training.");
        }

        if (!equipmentChecker.isReady(plan.getExercise())) {
            throw new IllegalStateException("Equipment is not ready.");
        }

        if (!athleteReadiness.isReady(energyLevel)) {
            throw new IllegalStateException("Athlete is not ready.");
        }

        warmUpGuide.startWarmUp();

        System.out.println("Workout is ready: " + plan.getExercise());
    }
}