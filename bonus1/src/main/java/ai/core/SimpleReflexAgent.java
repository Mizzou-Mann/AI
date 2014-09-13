package ai.core;

public class SimpleReflexAgent {

    public String execute(Environment env) {
        String action = "NoOp";
        
        if (env.isDirty()) {
            action = "Suck";
        } else if (env.isInLocation(1)) {
            action = "Right";
        } else if (env.isInLocation(2)) {
            action = "Left";
        }
        return action;
    }
}
