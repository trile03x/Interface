/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART2;

import java.util.*;

public class BillList {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Bill arr[] = new Bill[n];

    BillList() {

    }

    public BillList(Bill[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public Bill[] getArr() {
        return arr;
    }

    public void setArr(Bill[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input() {
        for (int i = 0; i < n; i++) {
            arr[i] = new Bill();
            arr[i].input();
        }
    }

    public void Total() {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].getType().equals("Resident")) {
                sum1 += arr[i].Payment();
            } else if (arr[i].getType().equals("Business")) {
                sum2 += arr[i].Payment();
            } else if (arr[i].getType().equals("Organization")) {
                sum3 += arr[i].Payment();
            } else {
                sum4 += arr[i].Payment();
            }
        }
        System.out.println("- Total Resident : " + sum1);
        System.out.println("- Total Business  : " + sum2);
        System.out.println("- Total Organization  : " + sum3);
        System.out.println("- Total Otherwise   : " + sum4);
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.println("* Hoa don " + (i + 1));
            arr[i].display();
        }
    }
    Bill temp[] = new Bill[arr.length];

    public void Remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Nhap ma hoa don can xoa :");
        String str = sc.nextLine();
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            temp[j] = new Bill();
            if (arr[i].getCode().equals(str) == false) {
//                temp[i].setCode(arr[i].getCode());
//                temp[i].setNewindex(arr[i].getNewindex());
//                temp[i].setOldindex(arr[i].getOldindex());
//                temp[i].setType(arr[i].getType());
                temp[j] = arr[i];
                j++;
            } else {
                count++;
            }
        }
        System.out.println("-Danh sach hoa don sau khi xoa");
        for (int i = 0; i < temp.length - count; i++) {
            System.out.println("* Hoa don " + (i + 1));
            temp[i].display();

        }

    }
    public Bill maxpay()
        {
            int max = 0;
            Bill result = new Bill();
            for(int i =0;i<n;i++)
            {
                if(arr[i].Payment()>=max){
                    max=(int) arr[i].Payment();
                    result = arr[i];
                }
            }
            return result;
        }

}
