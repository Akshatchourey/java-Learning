import java.util.Arrays;
import java.util.Comparator;

public class G_158{
    static boolean classArrangement(int n, int[] arr){
        int k=0, j=0, n1=-1, n2=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                if(n1 == -1) n1 = i;
                else n2 = i;
                j++;
            }else if(arr[i] == arr[i+1]) k++;
            if(j > 2) return false;
        }
        if(j == 0 && k != 0) return true;
        else if(j == 1){
            if(n1-1>=0){
                if(!(arr[n1+1]>=arr[n1-1])) return false;
            }
            if(n1+2<n){
                return arr[n1] <= arr[n1 + 2];
            }
            return true;
        }
        else if(j == 2){
            if(arr[n1] > arr[n2] && arr[n1+1] > arr[n2+1]){
                if(n1-1>=0){
                    if(!(arr[n2+1]>=arr[n1-1])) return false;
                }
                if(n2+2<n){
                    return arr[n1] <= arr[n2 + 2];
                }
                return true;
            }
        }
        return false;
    }
    static String trafficLights(int n, int q, int[][] queries) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, 0);
        for(int[] k:queries){
            arr[k[0]-1] += 1;
            arr[k[1]] -= 1;
        }
        StringBuilder ans = new StringBuilder();
        int x = 0;
        for(int k:arr){
            x += k;
            if(x%3 == 0) ans.append('R');
            else if(x%3 == 1) ans.append('Y');
            else ans.append('G');
        }
        return ans.deleteCharAt(ans.length()-1).toString();
    }
    static int bobHappiness(int n, int k, int q, int[][] students, int[][] queries){
        if(k == 0) return 0;
        int[][] arr = students.clone();
        Comparator<int[]> c1 = new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] > b[0]) return 1;
                return -1;
            }
        };
        Arrays.sort(arr, c1);
        int[] tempA; int[] tempB; int[] tempC;
        int ans = 0, people, check, y1, y2;
        for(int[] l:queries){
            people = 0; check = 0;
            tempA = students[l[0]-1];
            tempB = students[l[1]-1];
            if(tempA[0] > tempB[0]){
                tempC = tempA.clone();
                tempA = tempB.clone();
                tempB = tempC;
            }
            y1 = Math.min(tempA[1], tempB[1]);
            y2 = Math.max(tempA[1], tempB[1]);
            for(int[] m:arr){
                if(check == 1){
                    if(m[1]>y1 && m[1]<y2) people++;
                    else if(m[0] == tempB[0] && m[1] == tempB[1]) break;
                }
                else if(m[0] == tempA[0] && m[1] == tempA[1]) check++;
            }
            if(people <= k) ans++;
        }
        return ans;
    }

    public static void main(String[] args){
        // Q1 Not working 98465/100000 passed
        System.out.println(classArrangement(6, new int[]{19,23,21,22,20,24}));
        // Q2 Done
        System.out.println(trafficLights(5, 3, new int[][]{{1,5}, {1,4}, {3,4}}));
        // Q3 Out of my scope
        // Q4 correct code but gives TLE Error
        System.out.println(bobHappiness(5,2,2,
                new int[][]{{-15, 15}, {5, 10}, {-10, 0}, {0, -15}, {15, -10}},
                new int[][]{{1,5}, {2, 5}}));
    }
}
