/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART1;

public class TestComparable implements Comparable{
    public int comparableTo(Employee x,Employee y) {
        if(x.getAge()==y.getAge())
        {
            return 0;
        }
        else if(x.getAge()>=y.getAge())
        {
            return 1;
        }
        else
            return -1;  
    }
    
}
