package CodingSkillTech;

            // Question3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser.
            // You have to output the total cost of the items back to the user as their bill.
            // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

            // प्रश्न3: उपयोगकर्ता से 3 वस्तुओं की लागत दर्ज करें (फ्लोट डेटा प्रकार का उपयोग करके) - एक पेंसिल, एक पेन और एक इरेज़र।
             // आपको वस्तुओं की कुल लागत उपयोगकर्ता को उनके बिल के रूप में वापस देनी होगी।
             // (जोड़ें: आप एक उन्नत समस्या के रूप में बिल में वस्तुओं पर 18% जीएसटी कर जोड़ने का भी प्रयास कर सकते हैं)

import java.util.*;

public class GST18percal {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        float pencile = input.nextInt();
        float pen = input.nextInt();
        float eraser = input.nextInt();
        float total_bill = pencile+pen+eraser;
         System.out.println("Total Bill = "+ total_bill);
         // with include 18 % GST
         float new_total = total_bill + (0.18f * total_bill); 
         System.out.println("Total Bill = "+ new_total);

    }
    
}
