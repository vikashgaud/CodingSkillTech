package CodingSkillTech;

import java.util.*;

// user define input Print Sum of two values a+b=10+5=15

public class JavaBasic3 {
    public static void main(String args[]){
        System.out.println("Enter Value any number");
        Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int Sum = a + b;
        // System.out.println("Answer ="+ Sum);

        // circle of area
        float radious = input.nextFloat();
        float area = 3.14f * radious * radious;
        System.out.println(area);
    }
}
