public class Homework6 {

    public static int avg (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int ave = sum / arr.length;
        return ave;
    }
    public static void nameSearch(String[] names, String givenName){
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(givenName)){
                System.out.println("Index of given name is: "+ i);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] testArray = {22,11,33,44,55};
        System.out.println("Average of given array is: "+ avg(testArray));
        String[] values = {"John", "michael","gphilippre","phlip","ilena","palena","fahry"};
        nameSearch(values,"ilena");

    }

}
