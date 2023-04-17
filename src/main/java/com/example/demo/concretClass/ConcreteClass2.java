package com.example.demo.concretClass;

import com.example.demo.abstractClass.AbstractClass;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass {
    public String speakFromDependance2(){
       return concreteDependance2.speak2();
    }
}
