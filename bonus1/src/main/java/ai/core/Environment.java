package ai.core;

public class Environment {

    private Percept currentPercept;
    
    public Environment(Percept currentPercept) {
        this.currentPercept = currentPercept;
    }
    
    public Percept getCurrentPercept() {
        return this.currentPercept;
    }

    public void updateState(String action) {
        if (action == "Suck") {
            currentPercept.clean();
        } else if (action == "Right") {
            currentPercept.setAgentLocation(Percept.Location.B);
        } else if (action == "Left") {
            currentPercept.setAgentLocation(Percept.Location.A);
        }
    }
}