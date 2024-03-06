package com.reference.codereference.parameter;

public class ReturnToParameterForValue {

    /**
     * JAVA 메소드의 리턴 값을 다른 메소드의
     * 파라미터 값으로 전달하는 예시 코드
     */

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int result) {
        System.out.println("두 수의 합은 " + result + "입니다.");
    }

    public static void startValue() {
        int num1 = 10;
        int num2 = 20;
        int sumResult = sum(num1, num2);
        printSum(sumResult);
    }
}
