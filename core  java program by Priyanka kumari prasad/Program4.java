//Write a Java program to find out whether the given String is Palindrome or not.

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome !");
        }
    }
}
