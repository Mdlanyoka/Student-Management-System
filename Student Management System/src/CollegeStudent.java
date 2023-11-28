/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mdlanyoka
 */
public class CollegeStudent extends Student {
    private String major;

    public CollegeStudent(String studentID, String name, int age, int grade, String major) {
        super(studentID, name, age, grade);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

