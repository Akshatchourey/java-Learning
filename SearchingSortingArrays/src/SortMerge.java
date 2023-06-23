import java.util.ArrayList;
import java.util.Scanner;

public class SortMerge{
    static ArrayList<Integer> mergeSort(ArrayList<Integer> arr, int half){
        // Base case
        if(arr.size() == 1){return arr;}

        ArrayList<Integer> tempA = new ArrayList<>(arr.subList(0,half));
        ArrayList<Integer> A = mergeSort(tempA, Math.ceilDiv(tempA.size(), 2));

        ArrayList<Integer> tempB = new ArrayList<>(arr.subList(half,arr.size()));
        ArrayList<Integer> B = mergeSort(tempB, Math.ceilDiv(tempB.size(), 2));

        // Sort and merge
        ArrayList<Integer> ans = new ArrayList<>();
        int a = 0; int b = 0;
        while(a<A.size() && b<B.size()){
            if(B.get(b) < A.get(a)){
                ans.add(B.get(b));
                b++;
            }else{
                ans.add(A.get(a));
                a++;
            }
        }while(b<B.size()){
            ans.add(B.get(b));
            b++;
        }while(a<A.size()){
            ans.add(A.get(a));
            a++;
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n = sc.nextInt();
        System.out.println("Enter n integers to sort.");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int half = Math.ceilDiv(arr.size(), 2) + 1;
        System.out.println(mergeSort(arr,half));
    }
}
