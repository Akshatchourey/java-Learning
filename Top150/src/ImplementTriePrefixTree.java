class TrieNode{
    TrieNode[] arr = new TrieNode[26];
    boolean endOfWord;
}

class Trie{
    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    public void insert(String w){
        TrieNode curr = root;
        for(char k:w.toCharArray()){
            if(curr.arr[k - 'a'] == null){
                curr.arr[k - 'a'] = new TrieNode();
            }
            curr = curr.arr[k - 'a'];
        }
        curr.endOfWord = true;
    }
    public boolean search(String w){
        TrieNode curr = root;
        for(char k:w.toCharArray()){
            if(curr.arr[k - 'a'] == null) return false;
            curr = curr.arr[k - 'a'];
        }
        return curr.endOfWord;
    }
    public boolean startsWith(String p){
        TrieNode curr = root;
        for(char k:p.toCharArray()){
            if(curr.arr[k - 'a'] == null) return false;
            curr = curr.arr[k - 'a'];
        }
        return true;
    }
}

public class ImplementTriePrefixTree{
    public static void main(String[] args){
        Trie one = new Trie();
        one.insert("the");
        System.out.println(one.search("the"));
        System.out.println(one.startsWith("th"));
    }
}
