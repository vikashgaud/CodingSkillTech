package CodingSkillTech;

import java.util.*;

public class else_if_statement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else {
            System.out.println("child");
        }
    }
}
