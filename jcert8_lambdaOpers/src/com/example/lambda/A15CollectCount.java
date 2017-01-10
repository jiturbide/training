package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A15CollectCount {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<String, Long> gMap = new HashMap<>();
       
        // Collect CO Executives
        gMap = eList.stream()
            .collect(
                Collectors.groupingBy(
                    e -> e.getDept(), Collectors.counting()));        

        System.out.println("\n== Employees by Dept ==");
        gMap.forEach((k,v) -> 
            System.out.println("Dept: " + k + " Count: " + v)
        );
        System.out.println("------------");
        List<Employee> backup = eList.stream().collect(Collectors.toList());
        backup.forEach(System.out::println);

        System.out.println("Salida grouping by ------------");
        Map<String, List<Employee>> mapBkp01 = new HashMap<>();
        mapBkp01 = eList.stream().collect(Collectors.groupingBy(e -> e.getDept()));
        for(String key : mapBkp01.keySet()) {
        	System.out.println("key:" + key);
        	List<Employee> tmpListEmp = mapBkp01.get(key);
        	for(Employee tmp: tmpListEmp) {
        		System.out.println("Emp: " + tmp.getEmail());
        	}
        }
        //List<Employee> mapa01 = eList.stream().collect(Collectors.toMap(keyMapper, valueMapper)());
        //backup.forEach(System.out::println);
        //System.out.println("------------");
        
    }
    
}
