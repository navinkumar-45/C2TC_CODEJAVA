package com.tns.ifet.dayfoure.interfaces.nestedinterface;

public interface MyInterface {
	void calculateArea();
    interface MyInnerInterface {
       int  id = 20;
       void print();     
    }
}