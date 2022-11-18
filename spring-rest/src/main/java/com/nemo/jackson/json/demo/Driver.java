package com.nemo.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println("FirstName: " + student.getFirstName());
            System.out.println("LastName: " + student.getLastName());

            Address address = student.getAddress();
            System.out.println("Street: " + address.getStreet());
            System.out.println("City: " + address.getCity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
