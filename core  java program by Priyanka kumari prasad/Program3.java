//Write a Java program to calculate a Factorial of a number.
import java.util.*;

public class Program3 {
    public static void main(String[] args){
    double fact=1;
    System.out.println("Enter the value n whose factorial is to be calculated");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();    
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println(fact);
    }
}
