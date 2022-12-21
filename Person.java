/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART3_4;

import java.util.*;

public abstract class Person {

    protected String code;
    protected String name;
    protected int rank;
    int type;

    Person() {

    }

    public Person(String code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public abstract void description();

    public void display() {
        System.out.println("- Employee code:" + code);
        System.out.println("- Employee name:" + name);
        System.out.println("- Rank:" + rank);
    }
}
