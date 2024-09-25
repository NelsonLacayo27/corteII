package org.nplr.dao;

import org.nplr.interfaces.Operation;
import org.nplr.models.Student;

import java.util.ArrayList;

public class StudentDAO implements Operation {
    private ArrayList<Student> list = new ArrayList<>();
    /**
     * Add a student to the list
     * @param object
     */

    @Override
    public void create(Object object) {
        try {
            Student student = (Student) object;
            list.add(student);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Return the student's list
     * @return
     */

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    public ArrayList<Student> showList() {
        return list;
    }

    /**
     * Update student
     * @param object
     */

    @Override
    public void update(Object object) {
        Student student = (Student) object;
        for (Student st : list) {
            if(st.getCif().equals(student.getCif())) {
                st.setNames(student.getNames());
                st.setSurnames(student.getSurnames());
                st.setEmail(student.getEmail());
                st.setPhone(student.getPhone());
                return;
            }
        }
    }

    /**
     * Delete student
     * @param id
     */

    @Override
    public void delete(String id) {
        for (Student st : list) {
            if(st.getCif().equals(id)) {
                list.remove(st);
                return;
            }
        }
    }

    /**
     *
     * @param value
     * @return
     */

    @Override
    public Object search(String value) {
        for (Student st : list) {
            if(st.getCif().equals(value) || st.getNames().equals(value)
            || st.getSurnames().equals(value)) {
                return st;
            }
        }
        return null;
    }

}
