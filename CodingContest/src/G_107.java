import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class G_107{
    static int nBlocks(int w){
        int ans = 0; int p = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while((int)(Math.pow(2, p)) <= w){
            arr.add((int)Math.pow(2, p));
            p++;
        }
        Collections.reverse(arr);
        while(w != 0){
            for(int k:arr){
                if(k <= w && w-k >= 0){
                    w -= k;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
    static long gatheringCostSir(int n, int[] weightArr){
        long totalw = 0;
        for(int k:weightArr){
            totalw += k;
        }
        long ans = 0;
        long left = 0;
        long right;
        for(int i=0;i<n;i++){
            right = totalw - left;
            ans += Math.min(right, left);
            left += weightArr[i];
        }
        return ans;
    }
    static long gatheringCost(int n, int[] weightArr){
        int k = 1;
        long tempCost = 0;
        for(int i=0;i<n;i++){
            tempCost += (long) weightArr[i]*i;
        }
        long cost = tempCost;
        while(true){
            tempCost = 0;
            for(int i=0;i<n;i++) {
                tempCost += (long) weightArr[i] * Math.abs(k-i);
            }
            if(tempCost<cost){
                cost = tempCost;
            }else{
                return cost;
            }
            k++;
        }
    }
    static int roomsRequired(int n, int k, int[] students){
        int rooms = 0;
        int countStudent = 0; int temp;
        Arrays.sort(students);
        for(int i=0;i<n/2;i++){
            temp = students[i];
            students[i] = students[n-i-1];
            students[n-i-1] = temp;
        }
        while(countStudent != n){
            int sum = 0;
            for(int i=0;i<n;i++){
                if(students[i] != 0 && sum+students[i] <= k){
                    countStudent++;
                    sum += students[i];
                    students[i] = 0;
                }
            }
            rooms++;
        }
        return rooms;
    }
    public static void main(String[] args){
        // Q1 Done
//        System.out.println(nBlocks(5));
        // Q2 Time limit exceeded
        int[] weightArr= {1,2,3,5};
//        System.out.println(gatheringCostSir(weightArr.length, weightArr));

        //Q3 Wrong ans, This code doses not works (Hotel room problem)
        int[] students = {5,2,8,7,4};
        System.out.println(roomsRequired(students.length,10, students));
    }
}
