package com.phaete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public Student findStudentById(Integer studentId) {
        return students.getOrDefault(studentId, null);
    }

    public void removeStudent(Integer studentId) {
        students.remove(studentId);
    }

    public List<Course> getStudentCourses(Integer studentId) {
        return students.getOrDefault(studentId, null).getCourses();
    }

}
