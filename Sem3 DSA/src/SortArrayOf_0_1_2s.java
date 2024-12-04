public class SortArrayOf_0_1_2s{
    public static void main(String[] args){
        int n= 5;
        int[] arr= {0, 2, 1, 2, 0};
        int a=0, b=0, c=0;
        for(int k:arr){
            switch (k){
                case 0 -> a++;
                case 1 -> b++;
                case 2 -> c++;
            }
        }
        for(int i=0;i<a;i++) arr[i] = 0;
        for(int i=a;i<a+b;i++) arr[i] = 1;
        for(int i=a+b;i<a+b+c;i++) arr[i] = 2;
        for(int k:arr) System.out.print(k + " ");
    }
}
