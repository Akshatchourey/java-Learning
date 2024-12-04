public class CompareTwoFractions{
    public static void main(String[] args){
        String str = "5/6, 11/45";
        float a, b, ans = -1;
        for(String k:str.split(", ")){
            a = Integer.parseInt(k.split("/")[0]);
            b = Integer.parseInt(k.split("/")[1]);
            if(ans == -1){
                ans = a/b;
            }else{
                if(ans == a/b) System.out.println("equal");
                else if(ans > a/b) System.out.println(str.split(", ")[0]);
                else System.out.println(str.split(", ")[1]);
            }
        }
    }
}
