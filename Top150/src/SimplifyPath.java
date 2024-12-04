import java.util.ArrayList;
import java.util.Stack;

public class SimplifyPath{
    static String simplifyPath(String str){
        ArrayList<String> asq = new ArrayList<>();
        String[] arr = str.split("/+");
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals("..")){
                if(!asq.isEmpty()) asq.remove(asq.size()-1);
            }
            else if(!arr[i].equals(".")) asq.add(arr[i]);
        }
        if(asq.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder();
        for(String k:asq) ans.append("/").append(k);
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
    }
}
