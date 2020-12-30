package vds.service.loyalty2;

import vds.service.loyalty2.policy.DemographicPolicy;
import vds.service.loyalty2.policy.TimeBasedPolicy;

public interface ConditionVisitor {
  void visit(DemographicPolicy condition);
  void visit(TimeBasedPolicy condition);

}
