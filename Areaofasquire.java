package CodingSkillTech;

                // Question2: In a program, input the side of a square. You have to output the area of the square.
                // (Hint : area of a square is (side x side))

                // प्रश्न2: एक प्रोग्राम में, एक वर्ग की भुजा इनपुट करें। आपको वर्ग का क्षेत्रफल आउटपुट करना होगा।
                 // (संकेत: एक वर्ग का क्षेत्रफल (भुजा x भुजा) है)

import java.util.*;

public class Areaofasquire {
    
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int area = side * side;
        System.out.println("Answer of squire of area = " + area);
    }
}
