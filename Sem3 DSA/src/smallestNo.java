public class smallestNo{
    public static void main(String[] args){
        int s = 20, d = 3;

        if(s > 9*d) System.out.println("-1");
        StringBuilder str = new StringBuilder();
        str.append(1);
        for(int i=0;i<d-1;i++) str.append(0);
        s--; d--;
        while(s >= 9){
            str.setCharAt(d, '9');
            s -= 9;
            d--;
        }
        if(s != 0){
            if(d == 0) s++;
            str.setCharAt(d, (char)(s + '0'));
        }

        System.out.println(str);
    }
}
