public class WordPattern{
    static boolean wordPattern(String pattern, String s){
        char[] p = pattern.toCharArray();
        String[] str = s.split(" ");
        String[] temp = new String[26];
        if(str.length != p.length) return false;
        for(int i=0;i<str.length;i++){
            if(temp[p[i] - 'a'] == null){
                for(String k:temp) if(k!=null && k.equals(str[i])) return false;
                temp[p[i] - 'a'] = str[i];
            }
            if(!temp[p[i] - 'a'].equals(str[i])) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
