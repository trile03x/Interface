/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART2;

import java.util.*;

public class Bill {

    String code;
    String type;
    double oldindex;
    double newindex;

    Bill() {
    }

    public Bill(String code, String type, double oldindex, double newindex) {
        this.code = code;
        this.type = type;
        this.oldindex = oldindex;
        this.newindex = newindex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOldindex() {
        return oldindex;
    }

    public void setOldindex(double oldindex) {
        this.oldindex = oldindex;
    }

    public double getNewindex() {
        return newindex;
    }

    public void setNewindex(double newindex) {
        this.newindex = newindex;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Customer Code :");
        setCode(sc.nextLine());
        System.out.println("- Customer Type :");
        setType(sc.nextLine());
        System.out.println("- Old index of water meter : ");
        setOldindex(sc.nextDouble());
        System.out.println("- New index of water meter : ");
        setNewindex(sc.nextDouble());
    }

    public int Price() {
        if (getType().equals("Resident")) {
            return 500;
        } else if ( getType().equals("Business")||getType().equals("Organization")) {
            return 400;
        } else {
            return 300;
        }
    }

    public double Payment() {
        if (getType().equals("Resident")) {
            return (getNewindex() - getOldindex()) * 500;
        } else if (getType().equals("Business")||getType().equals("Organization")) {
            return (getNewindex() - getOldindex()) * 400;
        } else 
            return (getNewindex() - getOldindex()) * 300;
    }

    public void display() {
        System.out.println("- Customer Code : " + getCode());
        System.out.println("- Customer Type : "+getType());
        System.out.println("- Price : "+Price());
        System.out.println("- Payment : "+Payment());

    }

}
