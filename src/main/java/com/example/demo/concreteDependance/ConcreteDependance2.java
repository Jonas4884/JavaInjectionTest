package com.example.demo.concreteDependance;

import com.example.demo.abstractClass.AbstractClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteDependance2 extends AbstractClass {
    public String speak2(){
        return ("concrete depedance 2");
    }
}
