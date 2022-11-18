package com.nemo.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);
            System.out.println("FirstName: " + student.getFirstName());
            System.out.println("LastName: " + student.getLastName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
