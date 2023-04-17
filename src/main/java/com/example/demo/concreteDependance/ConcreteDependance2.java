package com.example.demo.concreteDependance;

import com.example.demo.abstractClass.AbstractClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteDependance2 extends AbstractClass {
    public void speak2(){
        System.out.println("concrete depedance 1");
    }
}
