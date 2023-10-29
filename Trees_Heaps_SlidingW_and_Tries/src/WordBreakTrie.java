import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordBreakTrie{
    static TrieNode root = new TrieNode();
    static List<String> ans = new ArrayList<>();
    public static void main(String[] args){
//        String[] words = {"i","like","python","math","samsung","sam","mobile","ice"};
        String[] words = {"cats", "cat", "and", "sand", "dog"};

        for(String u:words) Trie.insert(root, u);
//        System.out.println(wordBreak("ilikepython"));
//        gfgWordBreak("catsanddog");
        gfgWordBreakShort("catsanddog", "");
        System.out.println(ans);

//        System.out.println(startWith("mat"));

        // Don't insert anything for this.
//        System.out.println(uniqueSubstrings("apple"));

        // Longest Word With All Prefixes
//        root.isEndOfWord = true;
//        String[] arr  ={"a","ap","app","appl","apple","banana","apply"};
//        Arrays.sort(arr, Comparator.comparing(String::length));
//        System.out.println(lwap(arr));
    }

    static boolean wordBreak(String key){
        if(key.length() == 0) return true;
        String s1; String s2;
        for(int i=1;i<=key.length();i++){
            s1 = key.substring(0, i);
            s2 = key.substring(i);
            if(Trie.search(root, s1) && wordBreak(s2)) return true;
        }
        return false;
    }
    static String gfgWordBreak(String key){
        if(key.length() == 0) return key;
        String s1; String s2;
        for(int i=1;i<=key.length();i++){
            s1 = key.substring(0, i);
            s2 = key.substring(i);
            if(Trie.search(root, s1)){
                String check = gfgWordBreak(s2);
                if(check != null){
                    ans.add(s1 + " " + check);
                    return s1 + " " + check;
                }
            }
        }
        return null;
    }
    static void gfgWordBreakShort(String key, String str){
        if(key.length() == 0) ans.add(str.substring(0, str.length()-1));
        for(int i=1;i <= key.length();i++){
            String s1 = key.substring(0, i);
            String s2 = key.substring(i);
            if(Trie.search(root, s1)) gfgWordBreakShort(s2, str+s1+" ");
        }
    }
    static boolean startWith(String prefix){
        TrieNode curNode = root;
        for(char u:prefix.toCharArray()){
            if(curNode.children[u - 'a'] == null) return false;
            curNode = curNode.children[u - 'a'];
        }
        return true;
    }
    static int uniqueSubstrings(String str){
        int count = 1; String temp;
        for(int i=str.length()-1;i>=0;i--){
            for(int j=i+1;j<=str.length();j++){
                temp = str.substring(i,j);
                if(!Trie.search(root, temp)){
                    count++;
                    Trie.insert(root, temp);
                }
            }
        }
        return count;
    }
    static String lwap(String[] arr){
        String ans = ""; String temp = ""; int al = 0; int tl;
        for(String u:arr){
            temp = u; Trie.insert(root, u); tl = u.length();
            TrieNode curNode = root;
            for(char s:u.toCharArray()){
                if(!curNode.isEndOfWord){
                    temp = ""; tl = 0;
                    break;
                } curNode = curNode.children[s - 'a'];
            }
            if(tl > al || (tl == al && ans.compareTo(temp) > 0)){
                al = tl;
                ans = temp;
            }
        }
        return ans;
    } // longest word with all prefixes
}
