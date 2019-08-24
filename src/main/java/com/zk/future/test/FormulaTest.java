package com.zk.future.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author: zking
 * @Date: 2019/8/19 11:59
 * @Content:
 */
public class FormulaTest {

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sort(100 * a);
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sort(16));
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    }






}
