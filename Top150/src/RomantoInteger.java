public class RomantoInteger{
    static int romanToInt(String s){
        int ans = 0;
        char last = ' ';
        for(char c:s.toCharArray()){
            if(last == 'I' && (c == 'V' || c == 'X')) ans -= 2;
            else if(last == 'X' && (c == 'L'|| c == 'C')) ans -= 20;
            else if(last == 'C' && (c == 'D'|| c == 'M')) ans -= 200;
            switch (c) {
                case 'I' -> ans++;
                case 'V' -> ans += 5;
                case 'X' -> ans += 10;
                case 'L' -> ans += 50;
                case 'C' -> ans += 100;
                case 'D' -> ans += 500;
                case 'M' -> ans += 1000;
            }
            last = c;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }
}
