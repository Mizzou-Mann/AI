package ai.core;

public class Percept {

    public enum Location { A, B }
    
    private boolean aStatus;
    private boolean bStatus;
    private Location agentLocation;
    
    public Percept(boolean aStatus, boolean bStatus, Location agentLocation) {
        this.aStatus = aStatus;
        this.bStatus = bStatus;
        this.agentLocation = agentLocation;
    }

    public boolean isInA() {
        return agentLocation == Location.A;
    }
    
    public boolean isInB() {
        return agentLocation == Location.B;
    }
    
    public boolean isDirty() {
        switch (this.getAgentLocation()) {
            case A: return !aStatus;
            case B: return !bStatus;
            default: return false;
        }
    }

    public boolean getAStatus() {
        return aStatus;
    }

    public void setAStatus(boolean aStatus) {
        this.aStatus = aStatus;
    }

    public boolean getBStatus() {
        return bStatus;
    }

    public void setBStatus(boolean bStatus) {
        this.bStatus = bStatus;
    }

    public Location getAgentLocation() {
        return agentLocation;
    }

    public void setAgentLocation(Location agentLocation) {
        this.agentLocation = agentLocation;
    }

    public void clean() {
        this.aStatus = isInA() || this.aStatus;
        this.bStatus = isInB() || this.bStatus;
    }
    
    /**
     * [ Clean* | Dirty ]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [ ")
          .append(aStatus ? "Clean" : "Dirty").append(isInA() ? "*" : "")
          .append(" | ")
          .append(bStatus ? "Clean" : "Dirty") .append(isInB() ? "*" : "")
          .append(" ]");
        
        return sb.toString(); // [ Clean* | Dirty ]
    }
}
