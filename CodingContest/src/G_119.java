import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class G_119{
    static String solve(int n, String str){
        Map<Character, Integer> myMap = new HashMap<>();
        for(char u:str.toCharArray()){
            myMap.put(u, myMap.getOrDefault(u, 0)+1);
        }
        char ans = ' '; int s = 0;
        for(Map.Entry<Character, Integer> u:myMap.entrySet()){
            if(u.getValue() > s){
                ans = u.getKey();
                s = u.getValue();
            }
            else if(u.getValue() == s){
                if(ans-'a' > u.getKey()-'a') ans = u.getKey();
            }
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(solve(4, "gfgg"));

        // Q2 Not Done (dp problem, dp not yet learned)

        // Q3 not done - actually I did correctly, but they explained question incorrectly hence all of my ans is wrong.
        int[] p = {-1, 0, 0, 0 ,0 ,1 ,1 ,6 ,6 ,4};
//        System.out.println(thrindrome(10, p, "zfomybhyie"));
    }
}
