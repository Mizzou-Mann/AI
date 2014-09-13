package ai.apps;

import java.util.ArrayList;
import java.util.List;

import ai.core.Environment;
import ai.core.SimpleReflexAgent;

public class ReflexVaccumDemo {
    public static void main(String[] args) {
        PerformanceMeasure performanceMeasure = new PerformanceMeasure(1000);
        SimpleReflexAgent agent = new SimpleReflexAgent();
        
        List<Integer> scores = new ArrayList<Integer>(8); 
        double totalScore = 0;
        
        scores.add(performanceMeasure.evaluate(new Environment(false, false, 1), agent));
        scores.add(performanceMeasure.evaluate(new Environment(false, true , 1), agent));
        scores.add(performanceMeasure.evaluate(new Environment(true , false, 1), agent));
        scores.add(performanceMeasure.evaluate(new Environment(true , true , 1), agent));
        scores.add(performanceMeasure.evaluate(new Environment(false, false, 2), agent));
        scores.add(performanceMeasure.evaluate(new Environment(false, true , 2), agent));
        scores.add(performanceMeasure.evaluate(new Environment(true , false, 2), agent));
        scores.add(performanceMeasure.evaluate(new Environment(true , true , 2), agent));
        
        for(Integer score : scores) {
            System.out.println("Score: " + score);
            totalScore += score;
        }
        System.out.println("Average score: " + totalScore/8);
    }
}
