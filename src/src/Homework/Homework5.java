package Homework;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        //Problem-1
        String msg = "have happy and prosperous life";
        String[] msg1 = msg.split(" ");
        String abbr = "";
        int i = 0;
        while (i<=msg1.length-1){
             abbr = msg1[i].substring(0,1).toUpperCase();
             i++;
            System.out.println(abbr);

        }
        //OR
        String abbr1 = msg1[0].substring(0,1).toUpperCase();
        String abbr2 = msg1[1].substring(0,1).toUpperCase();
        String abbr3 = msg1[2].substring(0,1).toUpperCase();
        String abbr4 = msg1[3].substring(0,1).toUpperCase();
        String abbr5 = msg1[4].substring(0,1).toUpperCase();
        String abbreviation = abbr1 + abbr2 + abbr3 + abbr4 + abbr5;
        System.out.println("Abbreviation :" + abbreviation);
        //Problem-2
        String line = "once upOn a tiMe in the UNIVERSE";
        String[] line1 = line.toLowerCase().split(" ");
        String l1 = line1[0].substring(0,1).toUpperCase();
        String rL1 = line1[0].substring(1);
        String nL1 = l1 + rL1;
        String l2 = line1[1].substring(0,1).toUpperCase();
        String rL2 = line1[1].substring(1);
        String nL2 = l2 + rL2;
        String l3 = line1[2].substring(0,1).toUpperCase();
        String l4 = line1[3].substring(0,1).toUpperCase();
        String rL4 = line1[3].substring(1);
        String nL3 = l4 + rL4;
        String l5 = line1[4].substring(0,1).toUpperCase();
        String rL5 = line1[4].substring(1);
        String nL4 = l5 + rL5;
        String l6 = line1[5].substring(0,1).toUpperCase();
        String rL6 = line1[5].substring(1);
        String nL5 = l6 + rL6;
        String l7 = line1[6].substring(0,1).toUpperCase();
        String rL7 = line1[6].substring(1);
        String nL6 = l7 + rL7;
        String lineAfterMod = nL1 + " " + nL2 + " "+l3 + " "+ nL3+ " "+ nL4 +" "+ nL5 + " "+ nL6 +".";
        System.out.println("Line after modification :"+ lineAfterMod);
        System.out.println("Line before modification: "+ line);
        //Problem-3
        String message = "happy holidays";
        String[] m1 =message.split("");
        String reverseMessage = "";
        System.out.println("Message :"+ message);
        for(int j = message.length()-1;j>=0;j--){
            reverseMessage = reverseMessage + message.charAt(j);
        }
        System.out.print("The reversed line of the " + message + " is ");
        System.out.println(reverseMessage);















          



    }


}





