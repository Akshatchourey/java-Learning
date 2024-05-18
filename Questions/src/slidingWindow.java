import java.util.HashSet;
import java.util.Set;

public class slidingWindow{
    public static long helper(String str, int k){
        long count = 0;
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<str.length();i++){
            mySet.clear();
            for(int j=i;j<str.length();j++){
                mySet.add(str.charAt(j)-'a');
                if(mySet.size() == k) count++;
                else if(mySet.size() == 26){
                    count += str.length()-j-1;
                    break;
                }
                else if(mySet.size() > k) break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(helper("aba", 2));
    }
}
