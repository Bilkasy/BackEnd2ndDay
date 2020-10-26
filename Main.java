package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args){

        List<Persons> personsList =  Arrays.asList(
                new Persons("Ahmed", "ASWE", "507777"),
                new Persons("Mohamed", "SWE", "01048884"),
                new Persons("Youssef", "ASWE", "44444774"),
                new Persons("Abdelrahman", "ASWE", "666964774"),
                new Persons("Youssef", "SWE", "44444774")
        );
        Map<String, List<Persons>> map = new HashMap<String, List<Persons>>();

        map = personsList.stream().collect(Collectors.groupingBy(Persons::getPosition,Collectors.toList()));
        print(map);
    }
    private static void print(Map<String, List<Persons>> map) {
        map.forEach((title,list)->{
            System.out.println("Title: " + title + " TitleCount: " + list.stream().count());
            list.forEach((persons)->{
//                System.out.println("Person Name: " + persons.getName()+" Person Mobile: "+persons.getPhoneNumber());
                System.out.println(persons.getPersonNameToString() + " " + persons.getPersonNumberToString());
            });
        });
    }
}