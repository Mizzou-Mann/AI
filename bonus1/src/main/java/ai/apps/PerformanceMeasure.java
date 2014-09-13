package ai.apps;

import ai.core.Environment;
import ai.core.SimpleReflexAgent;

public class PerformanceMeasure {
    
    private int timeStep;
    
    public PerformanceMeasure(int timeStep) {
        this.timeStep = timeStep;
    }

    public int evaluate(Environment env, SimpleReflexAgent agent) {
        int score = 0;
        
        for (int i=0 ; i<timeStep; i++) {
            env.updateState(agent.execute(env));
            score += env.getPerformance();
        }
        return score;
    }
}
