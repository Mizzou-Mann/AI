package ai.apps;

import java.util.ArrayList;
import java.util.List;
import ai.core.Agent;
import ai.core.Environment;
import ai.core.Percept;

public class ReflexVaccumDemo {
    
    private static final int totalConfigurations = 8; 
    
    public static void main(String[] args) {
        Agent agent = new Agent();
        List<Percept> percepts = new ArrayList<>(totalConfigurations);
        percepts.add(new Percept(false, false, Percept.Location.A));
        percepts.add(new Percept(false, true , Percept.Location.A));
        percepts.add(new Percept(true , false, Percept.Location.A));
        percepts.add(new Percept(true , true , Percept.Location.A));
        percepts.add(new Percept(false, false, Percept.Location.B));
        percepts.add(new Percept(false, true , Percept.Location.B));
        percepts.add(new Percept(true , false, Percept.Location.B));
        percepts.add(new Percept(true , true , Percept.Location.B));
        
        PerformanceMeasure performanceMeasure = new PerformanceMeasure(1000);        
        double totalScore = 0;
        
        StringBuilder sb = new StringBuilder();
        for (Percept percept : percepts) {
            sb.append(percept.toString())
              .append(" = ");
            
            int score = performanceMeasure.evaluate(new Environment(percept), agent);
            totalScore += score;

            sb.append(score).append("\n");
        }
        sb.append("---------------------------\n")
          .append(" Average score = ")
          .append(totalScore/totalConfigurations);
        
        System.out.println(sb.toString());
    }
}
