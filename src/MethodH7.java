public class MethodH7 {
    public double addDouble(double[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum is: " + sum);
        return sum;

    }
public String primeNumber(int num){
        String Result = "";

            if (num % num == 0 && num % 1 == 0 && num % 2 != 0 ) {
                System.out.println(Result + num + " is prime number.");
            } else {
                System.out.println(Result + num + " isn't a prime number.");
            }

       return Result;
}
public String palinDrome(String name){
        String res = "";
        String[] n1 = name.split("");
        int lastIndex = n1.length-1;
        for (int i = lastIndex; i >= 0; i--){
            res = res + name.charAt(i);
        }
        if(res.equals(name)) {
            System.out.println(name + " is palindrome");
        }
        else {
            System.out.println(name + "isn't palindrome");
        }
        return res;

    }
    public void duplicate(String[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i] + " is the duplicate element");
                }

            }
        }

    }
    public void commonElement(String[] name1, String[] name2){
        for(int i = 0; i < name1.length; i++) {
            for (int j = 0; j < name2.length; j++){
                if (name1[i] == name2[j]){
                    System.out.println(name1[i]);
            }
        }
        }
    }

}



