package com.reference.codereference.parameter;

public class ReturnToParameterForObject {

    /**
     * JAVA 메소드의 리턴 값을
     * 다른 메소드의 객체로 전달하는 코드
     */

    public static int add(int a, int b) {
        return a + b;
    }

    public static void returnValue() {
        int result = add(1, 2);
        System.out.println(result); // 3

        // 다른 객체의 메서드 호출, 불러다가 넣는 강제 주입방식
        OtherObject otherObject = new OtherObject();
        otherObject.printResult(result);
    }
}

