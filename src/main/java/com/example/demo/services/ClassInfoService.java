package com.example.demo.services;

import com.example.demo.entities.ClassInfo;
import com.example.demo.repositories.ClassInfoRepository;

import java.util.List;

public class ClassInfoService {
    private ClassInfoRepository classInfoRepo;

    public void save(List<ClassInfo> classInfoList)
    {
        classInfoList.forEach(C->classInfoRepo.save(C));
    }
}
