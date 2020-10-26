package com.company;

public class Persons {
    private String name;
    private String position;
    private String phoneNumber;
    private int  aswCount;
    private int  swCount ;

    public Persons(String name, String position, String phoneNumber) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.aswCount = 0;
        this.swCount = 0;
    }

    public int getAswCount() {
        return aswCount;
    }

    public void setAswCount(int aswCount) {
        this.aswCount = aswCount;
    }

    public int getSwCount() {
        return swCount;
    }

    public void setSwCount(int swCount) {
        this.swCount = swCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPersonNameToString()
    {
       return this.getName().toString();
    }
    public String getPersonNumberToString()
    {
        return this.getPhoneNumber().toString();
    }



}
