package com.example.demo.concretClass;

import com.example.demo.abstractClass.AbstractClass;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass {
    public void speakFromDependance2(){
        concreteDependance2.speak2();
    }
}
