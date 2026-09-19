package com.mp.mp.service;

import com.mp.mp.entity.IntStudent;
import com.mp.mp.repository.IntStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntSudentServiceImpl implements IntStudentService{

    final private IntStudentRepository repository;


    public IntSudentServiceImpl(IntStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createIntStudent(IntStudent intStudent) {
        IntStudent stu= new IntStudent();
        stu.setAge(intStudent.getAge());
        stu.setName(intStudent.getName());
        repository.save(stu);
    }

    @Override
    public IntStudent getIntStudent(Long id) {
        IntStudent stu= repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Id not found"));
        return stu;
    }

    @Override
    public List<IntStudent> getAllIntStudent() {
        List<IntStudent> intStudents= repository.findAll();
        return intStudents;

    }
}
