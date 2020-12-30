package vds.service.loyalty2;

import vds.service.loyalty2.eventvisitor.LoginSucceededEventVisitor;

import java.util.Arrays;

public class Policy {
  PolicyCondition[] conditions;

  public Policy(PolicyCondition... conditions) {
    this.conditions = conditions;
  }

  void handleEvent(TriggerEvent event) {
    ConditionVisitor visitor = new LoginSucceededEventVisitor();
    Arrays.stream(conditions).forEach(policyCondition -> policyCondition.qualifiedEvent(visitor));
  }
}
