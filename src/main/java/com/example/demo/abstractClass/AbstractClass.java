package com.example.demo.abstractClass;


import com.example.demo.concreteDependance.ConcreteDependance1;
import com.example.demo.concreteDependance.ConcreteDependance2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

@Primary
public abstract class AbstractClass {

    @Autowired
    protected ConcreteDependance1 concreteDependance1 ;
    @Autowired
    protected ConcreteDependance2 concreteDependance2 ;
}
