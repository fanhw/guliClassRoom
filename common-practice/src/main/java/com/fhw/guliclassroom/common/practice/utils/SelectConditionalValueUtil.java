package com.fhw.guliclassroom.common.practice.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-23 16:15
 */
public class SelectConditionalValueUtil {
    public static int getConditionalValue(List<Integer> lists) {

        for (int i = 0; i < lists.size() - 1; i++) {
            int firstSum = 1;
            int secondSum = 1;
            for (int j = 0; j <= i; j++) {
                firstSum = lists.get(j) * firstSum;
            }
            for (int k = i + 1; k < lists.size(); k++) {
                secondSum = lists.get(k) * secondSum;
            }
            if (firstSum == secondSum) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> testDataFirst = Arrays.asList(2, 2, 1, 2, 1, 2);
        List<Integer> testDataSecond = Arrays.asList(1, 2, 1);
        List<Integer> testDataThird = Arrays.asList(1, 1, 1, 1);
        // 多余情形
        // List<Integer> testDataFourth = Arrays.asList(2,1,2, 1, 2, 2, 2, 2, 1);
        List<Integer> testDataFifth = Arrays.asList(2, 2, 2, 2, 2, 2);
        List<Integer> testDataSixth = Arrays.asList(2, 2, 2, 2, 2);
        int conditionalValueFirst = getConditionalValue(testDataFirst);
        System.out.println("conditionalValueFirst = " + conditionalValueFirst);
        int conditionalValueSecond = getConditionalValue(testDataSecond);
        System.out.println("conditionalValueSecond = " + conditionalValueSecond);
        int conditionalValueThird = getConditionalValue(testDataThird);
        System.out.println("conditionalValueThird = " + conditionalValueThird);
        //   int conditionalValueFourth = getConditionalValue(testDataFourth);
        //  System.out.println("conditionalValueFourth = " + conditionalValueFourth);
        int conditionalValueFifth = getConditionalValue(testDataFifth);
        System.out.println("conditionalValueFifth = " + conditionalValueFifth);
        int conditionalValueSixth = getConditionalValue(testDataSixth);
        System.out.println("conditionalValueSixth = " + conditionalValueSixth);
    }
}
