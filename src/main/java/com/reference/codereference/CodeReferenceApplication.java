package com.reference.codereference;

import com.reference.codereference.parsing.jsonparsing.JsonParsing;
import com.reference.codereference.parameter.ReturnToParameterForValue;
import com.reference.codereference.parameter.ReturnToParameterForObject;
import com.reference.codereference.run.TotalRunClass;
import com.reference.codereference.trycatch.tryCatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeReferenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeReferenceApplication.class, args);
        startMethod();
        startParameterTest();
        tryCatchTest();
        TotalRunClass.runArrayListTest();
        TotalRunClass.runCustomAnnotation();
    }

    public static void startMethod() {
        JsonParsing jsonParsing = new JsonParsing();
        JsonParsing.jsonParsingExample();
        System.out.println(":::::::::::: Parsing Test END ::::::::::::");
    }

    public static void startParameterTest() {
        ReturnToParameterForValue returnToParameterForValue = new ReturnToParameterForValue();
        ReturnToParameterForValue.startValue();

        ReturnToParameterForObject returnToParameterForObject = new ReturnToParameterForObject();
        ReturnToParameterForObject.returnValue();
        System.out.println(":::::::::::: Return Test END ::::::::::::");
    }

    public static void tryCatchTest() {
        tryCatch tryCatch = new tryCatch();
        tryCatch.TryCatch();
        System.out.println(":::::::::::: TryCatch Test END ::::::::::::");
    }

}
