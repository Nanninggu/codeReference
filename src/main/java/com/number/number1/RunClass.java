package com.number.number1;

public class RunClass {

    Number1 number1 = new Number1();

    Number2 number2 = new Number2();

    String parameterTest = number1.name;
    String parameterTest_Location = number1.location;

    int parameterTest_Age = number1.age;

    /**
     * 메소드는 독립적으로 실행된다.
     * 내가 알아보기 위해 쉽게 설명 하자면,
     * 아래의 test_001의 메소드는 껍데기만 제공 한다고 보면된다.
     * 추가로, Input 파라미터의 이름인 parameterTest, parameterTest_Location, parameterTest_Age 의
     * 이름은 중요하지 않다. 임의의 이름으로 지정해도 무방하다.
     */
    public static void test_001(String parameterTest, String parameterTest_Location, int parameterTest_Age) {
        System.out.println("파라미터 테스트: " + parameterTest + "파라미터 테스트 로케이션: " + parameterTest_Location + "파라미터 테스트 나이: " + parameterTest_Age);
        System.out.println(parameterTest);
        System.out.println(parameterTest_Location);
        System.out.println(parameterTest_Age);
    }

    /**
     * 메소드는 독립적으로 실행된다.
     * runMethod_Test_001 메소드는 위의 test_001을 실행하기 위한
     * 파라미터를 생성하고, 껍데기를 제공한 test_001에
     * 파라미터를 맵핑 함으로써 결과적으로 test_001의 System.out.println 의
     * 결과가 화면에 표시된다.
     */
    public static void runMethod_Test_001() {
        String test = "test_value";
        String value_01 = "파라미터 테스트!!";
        String value_02 = "파라미터 테스트2!!";
        int value_int = 1004;
        test_001(test, value_01, value_int);
    }

    /**
     * 예를들어, 개인정보를 출력하는 메소드를 만들어보자.
     * if문을 활용하여 특정 조건의 출력을 확인해 보자.
     */
    public static void runMethod_Test_002(String name,
                                          String location,
                                          String number_of_address,
                                          String number_of_location_address ) {

        if (name == "김승현") {
            System.out.println(name);
            System.out.println(location);
            System.out.println(number_of_address);
            System.out.println(number_of_location_address);
        }

    }

    /**
     * Method는 독립적으로 수행되며, 우리가 아는 함수와 같다.
     * Return을 수행하는 메소드
     */
    public static String returnTest(String a, String b, String c, String d) {

        String total = a + b + c + d;

        return total;
    }
}
