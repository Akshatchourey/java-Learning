public class ZigzagConversion{
    static String convert(String s, int r){
        StringBuilder ans = new StringBuilder("");
        char[] arr = s.toCharArray();
        int a = (r-1)*2, b = 0;
        if( r == 1) return s;
        for(int i=0;i<r;i++){
            int c = i, d = b;
            while(c < arr.length){
                ans.append(arr[c]);
                d = a-d;
                if(d == 0) d = a;
                c += d;
            }
            b += 2;
        }
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
