package lab3;

import java.util.Scanner;

public class Control2 {
    public static void main (String[] args){

        //if-else  -> เป็นคำสั่งที่เลือกอย่างใดอย่างหนึ่ง
        //โครงสร้างคำสั่ง if-else
        //      คำสั่งของ if เมื่อเงื่อนไขเป็นจริง;
        //  }else{
        //      คำสั่งของ if เมื่อเงื่อนไขเป็นเท็จ;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?: ");
        int age = sc.nextInt();
        if (age > 60) {
            System.out.println("Your are old (คุณแก่แล้ว).");
        }else {
            System.out.println("Your are not old yel. (คุณยังไม่แก่เลย)");
        }
    }

}
