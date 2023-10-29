public class MultiplyTwoStrings{
    static String multiplyStrings(String s1,String s2){
        int k=0;
        while(k < s1.length() && (s1.charAt(k)-'0' == 0 || s1.charAt(k) == '-')) k++;
        StringBuilder a = new StringBuilder(s1.substring(k)); k = 0;
        while(k < s2.length() && (s2.charAt(k)-'0' == 0 || s2.charAt(k) == '-')) k++;
        StringBuilder b = new StringBuilder(s2.substring(k));
        StringBuilder ans = new StringBuilder("0");

        int temp, tempAns, noAns, gap = 0;
        for(int i=b.length()-1;i>=0;i--){
            char cary = '0', caryAns = '0';
            for(int j=a.length()-1;j>=0;j--){
                temp = (a.charAt(j)-'0')*(b.charAt(i)-'0') + (cary-'0');
                if(temp > 9){
                    cary = String.valueOf(temp).charAt(0);
                    temp -= (cary-'0')*10;
                }else cary = '0';
                if(a.length()-j+gap <= ans.length()) noAns = ans.charAt(a.length()-j-1+gap)-'0';
                else{
                    noAns = 0;
                    ans.append("0");
                }
                tempAns = noAns + temp + (caryAns-'0');
                if(tempAns > 9){
                    caryAns = String.valueOf(tempAns).charAt(0);
                    tempAns -= (caryAns-'0')*10;
                }
                else caryAns = '0';
                ans.setCharAt(a.length()-j-1+gap, (char)(tempAns+'0'));
            }
            if((cary-'0')+(caryAns-'0') != 0)ans.append((cary-'0')+(caryAns-'0'));
            gap++;
        }

        ans.reverse();
        if(ans.charAt(0)-'0' == 0) return "0";
        if((s1.charAt(0) == '-' && s2.charAt(0) == '-') || (s1.charAt(0) != '-' && s2.charAt(0) != '-')) return ans.toString();
        ans.insert(0, '-');
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(multiplyStrings("0033", "-0516"));
    }
}
