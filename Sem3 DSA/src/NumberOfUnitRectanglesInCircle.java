public class NumberOfUnitRectanglesInCircle{
    public static void main(String[] args){
        int r=1000, ans=0;
        int r1 = 4*r*r;
        for(int i=1;i<2*r;i++){
            ans += Math.abs(Math.sqrt(r1 - i*i));
        }
        System.out.println(ans);
    }
}
