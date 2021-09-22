package com.it.edu.info.manager.dao;

import com.it.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class StudentDao {
    private static ArrayList<Student> stus = new ArrayList<>();

    public boolean addStudent(Student stu) {
        if(stus.size() == 0) {
            return stus.add(stu);
        }
        boolean flag = true;
        for (int i = 0; i < stus.size(); i++) {
            if(stu.getId().equals(stus.get(i).getId())){
                flag =  false;
                break;
            }
        }

        if(flag) {
            return  stus.add(stu);
        }else {
            return flag;
        }
    }
    public ArrayList<Student> findAllList() {
        return stus;
    }
}
