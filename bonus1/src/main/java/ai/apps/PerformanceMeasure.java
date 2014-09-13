package ai.apps;

import ai.core.Agent;
import ai.core.Environment;
import ai.core.Percept;

public class PerformanceMeasure {
    
    private int timeStep;
    
    public PerformanceMeasure(int timeStep) {
        this.timeStep = timeStep;
    }

    public int evaluate(Environment env, Agent agent) {
        int score = 0;
        
        for (int i=0 ; i<timeStep; i++) {
            String action = agent.simpleReflex(env.getCurrentPercept());
            env.updateState(action);
            score += computeScore(env.getCurrentPercept());
        }
        return score;
    }
    
    private int computeScore(Percept percept) {
        int aScore = percept.getAStatus() ? 1 : 0;
        int bScore = percept.getBStatus() ? 1 : 0;
        return aScore + bScore;
    }
}
