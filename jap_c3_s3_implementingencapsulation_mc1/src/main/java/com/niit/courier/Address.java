package com.niit.courier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    // Declare the attributes that correspond to Address
    private String name;
    private int houseno;
    private String street;
    private String city;
    private String phoneno;

    // This methods takes a phone no as a string and validates the phone number
    // The phone no must be in the format below
    //  +<area code><10 digit numbers> - +919776855678
    // or a 10 digit number - 9776855678

    public int isPhoneNoValid(String phone) {
        String phonenumber = "";
        if (phone.length() == 10) {
            for (int i = 0; i < phone.length(); i++) {
                char ch = phone.charAt(i);
                if (Character.isDigit(ch)) {
                    phonenumber += ch;
                }
            }
        }

        int no = Integer.parseInt(phonenumber);

        return 0;
    }

    // Setter and getter methods

    public String getName() {
        return name;
    }

    public int getHouseNo() {
        return houseno;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNo() {
        return phoneno;
    }

    // setPhoneNo in the class, the phone number cannot be modified outside the class
    void setPhoneNo(String phoneNo) {
        this.phoneno = phoneNo;
    }

    // The method must return the address in the below format
    // Address [city=xxx,houseNo=xxx,name=xxx,phoneNo=xxx,street=xxx]


    // Parameterized constructor
    public Address(String name, int houseNo, String street, String city, String phoneNo) {
        // Initialize values here
        this.name = name;
        this.city = city;
        this.houseno = houseno;
        this.street = street;
        this.phoneno = phoneNo;
    }


}
