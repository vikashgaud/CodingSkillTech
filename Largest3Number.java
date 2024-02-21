package CodingSkillTech;

public class Largest3Number {
    public static void main(String args[]){
        int A = 100;
        int B = 50;
        int C = 15;
        if((A>=B) && A>=C ){
            System.out.println("A is a largest number");
        }else if(B>=C){
            System.out.println("B is a largest number");
        }else{
            System.out.println("C is a largest number");
        }
    }
}
