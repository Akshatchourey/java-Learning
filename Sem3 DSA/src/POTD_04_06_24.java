public class POTD_04_06_24{
    public static void main(String[] args) {
        String s = "111111";
        int i; String ans; StringBuilder ss = new StringBuilder();
        for(i=s.length()-1;i>=0;i--) if(s.charAt(i) == '0') break;

        for(int j=0;j<s.length()-1-i;j++) ss.append("0");
        if(i >= 0){
            ans = s.substring(0,i) + "1" + ss;
        }
        else ans = "1" + ss;

        i = 0;
        for(i=0;i<ans.length();i++) if(ans.charAt(i) == '1') break;

        System.out.println(ans.substring(i));
    }
}
