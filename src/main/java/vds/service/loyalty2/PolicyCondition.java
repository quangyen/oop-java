package vds.service.loyalty2;

import vds.service.loyalty2.ConditionVisitor;

public interface PolicyCondition {
  String getId();
  boolean qualifiedEvent(ConditionVisitor event);
}
