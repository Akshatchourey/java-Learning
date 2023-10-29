public class G_120 {
    static String solve(int a, int b){
        if (a%2 == 0 && b%2 == 0) return "He";
        else if(a%2 != 0 && b%2 != 0) return "She";
        else return "Punished";
    }
    static int makeStringEmpty(String s){
        int ans = 0, t; StringBuilder temp = new StringBuilder();
        for(char u:s.toCharArray()){
            if(u == 'k'){
                t = temp.length();
                if(t >= 3 && temp.charAt(t-3) == 'g' && temp.charAt(t-2) == 'e' &&temp.charAt(t-1) == 'e'){
                    ans++;
                    temp.delete(temp.length() - 3, temp.length());
                }
                else return -1;
            }
            else temp.append(u);
        }
        if(temp.length() != 0) return -1;
        return ans;
    }
    static boolean check(int d, int n, int[] arr){
        int r, x, no;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                if(d == 0) return false;
                r = arr[i+1];
                x = i+d;
                while(x < n){
                    if(arr[x] <= r){
                        if(i > 0 && arr[x] < arr[i-1]) continue;
                        break;
                    }
                    x += d;
                }
                if(x < n){
                    while(x != i){
                        no = arr[x-d];
                        arr[x-d] = arr[x];
                        arr[x] = no;
                        x -= d;
                    }
                }
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        // Q1 Done
//        System.out.println(makeStringEmpty("geegeekgeggeekeekekk"));

        // Q2 Done
//        System.out.println(makeStringEmpty("gegeekekgeekggeekeek"));

        // Q3 TLE error as excepted (Today finely laptop got repaired - fan, battery)
//        System.out.println(check(2, 4, new int[]{3, 2, 1, 5}));
    }
}
