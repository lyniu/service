package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testsayHi(){

        String expactReturnValue = "hi, Tom! welcome to ServiceStage"; // You should put the expect String type value here.

        // You should put the parameter here,in such footprint: csedemoImpl.sayHi（String name）
        String returnValue = serviceDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
