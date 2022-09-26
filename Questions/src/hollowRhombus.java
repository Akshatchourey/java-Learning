public class hollowRhombus {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){  //for(int j=1;j<=n-1;j++)
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int j=1;j<n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1;j<=n-3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
