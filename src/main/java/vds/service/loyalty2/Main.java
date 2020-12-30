package vds.service.loyalty2;

import vds.service.loyalty2.event.LoginSucceededEvent;
import vds.service.loyalty2.event.RewardIssuedEvent;
import vds.service.loyalty2.policy.DemographicPolicy;
import vds.service.loyalty2.policy.TimeBasedPolicy;

public class Main {
  public static void main(String[] args){
    Policy policy = new Policy(new DemographicPolicy(),new TimeBasedPolicy());
    policy.handleEvent(new LoginSucceededEvent());
    policy.handleEvent(new RewardIssuedEvent());
  }
}
