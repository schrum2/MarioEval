package ch.idsia.ai.tasks;

import ch.idsia.ai.agents.Agent;
import ch.idsia.tools.EvaluationInfo;
import ch.idsia.tools.EvaluationOptions;
import ch.idsia.tools.Evaluator;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Sergey Karakovskiy
 * Date: Apr 8, 2009
 * Time: 11:26:43 AM
 * Package: ch.idsia.ai.tasks
 */
public class ProgressTask implements Task {

    private EvaluationOptions options;

    public ProgressTask(EvaluationOptions evaluationOptions) {
        setOptions(evaluationOptions);
    }

    public double[] evaluate(Agent controller) {
        double distanceTravelled = 0;
//        controller.reset();
        options.setAgent(controller);
        Evaluator evaluator = new Evaluator(options);
        List<EvaluationInfo> results = evaluator.evaluate();
        for (EvaluationInfo result : results) {
            //if (result.marioStatus == Mario.STATUS_WIN )
            //    Easy.save(options.getAgent(), options.getAgent().getName() + ".xml");
        	//distanceTravelled += result.computeDistancePassed();
            System.out.println("computeDistancePassed:"+result.computeDistancePassed());
            System.out.println("jumpActionsPerformed:"+result.jumpActionsPerformed);
            System.out.println("killsTotal:"+result.killsTotal);
            System.out.println("lengthOfLevelPassedCells:"+result.lengthOfLevelPassedCells);
            System.out.println("lengthOfLevelPassedPhys:"+result.lengthOfLevelPassedPhys);
            System.out.println("totalLengthOfLevelCells:"+result.totalLengthOfLevelCells);
            System.out.println("totalLengthOfLevelPhys:"+result.totalLengthOfLevelPhys);
            System.out.println("numberOfGainedCoins:"+result.numberOfGainedCoins);
            System.out.println("timeSpentOnLevel:"+result.timeSpentOnLevel);
            System.out.println("computeBasicFitness:"+result.computeBasicFitness());
            System.out.println("computeJumpFraction:"+result.computeJumpFraction());
            //System.out.println("computeKillsTotal:"+result.computeKillsTotal()); // duplicate
            System.out.println("beaten:"+(result.computeDistancePassed()==result.lengthOfLevelPassedPhys));
            
        }
        distanceTravelled = distanceTravelled / results.size();
        return new double[]{distanceTravelled};
    }

    public void setOptions(EvaluationOptions options) {
        this.options = options;
    }

    public EvaluationOptions getOptions() {
        return options;
    }

}
