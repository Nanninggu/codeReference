package com.number;

import com.number.number1.RunClass;

public class MainClassFor1234 {

    /**
     * 메소드에 흐름을
     * 숫자로 전달하기
     */

    public static void main(String[] args) {
        // 실행 클래스

        RunClass runClass = new RunClass();

        String aa = "111111::::::";

        String bb = "222222::::::";

        int cc = 33333;

        RunClass.test_001(aa, bb, cc);

        RunClass.runMethod_Test_001();

        String name = "김승현";
        String location = "서울특별시 양천구 목동";
        String location_address = "777-31";
        String location_all = "302호";

        RunClass.runMethod_Test_002(name, location, location_address, location_all);

        /**
         * 세트는 아래와 같다.
         * 필요 요소는 변수 값 = A,B,C,D
         * 그리고 A,B,C,D의 값을 가지고 returnTest를 실행 한다.
         * 마지막으로 System.out.println을 통해 returnTest의 실행 결과를 출력한다.
         */
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";

        RunClass.returnTest(A, B, C, D);
        String Total_Value = RunClass.returnTest(A, B, C, D);
        System.out.println(Total_Value);
        System.out.println("END");

    }

}
