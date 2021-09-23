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

    public void deleteStudentById(String id) {
        int index = getIndex(id);
        Student remove = stus.remove(index);
    }

    // 查找id 在不在 list里
    public int getIndex(String id) {
        int index = -1;
        ArrayList<Student> list = findAllList();
        for (int i = 0; i < list.size(); i++) {
            if(list != null && id.equals(list.get(i).getId())){
                index = i;
                break;
            }
        }
        return index;
    }
}
