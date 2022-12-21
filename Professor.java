/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART3_4;

import java.util.*;

public class Professor extends Person {

    String department;

    Professor() {

    }

    public Professor(String department, String code, String name, int rank) {
        super(code, name, rank);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment
        (String department) {
        this.department = department;
    }

    @Override
    public void description() {
        System.out.println("RANK\t\tDESCRIPTION");
        System.out.println("0\t\tNone");
        System.out.println("1\t\tAssistant Professor");
        System.out.println("2\t\tAssistant Professor");
        System.out.println("3\t\tProfessor");
        System.out.println("4\t\tAssistant Teaching Professor");
        System.out.println("5\t\tAssistant Teaching Professor");
        System.out.println("6\t\tTeaching");

    }

    public void display() {
        System.out.println("* Information Of Professor :");
        super.display();
        System.out.println("- Professor Department : " + getDepartment());
    }

}
