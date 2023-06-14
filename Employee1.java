package com.day10;

import java.util.HashMap;
import java.util.Map;

public class Employee1 {

	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeMap.put(1001,"Naier");
		employeeMap.put(1002,"Saif");
		employeeMap.put(1003,"Taushif");
		employeeMap.put(1004,"sharik");
		employeeMap.put(1005,"Deepak");
		
		System.out.println("Size of Employee :"  +employeeMap.size());
		
		employeeMap.put(1005,"Abid");
		
		
		// Update an employee name
        int employeeIdToUpdate = 1002;
        String updatedName = "Abid";
        employeeMap.put(employeeIdToUpdate, updatedName);
        System.err.println("Size of Employee After Update:" +employeeMap.size());
        
        // Remove an employee data from the map
        int employeeIdToRemove = 1001;
        employeeMap.remove(employeeIdToRemove);
        
        int searchEmployeeId = 103;
        if (employeeMap.containsKey(searchEmployeeId)) {
            String employeeName = employeeMap.get(searchEmployeeId);
            System.out.println("Employee Found!");
            System.out.println("Employee ID: " + searchEmployeeId);
            System.out.println("Employee Name: " + employeeName);
        } else {
            System.out.println("Employee Not Found!");

		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key +" : "+val);
			
			 System.out.println("All Employee Data:");
		        for (Map.Entry<Integer, String> employeeMap1 : employeeMap.entrySet()) {
		            int employeeId = entry.getKey();
		            String employeeName = entry.getValue();
		            System.out.println("Employee ID: " + employeeId);
		            System.out.println("Employee Name: " + employeeName);
		            System.out.println();
		        }
		}
		
	}
	}
}
