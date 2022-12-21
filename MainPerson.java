/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART3_4;

import java.util.*;
public class MainPerson {
    public static void main(String [] args)
    {
        Professor f = new Professor("Manager","123AHC","Nguyen Quoc Bao",4);
        f.description();
        f.display();
        Student f1 = new Student("Technology IT",2022,"27211201040","Le Van Tri",2);
        f1.description();
        f1.display();
        System.out.println("___________________________________________________________");
        PersonList f3 = new PersonList();
        f3.input();
        f3.displayAll();
        System.out.println("___________________________________________________________");
        f3.average();
        System.out.println("___________________________________________________________");
        f3.maxRank();
        System.out.println("___________________________________________________________");
        f3.Remove();
    }}
    
    

