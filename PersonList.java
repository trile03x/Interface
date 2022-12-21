/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART3_4;

import java.util.*;

public class PersonList {

    ArrayList<Person> arr = new ArrayList<>();
    int n;

    PersonList() {

    }

    public PersonList(int n) {
        this.n = n;
    }

    public ArrayList<Person> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Person> arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Professor : 1 -- Student :2]");
        System.out.println("- Enter number people :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("=>Enter type oject " + (i + 1));
            int type = sc.nextInt();
            sc.nextLine();
            if (type == 1) {
                Professor f = new Professor();
                f.setType(type);
                System.out.println("- Code :");
                f.setCode(sc.nextLine());
                System.out.println("- Name :");
                f.setName(sc.nextLine());
                System.out.println("- Rank :");
                f.setRank(sc.nextInt());
                sc.nextLine();
                System.out.println("- Department : ");
                f.setDepartment(sc.nextLine());
                arr.add(f);
            }
            if (type == 2) {
                Student f2 = new Student();
                f2.setType(type);
                System.out.println("- Code :");
                f2.setCode(sc.nextLine());
                System.out.println("- Name :");
                f2.setName(sc.nextLine());
                System.out.println("- Rank :");
                f2.setRank(sc.nextInt());
                sc.nextLine();
                System.out.println("- Degree Program");
                f2.setDegreeProgram(sc.nextLine());
                System.out.println("- Year Of Graduation");
                f2.setYearOfGraduation(sc.nextInt());
                arr.add(f2);

            }
        }

    }

    public void displayAll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Enter rank to find : ");
        int check = sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).rank == check) {
                arr.get(i).display();
            }
        }
    }

    public void maxRank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Enter type object to find Max Rank :");
        int n = sc.nextInt();
        int max = 0;
        if (n == 1) {
            Professor p = new Professor();
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i).getType()==1){
                if (arr.get(i).getRank() >= max) {
                    max = arr.get(i).getRank();
                    p = (Professor) arr.get(i);
                }
                }
            }
            p.display();
        }
        if (n == 2) {
            Student p1 = new Student();
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i).getType()==2){
                if (arr.get(i).getRank() >= max) {
                    max = arr.get(i).getRank();
                    p1 = (Student) arr.get(i);
                }
                }
            }
            p1.display();
        }

    }
    
    public void average()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Enter type object to compute average:");
        int n = sc.nextInt();
        double sum =0;
        int count =0;
        for (int i =0;i<arr.size();i++)
        {
            if(arr.get(i).getType()==n)
            {
                sum+=arr.get(i).getRank();
                count++;
            }
        }
        System.out.println("- Avg :"+(sum/count));
    }
    public void Remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Enter code object to delete:");
        String strcode = sc.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getCode().equals(strcode)) {
                arr.remove(i);
            }

        }
        System.out.println("- List Object then remove : ");
        for (int i = 0; i < arr.size(); i++) {
           if(arr.get(i).getType()==1)
           {
               Professor p = new Professor();
               p = (Professor) arr.get(i);
               p.display();
           }
           if(arr.get(i).getType()==2)
           {
               Student p1 = new Student();
               p1 = (Student) arr.get(i);
               p1.display();
           }
        }

    }
    

}
