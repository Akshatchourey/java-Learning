import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SequencesPartTwoUnique{
    public static void fun(String str, int idx,String newstring,ArrayList<String>  arr){
        if(idx == str.length()){
            for (String element : arr){
                if(element.equals(newstring)){return;}
            }
            arr.add(newstring);
            System.out.println(newstring);
            return;}
        char newchar = str.charAt(idx);
        fun(str,idx+1,newstring+newchar,arr);
        fun(str,idx+1,newstring,arr);
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        fun("aabb",0,"",arr);
    }
}
