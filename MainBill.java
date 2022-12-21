/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART2;
import java.util.*;
public class MainBill {
    public static void main(String [] args)
    {
        System.out.println("- Nhap so luong hoa don :");
        BillList f = new BillList();
        f.input();
        System.out.println("-------------------------------");
        f.display();
        System.out.println("-------------------------------");
        f.Total();
        f.Remove();
        System.out.println("- Max Bill : ");
        f.maxpay().display();
    }
    
}
