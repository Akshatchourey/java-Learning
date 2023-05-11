import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum{
    static ArrayList<ArrayList<Integer>> ansArray = new ArrayList<>();
    static void sumPl(ArrayList<Integer> a, ArrayList<Integer> currentArray, int b, int sum, int idx){
        // Bounding condition
        if(sum > b || idx == a.size()){
            return;
        }
        // Base case
        if(sum == b){
            if(ansArray.contains(currentArray)){
                return;
            }
            ansArray.add(new ArrayList<>(currentArray));
            return;
        }
        //Inclusion condition
        sum += a.get(idx);
        currentArray.add(a.get(idx));
        sumPl(a,currentArray,b,sum,idx);
        sum -= a.get(idx);
        currentArray.remove(currentArray.size()-1);

        // Exclusion condition
        sumPl(a,currentArray,b,sum,idx+1);
    }
    public static void main(String[] args){
        int b = 16;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7); a.add(2); a.add(6); a.add(5); Collections.sort(a);
        sumPl(a, new ArrayList<>(), b,0,0);
        System.out.println(ansArray);
    }
}
