public class Palindrome_ReverseArray {
    public static int[] reverse(int[] arr, int l){
        if(l == arr.length/2){
            return arr;
        }
        int c = arr[l];
        arr[l] = arr[arr.length-1-l];
        arr[arr.length-1-l] = c;
        return reverse(arr, l+1);
    }
    public static int check(String s){
        if(s.length() <= 1){
            return 1;
        }
        else if(s.charAt(0) != s.charAt(s.length()-1)){
            return 0;
        }
        int ans = check(s.substring(1,s.length()-1));
        return ans;
    }

    public static void main(String[] args){
        // Reverse the given array.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 112};
        for(int k:reverse(arr, 0)){
            System.out.print(k + " ");
        }

        // Check weather the given string is palindrome or not. 1 = yes, 0 = no.
        System.out.println("");
        System.out.println(check("abba"));
    }
}
