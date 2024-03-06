package com.reference.codereference.run;

import com.reference.codereference.annotation.create.use.FruitRun;
import com.reference.codereference.list.arraylist.ArrayListTest;

public class TotalRunClass {

    /**
    인터페이스 역할을 하는 클래스
     */

    public static void runArrayListTest () {

        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.ArrayListTest();
        System.out.println(":::::::::::: ArrayList Test END ::::::::::::");

    }

    public static void runCustomAnnotation () {
        FruitRun fruitRun = new FruitRun();
        fruitRun.runCustomAnnotation();
        System.out.println(":::::::::::: CustomAnnotation Test END ::::::::::::");
    }
}
