import java.util.ArrayList;

public class HappyNumber{
    static boolean isHappy(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int temp;
        while(n != 1){
            temp = n; n = 0;
            while(temp > 0){
                n += Math.pow(temp%10, 2);
                temp /= 10;
            }
            if(arr.contains(n)) return false;
            arr.add(n);
        }
        return true;
    }
    public static void main(String[] args){
    }
}