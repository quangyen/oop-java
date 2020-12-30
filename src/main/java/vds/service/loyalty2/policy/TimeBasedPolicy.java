package vds.service.loyalty2.policy;

import vds.service.loyalty2.ConditionVisitor;
import vds.service.loyalty2.PolicyCondition;

public class TimeBasedPolicy implements PolicyCondition {
    @Override
    public String getId() {
        return "TimeBasedPolicy";
    }

    @Override
    public boolean qualifiedEvent(ConditionVisitor conditionVisitor) {
        System.out.printf("qualifiedEvent for %s\n",this.getId());
        conditionVisitor.visit(this);
        return false;
    }
}
