package ai.core;

public class Environment {
    public boolean s1; // true - clean, false - dirty in square 1
    public boolean s2; // true - clean, false - dirty in square 2
    public int location;
    
    public Environment(boolean s1, boolean s2, int location) {
        this.s1 = s1;
        this.s2 = s2;
        this.location = location;
    }

    public void updateState(String action) {
        if (action == "Suck") {
            if (location == 1) {
                s1 = true;
            } else if (location == 2) {
                s2 = true;
            }
        } else if (action == "Right") {
            location = 2;
        } else if (action == "Left") {
            location = 1;
        }
    }

    public int getPerformance() {
        return (s1 ? 1 : 0) + (s2 ? 1 : 0);
    }

    public boolean isDirty() {
        if (location == 1) {
            return !s1;
        } else {
            return !s2;
        }
    }

    public boolean isInLocation(int location) {
        return this.location == location;
    }
}