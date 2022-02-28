
//Write a Java program to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value n upto which the fibonacci series is to be calculated");
    int count=sc.nextInt();
    int a1=0,a2=1;
    System.out.println(a1);
    for (int i=1;i<count;i++){
    int num=a1+a2;
    a1=a2;
    a2=num;
    System.out.println(num); }   
    }
}
