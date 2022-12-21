/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART3_4;

import java.util.*;
public class Student extends Person{
    String DegreeProgram;
    int YearOfGraduation;
    public Student(){
        
    }
    public Student(String DegreeProgram, int YearOfGraduation, String code, String name, int rank) {
        super(code, name, rank);
        this.DegreeProgram = DegreeProgram;
        this.YearOfGraduation = YearOfGraduation;
    }

    public String getDegreeProgram() {
        return DegreeProgram;
    }

    public void setDegreeProgram(String DegreeProgram) {
        this.DegreeProgram = DegreeProgram;
    }

    public int getYearOfGraduation() {
        return YearOfGraduation;
    }

    public void setYearOfGraduation(int YearOfGraduation) {
        this.YearOfGraduation = YearOfGraduation;
    }
        
    
    @Override
    public void description() {
        System.out.println("RANK\t\tDESCRIPTION");
        System.out.println("0\t\tNone");
        System.out.println("1\t\tFreshman");
        System.out.println("2\t\tSophomore");
        System.out.println("3\t\tJunior");
        
        System.out.println("4\t\tSenior");
        System.out.println("5\t\tGraduate");
        System.out.println("6\t\tMasters Postgraduate");
        System.out.println("7\t\tPhD Postgraduate");
    }
    public void display()
    {
         System.out.println("* Information Of Student :");
         super.display();
         System.out.println("- Year Of Graduation : "+getYearOfGraduation());
         System.out.println("- Degree Program : "+getDegreeProgram());
         
        
    }
    
}
