package com.dtech.algo.strategy.config;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class RuleConfig {
  private String key;
  private String ruleName;
  private List<RuleInput> inputs;
  @Default
  private FollowUpRuleType followUpRuleType = FollowUpRuleType.None;
  @Default
  private RuleInput followUpRule = null;
}
