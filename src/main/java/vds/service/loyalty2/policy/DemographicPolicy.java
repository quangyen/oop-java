package vds.service.loyalty2.policy;

import vds.service.loyalty2.ConditionVisitor;
import vds.service.loyalty2.PolicyCondition;

public class DemographicPolicy implements PolicyCondition {
    @Override
    public String getId() {
        return "Demographic";
    }

    @Override
    public boolean qualifiedEvent(ConditionVisitor conditionVisitor) {
        System.out.printf("qualifiedEvent for %s\n",this.getId());
        conditionVisitor.visit(this);
        return false;
    }
    public void businessFunction(){

    }

}
