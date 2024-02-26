package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main  {

    public static void main(String[] args) {
	    Employee obj1=new Employee(10,"abc");
	    Employee obj2=new Employee(12,"Ram");
	    Map<Integer,Employee> map=new TreeMap<>();
	    map.put(12,obj2);
	    map.put(10,obj1);
        System.out.println(map);

    }
}
