import java.util.*;
public class Main {
    public static List<String> ans=new ArrayList<String>();
    public static void generatePermutations(int i,int j,StringBuilder s1,List<String> ans){
        if(i==s1.length()){
            ans.add(new String(s1.toString()));
        }
        for(j=i;j<s1.length();j++){
            char temp=s1.charAt(i);
            s1.setCharAt(i,s1.charAt(j));
            s1.setCharAt(j,temp);
            generatePermutations(i+1,j,s1,ans);
             temp=s1.charAt(i);
               s1.setCharAt(i,s1.charAt(j));
              s1.setCharAt(j,temp);

        }
    }

   public static void main(String[] arg){
       StringBuilder s1=new StringBuilder("abc");
       generatePermutations(0,0,s1,ans);
       System.out.println(ans);
   }
}
