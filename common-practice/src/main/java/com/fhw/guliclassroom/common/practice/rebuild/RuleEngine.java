package com.fhw.guliclassroom.common.practice.rebuild;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 12:22
 */

public class RuleEngine {
    private static List<Rule> ruleList = new ArrayList<>();

    static {
        ruleList.add(new AddRule());
        ruleList.add(new DivideRule());
    }

    public Result process(Expression expression) {
        Rule rule = ruleList.stream()
                .filter(r -> r.evaluate(expression))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Expression does not matches any Rule"));
        return rule.getResult();

    }

}
