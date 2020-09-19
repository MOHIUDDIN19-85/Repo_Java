package Homework;

public class Homework2 {
    public static void main(String[] args) {
        // Convert farenheit to celsius
        double ftemp = 65.1 ;
        //cT =(fT - 32) * 5/9
        double cTemp = (ftemp - 32) * 5 / 9;
        System.out.println("Todays temparature in farenheit is " + ftemp + " is equal to " + cTemp + " in celsius .");
        //Convert Farenheit to kelvin
        // kT = (fT + 459.67) * 5/9;
        double kTemp = (ftemp + 459.67) * 5/9;
        System.out.println("Todays temparature in farenheit is " + ftemp + " is equal to " + kTemp + " in kelvin .");
        //Convert kelvin to celsius
        //cT =kT - 273.15
         cTemp = kTemp - 273.15;
        System.out.println("Todays temparature in kelvin is " + kTemp + " is equal to " + cTemp + " in celsius .");
        //Convert kelvin to farenheit
        //ft = 9/5(kT -273) + 32
        double fTemp = (9/5 * (kTemp - 273)) + 32;
        System.out.println("Todays temparature in kelvin is " + kTemp + " is equal to " + fTemp + " in farenheit .");
        //Convert celsius to farenheit
        //fT = (cT * 9/5) + 32
        double ffTemp = (cTemp * 9/5) + 32;
        System.out.println("Todays temparature in celsius is " + cTemp + " is equal to " + ffTemp + " in farenheit .");
        //Convert celsius to kelvin
        //kT = cT + 273.15
        kTemp = cTemp + 273.15;
        System.out.println("Todays temparature in celsius is " + cTemp + " is equal to " + kTemp + " in farenheit .");



    }
}
