package subsystem;

public class ScheduleChecker {
    public boolean hasTime(int duration) {
        boolean available = duration > 0 && duration <= 120;

        if (available) {
            System.out.println("Training time confirmed.");
        }

        return available;
    }
}