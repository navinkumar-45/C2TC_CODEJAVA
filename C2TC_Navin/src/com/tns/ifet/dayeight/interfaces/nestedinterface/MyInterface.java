//Nested Interface
package com.tns.ifet.dayeight.interfaces.nestedinterface;

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}