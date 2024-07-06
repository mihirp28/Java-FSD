package com.niit.courier;

import java.time.LocalDateTime;

public class CourierImpl {
    public static void main(String[] args) {
        // Declare and Initialize Address and courier objects to test your code
        // give desired values
        // call the displayCourierDetails() method to display the details of the courier

       Address address = new Address("Rupesh Chaudhari",22,"2nd left corner","surat","7887588922");
        System.out.println(address.isPhoneNoValid("7887588922"));



}
}