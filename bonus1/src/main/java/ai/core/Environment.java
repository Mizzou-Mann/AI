package ai.core;

public class Environment {

    private Percept currentPercept;
    
    public Environment(Percept currentPercept) {
        this.currentPercept = currentPercept;
    }
    
    public Percept getCurrentPercept() {
        return this.currentPercept;
    }

    public void updateState(Agent.Action action) {
        switch (action) {
            case SUCK:
                currentPercept.clean();
                break;
            case RIGHT:
                currentPercept.setAgentLocation(Percept.Location.B);
                break;
            case LEFT:
                currentPercept.setAgentLocation(Percept.Location.A);
                break;
            default:
                break;
        }
    }
}