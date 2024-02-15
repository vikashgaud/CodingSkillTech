package CodingSkillTech;

// Question1:   In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
            // (Hint : Average of N numbers is sum of those numbers divided by N)
            
            // प्रश्न 1: एक प्रोग्राम में, 3 नंबर इनपुट करें: A, B और C। आपको इन 3 नंबरों का औसत आउटपुट करना होगा।  
            // (संकेत: एन नंबरों का औसत N से विभाजित उन नंबरों का योग है)

import java.util.*;

public class Averageofthreenumber {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int Average = (a+b+c)/2;
        System.out.println("Answer of Average Number = "+ Average);
    }

}
