package com.example.demo.services;

import com.example.demo.entities.ClassInfo;
import com.example.demo.repositories.ClassInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class schoolService {
    private ClassInfoRepository classInfoRepo;

    public void save(List<ClassInfo> classInfoList)
    {
        classInfoList.forEach(C->classInfoRepo.save(C));
    }
    public List<ClassInfo> GetAllClass()
    {
        return classInfoRepo.findAll();
    }
}
