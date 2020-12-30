package vds.service.loyalty2.eventvisitor;

import vds.service.loyalty2.ConditionVisitor;
import vds.service.loyalty2.policy.DemographicPolicy;
import vds.service.loyalty2.policy.TimeBasedPolicy;

public class LoginSucceededEventVisitor implements ConditionVisitor {

    @Override
    public void visit(DemographicPolicy condition) {
        condition.businessFunction();
    }

    @Override
    public void visit(TimeBasedPolicy condition) {
    }
}
