public class FloydSTriangle{
    public static void main(String[] args) {
        int n = 10; // rows
        int b = 1, a = n*(n+1)/2 + 1, c;
        for(int i=0;i<n;i++){
            c = a-n+i;
            a = c;
            for(int j=n;j>i;j--){
                System.out.print(c + " ");
                c++;
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.println("");
        }
    }
}
