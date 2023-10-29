import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlicesLibrary{
    static String helper(String s){
        int x = 0;  int count = 0;  char ch;
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(x == 0){
                if(ch == '/'){
                    count++;  x = i;  continue;
                }
                s1.append(ch);
            }else{
                if(ch == '/') count++;
                else if(ch == '\\') count--;
                if(count == 0){
                    s1.append(helper(s.substring(x+1, i)));
                    x = 0;
                }
            }
        }
        return String.valueOf(s1.reverse());
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string consisting of / and \\ ex- /u/love\\i\\ :- ");
        String str = br.readLine();
        System.out.println(helper(str.substring(1, str.length()-1)));
    }
}
