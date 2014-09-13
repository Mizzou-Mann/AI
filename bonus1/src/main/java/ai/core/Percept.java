package ai.core;

public class Percept {

    private Environment env;
    
    public Percept(Environment env) {
        this.env = env;
    }

    public boolean isDirty() {
        if (env.location == 1) {
            return env.s1;
        } else if (env.location == 2) {
            return env.s2;
        }
        return false;
    }

}
