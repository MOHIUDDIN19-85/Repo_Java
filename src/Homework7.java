public class Homework7 {
    public static void main(String[] args) {
        //Problem-1
        MethodH7 m1 = new MethodH7();
        double[] var = {1.1,2.2,3.3,4.4,5.5};
        m1.addDouble(var);
        //Problem-2
        String res = m1.primeNumber(7);
        //Problem-3
        String word = m1.palinDrome("level");
        //Problem-4
        String[] words = {"hello", "peace", "happy","hello","Happy","hello"};
        m1.duplicate(words);

     //Problem-5
        String[] arr1 = {"hello","peace","happy","hello","Happy","hello","laugh"};
        String[] arr2 = {"hello","grow","laugh","peace"};
        m1.commonElement(arr1,arr2);
    }
}
