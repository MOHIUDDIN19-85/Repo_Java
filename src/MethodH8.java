public class MethodH8 {
     static int toner = 100;
     static int page = 100;


    public static void printSinglepg(int numS){
        page = page - numS;
        toner = toner - numS;

        System.out.println("Page Left: "+ page + " ,Toner Left: " + toner);
    }
    public static void printDoublePg(int numD){
         page = page - (numD/2);
         toner = toner - numD;
        System.out.println("Page Left: "+ page + " ,Toner Left: " + toner);
    }
    public  String checkToner(){
        String tonerStatus = "";
        if ( toner < 10){
            System.out.println("Add toner");
        }
        else {
            System.out.println("continue");
        }
        return tonerStatus;

    }
}
