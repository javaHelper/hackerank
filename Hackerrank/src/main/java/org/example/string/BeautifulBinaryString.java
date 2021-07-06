package org.example.string;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0101010"));
    }

    public static int beautifulBinaryString(String b) {
        return (b.length() - b.replaceAll("010", "").length()) /3;
    }
}
