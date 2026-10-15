package subsystem;

public class AthleteReadiness {
    public boolean isReady(int energyLevel) {
        boolean ready = energyLevel >= 40 && energyLevel <= 100;

        if (ready) {
            System.out.println("Athlete is ready.");
        }

        return ready;
    }
}