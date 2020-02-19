package lab8_2;

public class PersonApp {
    public static void main(String[] args) {

        //create odjects
        Person P1 = new Person("Rattanawalee Sakunnoo","1997");
        Person P2 = new Sheriff("Gif Kup","1995","Thungsong");
        Person P3 = new Police("Ong kabi","1993","Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();
        }

}
