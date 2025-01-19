class WordDictionary{
    TrieNode root;
    public WordDictionary(){
        root = new TrieNode();
    }
    public void addWord(String w){
        TrieNode curr = root;
        for(char k:w.toCharArray()){
            if(curr.arr[k - 'a'] == null) curr.arr[k - 'a'] = new TrieNode();
            curr = curr.arr[k - 'a'];
        }
        curr.endOfWord = true;
    }
    public boolean search(String w){
        return helper(root, 0, w);
    }
    boolean helper(TrieNode root, int idx, String w){
        if(idx == w.length()) return root.endOfWord;
        char temp = w.charAt(idx);
        if(temp == '.'){
            for(TrieNode k:root.arr){
                if(k != null && helper(k, idx+1, w)) return true;
            }
        }
        else if(root.arr[temp - 'a'] == null) return false;
        else return helper(root.arr[temp - 'a'], idx+1, w);
        return false;
    }
}

public class DesignAddandSearchWordsDataStructure{
    public static void main(String[] args){
        WordDictionary one = new WordDictionary();
        one.addWord("a");
        one.addWord("a");
        System.out.println(one.search("."));
        System.out.println(one.search("aa"));
        System.out.println(one.search("a."));
    }
}
