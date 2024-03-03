/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagement;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Course implements Comparable<Course> {

    private String courseId;
    private String courseName;
    private int credit;

    public Course() {
    }

    public Course(String courseName, String courseId, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int compareTo(Course o) {
        return Integer.compare(this.credit, o.credit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Course otherCourse = (Course) obj;
        return Objects.equals(courseId, otherCourse.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
