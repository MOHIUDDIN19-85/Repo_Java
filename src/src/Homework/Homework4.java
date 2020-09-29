package Homework;

public class Homework4 {
    public static void main(String[] args) {
        //Problem -1
        double sScore = 150;
        double maxScore = 160;
        double sPercentage = (sScore / maxScore) * 100;
        if (sPercentage >= 91 && sPercentage <= 100) {
            String result = "A";
            System.out.println("Student grade is: " + result);
        } else if (sPercentage >= 81 && sPercentage <= 90) {
            String result = "B";
            System.out.println("Student grade is: " + result);
        } else if (sPercentage >= 71 && sPercentage <= 80) {
            String result = "c";
            System.out.println("Student grade is: " + result);
        } else if (sPercentage >= 61 && sPercentage <= 70) {
            String result = "D";
            System.out.println("Student grade is: " + result);
        } else if (sPercentage >= 51 && sPercentage <= 60) {
            String result = "E";
            System.out.println("Student grade is: " + result);
        } else if (sPercentage <= 50) {
            String result = "F";
            System.out.println("Student grade is: " + result);
        }

        System.out.println("Student percentage: " + sPercentage + " and student grade is: " );

        //Problem -2
        int var1 = 15;
        if (var1 % 3 == 0) {
            System.out.println("Number divisible by 3");
        } else if (var1 % 5 == 0) {
            System.out.println("Number divisible by 5");
        } else if (var1 % 3 == 0 && var1 % 5 == 0) {
            System.out.println("Number divisible by both 3 and 5");
        } else if (var1 % 3 != 0 && var1 % 5 != 0) {
            System.out.println("The number is " + var1);
        }
        //problem 3
        String cMode = "D";
        String dType = "Sport";
        switch (cMode) {
            case "P":
                System.out.println("You can Park car");
                break;
            case "D":
                if (dType == "snow") {
                    System.out.println("Display: You are in snow mode ");
                } else if (dType == "Sport") {
                    System.out.println("Display: You are in sport mode ");
                } else if (dType == "eco") {
                    System.out.println("Display: You are in eco mode ");
                }
                break;
            case "N":
                System.out.println("Put car in car wash");
                break;
            case "R":
                System.out.println("Revere the car");
                break;
            default:
                System.out.println("All is well");
                break;
        }
    }
}
