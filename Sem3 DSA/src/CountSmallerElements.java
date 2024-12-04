import java.util.ArrayList;

public class CountSmallerElements{
    static int search(ArrayList<Integer> asq, int searchNo){
        int low = 0; int mid; int high = asq.size()-1;
        int temp = 0;
        while(low < high){
            mid = (low+high)/2;
            if(searchNo == asq.get(mid)){
                temp = 1;
                break;
            }
            else if(searchNo < asq.get(mid)) high = mid-1;
            else low = mid+1;
        }
        if(temp == 1 || (low == high && searchNo == asq.get(low))){
            temp = (low+high)/2;
            while(temp >= 0 && asq.get(temp) == searchNo) temp--;
            return temp+1;
        }
        if(searchNo<asq.get(low)) return low;
        return low+1;
    }
    public static void main(String[] args){
        int[] arr = {12, 1, 2, 3, 0, 11, 4, 4};
        int[] ans = new int[arr.length];
        ArrayList<Integer> asq = new ArrayList<>();

        int temp;
        asq.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            temp = search(asq, arr[i]);
            ans[i] = temp;
            if(temp == -1){
                ans[i] = 0;
                asq.add(0, arr[i]);
            }
            else asq.add(temp, arr[i]);
        }
        for(int k:ans) System.out.print(k + " ");
    }
}
