public class butterfly {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int g=1;g<=2*(n-i);g++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int g=1;g<=2*(n-i);g++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
