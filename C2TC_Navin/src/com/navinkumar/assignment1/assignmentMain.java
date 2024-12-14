package com.navinkumar.assignment1;
import com.navinkumar.assignment1.employee.*;
import com.navinkumar.assignment1.utilities.EmployeeUtilities;
public class assignmentMain {
	public static void main(String[] args) { 
        manager manager = new manager("John", 101, 90000, "Sales"); 
        developer developer = new developer("Alice", 102, 80000, "Java"); 
        EmployeeUtilities.printEmployeeDetails(manager); 
        EmployeeUtilities.printEmployeeDetails(developer); 
    }

}
