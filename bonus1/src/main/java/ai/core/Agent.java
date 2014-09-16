package ai.core;

public class Agent {
    
    public enum Action { SUCK, RIGHT, LEFT }
    
    public Action simpleReflex(Percept percept) {
        if (percept.isDirty()) {
            return Action.SUCK;
        } else if (percept.isInA()) {
            return Action.RIGHT;
        } else if (percept.isInB()) {
            return Action.LEFT;
        }
        return null;
    }
}
