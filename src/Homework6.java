public class Homework6 {

    public static int avg (int num1,int num2,int num3,int num4,int num5){
        int sum = num1 + num2 + num3+ num4 + num5;
        int av =sum/5;
        System.out.println("Sum is: "+ sum + " ,Average Is: "+ av);
        return av;
    }
    
    public static void main(String[] args) {
        int res = avg(22,11,33,44,55);
    }

}
