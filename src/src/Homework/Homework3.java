package Homework;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        //problem 1
        //Pr-1
        String name ="Mohiuddin khan";
        int nameLength = name.length();
        System.out.println("The length of my name is " + nameLength);
        //Pr-2
       String lastName = "khan";
       char lastNk = lastName.charAt(0);
        System.out.println(lastNk);
        boolean isalstanmContainK= lastNk == 'k'?true:false;
        System.out.println(isalstanmContainK);
        //or Pr-2
        boolean isStartWthk = lastName.startsWith("k");
        System.out.println(isStartWthk);
        //Pr-3
        String firstName = "Mohiuddin";
        char lstAlfOfFrstNm = firstName.charAt(8);
        System.out.println(lstAlfOfFrstNm);
        //Pr-4
        char lstNmM = lastName.charAt(3);
        boolean isLstNmEndWthM= lstNmM == 'M'?true:false;
        System.out.println(isLstNmEndWthM);
        //or Pr-4 sol
        boolean isEndsWithM = lastName.endsWith("M");
        System.out.println(isEndsWithM);
        //problem 2
        //P-1
        String myStatement = "I am a good programmer";
        String[] noOfWords = myStatement.split(" ");
        int len = noOfWords.length;
        System.out.println(len);
        //P-2
        String rePlacementMySt= myStatement.replaceAll("r","f");
        System.out.println(rePlacementMySt);
        //problem 3
        //Pr-1 sol
        // Store my first name in a string variable
        String fFirstName = "Mohiuddin";
        String[] FirstNameSplit = fFirstName.split("");
        int lenOfFirstName = FirstNameSplit.length;
        System.out.println("The length of my first name is " + lenOfFirstName + ".");
        //problem 4
        String strNew = "hello dear, how are you?";
        int lenOfStrNew = strNew.length();
        boolean islengthOfstrNew = lenOfStrNew > 10? true: false;
        System.out.println("Is the length of strNew is greater then 10? : " + islengthOfstrNew + " .");
        //problem 5
        String threeWordsSentence = "hApPY nEW yeAr";
        String lowerCaseOfTws = threeWordsSentence.toLowerCase();
        String LowCaOfSenOne = lowerCaseOfTws.replace('h','H');
        String LowCaOfSenTwo = LowCaOfSenOne.replace('n','N');
        String LowCaOfSenThree = LowCaOfSenTwo.replace('y','Y');
        System.out.println(LowCaOfSenThree);
        

        //problem 6
        String threeWordsSentenceOne = "Lab sessIONS clAsses";
        String upperCaseofThreewS = threeWordsSentenceOne.toUpperCase();
        String[] aBbone = upperCaseofThreewS.split(" ");
        aBbone[0] = aBbone[0].substring(0,1);
        aBbone[1] = aBbone[1].substring(0,1);
        aBbone[2] = aBbone[2].substring(0,1);
        String abbreviation = aBbone[0] + aBbone[1] + aBbone[2];
        System.out.println(abbreviation);
        















        

    }
}
