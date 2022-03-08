package com.example.demo.employee;

import com.example.demo.DemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.*;

@RestController
@RequestMapping (value = "/employee")
public class EmployeeController {
    @GetMapping(value = {" ","/"})

    public List<Employee> listEmployee() throws IOException {

        // list that holds strings of a file
        List<String> listOfStrings = new ArrayList<String>();
        // load data from file
        BufferedReader bf = new BufferedReader(new FileReader("D:\\informatique\\work\\secondTask\\demo4\\spring\\hello\\src\\main\\resources\\employee"));

        // read line as string
        String line = bf.readLine();

        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }

        // closing bufferreader object
        bf.close();

        // storing the data in arraylist to array
        String[] array = listOfStrings.toArray(new String[0]);

        Employee[] employees = new Employee[array.length];
        for (int i = 0; i < array.length; i++) {
            employees[i] = new Employee(array[i]);
            employees[i].println();
            //employees[i].println();
        }

        return Arrays.asList(employees);

    }



}
    /*public List<Employee> listEmployee(){
        return Arrays.asList(
                new Employee(1,"name_1",1000),
                new Employee(1,"name_1",1000)


        );*/