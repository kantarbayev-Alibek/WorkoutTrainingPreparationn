
package subsystem;

public class EquipmentChecker {
    public boolean isReady(String exercise) {
        if (exercise == null || exercise.isBlank()) {
            return false;
        }

        System.out.println("Equipment checked for: " + exercise);
        return true;
    }
}
