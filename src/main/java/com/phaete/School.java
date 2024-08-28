package com.phaete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    public List<Course> getStudentCourses(Student student) {
        return students.getOrDefault(student.getStudentId(), null).getCourses();
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(students);
    }
}
