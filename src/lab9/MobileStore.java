package lab9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class MobileStore {
    public static void main(String[] args) {

        //step1 : load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
