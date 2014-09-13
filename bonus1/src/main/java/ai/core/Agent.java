package ai.core;

public class Agent {
    public String simpleReflex(Percept percept) {
        String action = null;
        if (percept.isDirty()) {
            action = "Suck";
        } else if (percept.isInA()) {
            action = "Right";
        } else if (percept.isInB()) {
            action = "Left";
        }
        return action;
    }
}
