package lab6;

import java.util.StringTokenizer;

public class exStingBuffer {
    public static void main(String[] args) {
        //stringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        //ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);

        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenizer
        String S = "We bring you all this morning’s key updates in news about the spread of the Novel Coronavirus. " +
                "Whilst there is plenty of speculation and rumours in social media, The Thaiger will only be publishing " +
                "news that has been corroborated by authorised medical and scientific organisations or quoted with " +
                "attribution in leading world media. As the story is developing quickly we will continually update this information.\n" +
                "\n" +
                "• The Coronavirus (2019-nCoV) outbreak has now spread to several continents and killed at least 80, whilst 2,700+ are reported to be infected, according to Reuters.";

        StringTokenizer tokenizer = new StringTokenizer(S);
        int countWord = tokenizer.countTokens();
        System.out.println("Word conut from messge:"+countWord);

        //word cutting
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());

        }



    }//main
}//class
