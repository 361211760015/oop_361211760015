package lab5;

public class ExArray {

    //Array คือ ตัวแปรชนิดหนึ่งที่สามารถเก็บข้อมูลได้หลายข้อมูลในตัวแปร 1 ตัวแปร โดยใช้เลข index
    //ในการระบุถึงตำแหน่งแต่ละตัวเลขข้อมูล เลข index นี้จะเริ่มต้นที่ 0 เสมอ
    public static void main(String[] args) {

        int x[] = new int[5];
        //ตัวแปร X สามารถเก็บข้อมูลจำนวนเต็มได้ 5 จำนวน
        System.out.println(x[0]); //แสดงข้อมูลใน x ตำแหน่งที่  0
        x[3] = 100;
        x[1] = x[0] + x[3]; //
        x[4] = x[1] *3;


        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //error
        //System.out.println(x[-1]);
        //System.out.println(x[1]); //indexOutOfBound Exception

    }//main
}//class
