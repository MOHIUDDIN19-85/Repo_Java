package Homework;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        //problem 1
        //Pr-1
        String name ="Mohiuddin khan";
        String[]nameSplit = name.split(" ");
        String ffirstName = nameSplit[0];
        int lenOfffirstName = ffirstName.length();
        System.out.println("Length of my first name is :" + lenOfffirstName + ".");
        //Pr-2
       String lastName = "khan";
       boolean isStartWthk = lastName.startsWith("k");
        System.out.println(isStartWthk);
        //Pr-3
        String lstletterOfFstName = nameSplit[0].substring(8);
        System.out.println("The last letter of my First Name is: " + lstletterOfFstName + ".");

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
        String[] splitOne = lowerCaseOfTws.split(" ");
        String f1 = splitOne[0].substring(0,1).toUpperCase();
        String l1 = splitOne[0].substring(1);
        String w1 = f1 + l1;
        String f2 = splitOne[1].substring(0,1).toUpperCase();
        String l2 = splitOne[1].substring(1);
        String w2 = f2 + l2;
        String f3 = splitOne[2].substring(0,1).toUpperCase();
        String l3 = splitOne[2].substring(1);
        String w3 = f3 + l3;
        String newWord = w1 + " " + w2 + " " + w3;
        System.out.println(newWord);










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
