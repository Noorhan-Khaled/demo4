package com.example.demo.employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {
    @PostMapping(value = {" ", "/"})
    /*public String newEmployee(){
        Employee employee=new Employee();
        return employee.printFile();
    }*/
    public List<Employee> newEmployee(){
        return Arrays.asList(
                new Employee(1,"A",1000),
                new Employee(2,"B",2000)


        );
    }
}
