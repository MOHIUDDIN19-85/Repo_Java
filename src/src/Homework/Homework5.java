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
             abbr += msg1[i].substring(0,1).toUpperCase();
             i++;
        }
        System.out.println( "Abbreviation:" + abbr);

        //Problem-2
        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line before modification: "+ line);
        String[] line1 = line.toLowerCase().split(" ");
        line = "";
        for (int b = 0; b<line1.length;b++){
            line = line + " " + line1[b].substring(0,1).toUpperCase()+ line1[b].substring(1);

        }
        System.out.println("Line after modification: "+ line);

        //Problem-3
        String message = "happy holidays";
        String[]m1 = message.split(" ");
        int lastIndex = message.length()-1;
        String rMessage = "";
        for(int m =lastIndex; m>= 0; m--){
            rMessage = rMessage  + message.charAt(m);
        }
        System.out.println(rMessage);















          



    }


}





