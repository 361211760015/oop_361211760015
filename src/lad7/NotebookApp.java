package lad7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class NotebookApp {
    public static void main(String[] args) {

        List<NoteBook> myList = new ArrayList<NoteBook>();
        System.out.println(myList);
        myList = addNotebook(myList);

        System.out.println(myList);

        System.out.println(myList);
        myList = addNotebook(myList);
    }//main

    private static List<NoteBook> addNotebook(List<NoteBook> myList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter Model: ");
        String model = sc.nextLine();
        System.out.println("Enter CPU: ");
        String cup = sc.nextLine();
        System.out.println("Enter GPU: ");
        String gpu = sc.nextLine();
        System.out.println("Enter RAM: ");
        String ram = sc.nextLine();
        System.out.println("Enter Display: ");
        String display = sc.nextLine();
        System.out.println("Enter HDD: ");
        String hdd = sc.nextLine();
        System.out.println("Enter OS: ");
        String os = sc.nextLine();
        System.out.println("Enter Price: ");
        double price = sc.nextDouble();

        //creat object
        NoteBook np = new NoteBook(brand,model,cup,gpu,ram,display,hdd,os,price);
        //add object into List
        myList.add(np);

        return myList;


    }
}//class
