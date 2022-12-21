/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART1;
public class MainComparable {
    
    public static void main(String [] args)
    {
        Employee f1 = new Employee();
        Employee f2 = new Employee();
        f1.setAge(49);f2.setAge(49);
        TestComparable f3 = new TestComparable();
        System.out.println(f3.comparableTo(f1,f2));
     }

    

}
