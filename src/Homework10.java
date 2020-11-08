import java.util.*;

public class Homework10 {
    public static void main(String[] args) {
        MethodH10 m1 = new MethodH10();
        ArrayList<String>words=new ArrayList<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("grow");
        words.add("joy");
        words.add("laugh");
        words.add("happy");
        words.add("laugh");
        words.add("joy");
        System.out.println(words);
        Set<String>newWords = new HashSet<>(words);
        for (String word : newWords) {
            if (words!=newWords) {
                System.out.println(word);
            }
        }
        Map<Integer,String>H10 =new HashMap<>();
        H10.put(101,"happy");
        H10.put(102,"peace");
        H10.put(103,"Happy");
        H10.put(104,"learn");
        H10.put(105,"PEaCe");
        H10.put(106,"HAPPY");
        Iterator<Integer> K = H10.keySet().iterator();
        while (K.hasNext()){
            System.out.println(K.next());
        }

    }


}
