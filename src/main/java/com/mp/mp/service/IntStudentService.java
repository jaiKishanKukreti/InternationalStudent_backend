package com.mp.mp.service;

import com.mp.mp.entity.IntStudent;

import java.util.List;

public interface IntStudentService {
    public void createIntStudent(IntStudent intStudent);
    public IntStudent getIntStudent(Long id);
    public List<IntStudent> getAllIntStudent();
}
