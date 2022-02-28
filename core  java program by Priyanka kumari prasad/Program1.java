//Write a Java program to perform basic Calculator operations.

class calculatorOperations {
    float result;
    float add(float i, float j) {
        result = i + j;
        //System.out.println(result);
        return result;
    }

    float subtract(float i, float j) {
        result = i - j;
        return result;
    }
    
    float multiply(float i, float j) {
        result = i * j;
        return result;
    }
    float divide(float i, float j) {
        result = i / j;
        return result;
    }
    
}

public class Program1 {

    public static void main(String[] args) {
        calculatorOperations firstoperation = new calculatorOperations();
        System.out.println(firstoperation.add(4.2f, 1.4f));
        System.out.println(firstoperation.subtract(4.2f, 1.4f));
        System.out.println(firstoperation.multiply(4.0f, 1.5f));
        System.out.println(firstoperation.divide(4.0f, 2f));
    }
}