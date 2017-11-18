package com.example.demo.controllers;

import com.example.demo.entities.ClassInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.services.schoolService;

@RestController
@RequestMapping("/school")
public class SchoolController{
    @Autowired
    private schoolService school;

    @PostMapping(value="/class")
    public List<ClassInfo> schoolclass(@RequestBody String jasonData) {

        List<ClassInfo> newList=new ArrayList<ClassInfo>();
        for (Integer i=0;i<10;i++) {
            ClassInfo c = new ClassInfo();
            c.classname = "name"+i.toString();
            c.classdescription = "description"+i.toString();
            newList.add(c);
        }

        school.save(newList);

        List<ClassInfo> classList=school.GetAllClass();
        return classList;
    }
    //@PostMapping(value="/class")
    //public ResponseEntity<Resource> schoolclass(@RequestBody String jasonData)
    //{
    //    return new ResponseEntity(school.GetAllClass(), HttpStatus.OK);
    //]
}
