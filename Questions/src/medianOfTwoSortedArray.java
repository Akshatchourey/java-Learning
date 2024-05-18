public class medianOfTwoSortedArray{
    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {3};
        int n = a.length + b.length;
        int x = n/2+1;
        if(n%2 != 0) x++;
        int i=0,j=0,n1=0,n2=0;
        while(i<a.length && j<b.length && x != 0){
            x--; n1 = n2;
            if(a[i] <= b[j]){
                n2 = a[i];
                i++;
            }
            else{
                n2 = b[j];
                j++;
            }
        }
        while(i<a.length && x != 0){
            n1 = n2;
            n2 = a[i];
            x--; i++;
        }
        while(j<b.length && x != 0){
            n1 = n2;
            n2 = b[j];
            x--; j++;
        }
        if(n == 1) System.out.println(n2);
        if(n%2 == 0) System.out.println("ans " + (n1+n2)/2f);
        else System.out.println("ans " + n1);
    }
}
