package by.itland.itjava.timshina.lesson18.structure.fasade;

public class BugTracker {

    private Boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void endSprint() {
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
