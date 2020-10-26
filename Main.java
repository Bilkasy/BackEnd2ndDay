package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Persons> personsList =  Arrays.asList(
                new Persons("Ahmed", "ASWE", "507777"),
                new Persons("Mohamed", "SWE", "01048884"),
                new Persons("Youssef", "ASWE", "44444774"),
                new Persons("Abdelrahman", "ASWE", "666964774")
        );
        Map<String, List<Persons>> map = new HashMap<String, List<Persons>>();
//        map = personsList.stream().collect(groupingBy((Persons p) -> p.getPosition()));
//        print(map);
        map = personsList.stream().collect(Collectors.groupingBy(Persons::getPosition,Collectors.toList()));
        print(map);
    }
    private static void print(Map<String, List<Persons>> map) {
        map.forEach((title,list)->{
            System.out.println("Title: " + title + " TitleCount: " + list.stream().count());
            System.out.println("About Employees: " + list);
        });
    }
}