package com.fhw.guliclassroom.common.practice.rebuild;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 12:28
 */


public class Main {
    public static void main(String[] args) {
        RuleEngine ruleEngine = new RuleEngine();
        Expression add = new Expression(10, 2, Operator.ADD);
        Expression divide = new Expression(10, 2, Operator.DIVIDE);
        Result process = ruleEngine.process(add);
        System.out.println(process.getResult());
        Result processDivide = ruleEngine.process(divide);
        System.out.println(processDivide.getResult());

    }
}
