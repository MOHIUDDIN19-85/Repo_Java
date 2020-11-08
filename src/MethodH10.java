public class MethodH10 {
    public void duplicateValue(String[]words, String[] newWords){
        int count = 0;
        for (int i = 0; i<=words.length; i++){
           for (int j = 0;j<=words.length;j++){
               if (newWords[j] == words[i]) {
                   count++;
                   System.out.println(words[i]+"-"+ count);
               }
           }
        }
    }


}
