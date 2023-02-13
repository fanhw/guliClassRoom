package com.fhw.guliclassroom.common.practice.rebuild;

import org.apache.commons.lang3.StringUtils;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 12:21
 */


public class DivideRule implements Rule {
    Result result = new Result();

    @Override
    public boolean evaluate(Expression expression) {
        boolean evaluateResult = false;
        if (StringUtils.equals(expression.getOperator().getDescription(), Operator.DIVIDE.getDescription())) {
            result.setResult(expression.getX() / expression.getY());
            evaluateResult = true;
        }
        return evaluateResult;
    }

    @Override
    public Result getResult() {
        return result;
    }
}
