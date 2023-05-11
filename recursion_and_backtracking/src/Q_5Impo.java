import java.util.*;

public class Q_5Impo{
    public static void hit1(String s, int idx, String newString){
        if(idx == s.length()){
            System.out.println(newString);
            return;
        }
        char a = s.charAt(idx);
        hit1(s, idx+1, newString+a);
        hit1(s, idx+1, newString);
    }
    public static void hit2(String s, int idx, String newString, HashSet<String> hashSet){
        if(idx == s.length()){
            hashSet.add(newString);
            return;
        }
        char a = s.charAt(idx);
        hit2(s, idx+1, newString+a, hashSet);
        hit2(s, idx+1, newString, hashSet);
    }
    public static boolean hit3(ArrayList<Integer> arr,int idx ,int currentSum, int N){
        if(idx == arr.size()){
            return false;
        }
        int no = arr.get(idx);
        if(currentSum+no == N){
            return true;
        }
        else if(currentSum+no >N){
            return false;
        }
        return hit3(arr, idx+1, currentSum+no, N) || hit3(arr, idx+1, currentSum, N);
    }
    public static void hit4(ArrayList<Integer> asq, int idx, ArrayList<Integer> newArray){
        if(idx == asq.size()){
            System.out.println(newArray);
            return;
        }
        ArrayList<Integer> currentArray = new ArrayList<>(newArray);
        currentArray.add(asq.get(idx));
        hit4(asq, idx+1, currentArray);
        hit4(asq, idx+1, newArray);
    }
    public static void permutation(ArrayList<Integer> arr, int interchange){
        if(arr.size()-1 == interchange){
            System.out.println(arr);
            return;
        }
        for(int i=interchange; i<arr.size();i++){
            int a = arr.get(interchange);
            int b = arr.get(i);
            arr.set(interchange,b);
            arr.set(i,a);
            permutation(arr,interchange+1);
            arr.set(interchange,a);
            arr.set(i,b);
        }
    }
    public static void permutationForString(StringBuilder s, int interchange){
        if(s.length()-1 == interchange){
            System.out.println(s);
            return;
        }
        for(int i=interchange;i<s.length();i++){
            char a = s.charAt(interchange);
            char b = s.charAt(i);
            s.setCharAt(interchange,b);
            s.setCharAt(i,a);
            permutationForString(s,interchange+1);
            s.setCharAt(interchange,a);
            s.setCharAt(i,b);
        }
    }

    public static void main(String[] args){
        // hit1 print's subsequence of any string.
//        hit1("abc",0,"");

        // hit2 prints unique subsequences of any string. with lexicographical order.
//        HashSet<String> hashSet = new HashSet<>();
//        hit2("aaa", 0, "", hashSet);
//        List<String> ans = new ArrayList<>(hashSet);
//        Collections.sort(ans); System.out.println(ans);

        // hit3 who sums to N. [1,2,3,4,5] N=8
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
//        System.out.println(hit3(arr,0,0,5));

        // hit4 prints subsequence of any integer array. 2^n
//        ArrayList<Integer> asq = new ArrayList<>();
//        asq.add(1); asq.add(2); asq.add(3); asq.add(4); asq.add(5);
//        hit4(asq,0,new ArrayList<>());

        // per...  prints permutation of any integer array. n!
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1); arr.add(2); arr.add(3);
//        permutation(arr,0);

        // per...string prints all possible permutation of string.
        StringBuilder s = new StringBuilder("abc");
        permutationForString(s,0);
    }
}
