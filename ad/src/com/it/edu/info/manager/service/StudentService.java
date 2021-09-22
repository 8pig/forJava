package com.it.edu.info.manager.service;

import com.it.edu.info.manager.dao.StudentDao;
import com.it.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student stu) {
        return  studentDao.addStudent(stu);
    }

    // 查找id 在不在 list里
    public int getIndex(String id) {
        int index = -1;
        ArrayList<Student> list = studentDao.findAllList();
        for (int i = 0; i < list.size(); i++) {
            if(list != null && id.equals(list.get(i).getId())){
                index = i;
                break;
            }
        }
        return index;
    }
}
