package CodingSkillTech;

import java.util.*;
public class ResultPassOrFail {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            String RC = number>=33 ? "Pass" : "Fail";
            System.out.println(RC);
        }
    
}
