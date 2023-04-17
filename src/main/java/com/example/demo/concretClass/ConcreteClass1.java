package com.example.demo.concretClass;

import com.example.demo.abstractClass.AbstractClass;
import com.example.demo.concreteDependance.ConcreteDependance1;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass {
  public void speakFromDependance1(){
      concreteDependance1.speak1();
  }
}
