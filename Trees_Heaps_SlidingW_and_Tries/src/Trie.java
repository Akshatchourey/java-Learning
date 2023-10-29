class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;
    public TrieNode(){
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}
public class Trie{
    public static void main(String[] args){
        TrieNode root = new TrieNode();
        String[] words = {"app", "bye", "apple", "by", "apply", "b"};
        for(String u:words) insert(root, u);
        System.out.println(search(root, "b"));
    }
    static void insert(TrieNode root, String word){
        TrieNode curNode = root;
        for(char u:word.toCharArray()){
            if(curNode.children[u - 'a'] == null){
                curNode.children[u - 'a'] = new TrieNode();
            }
            curNode = curNode.children[u - 'a'];
        }
        curNode.isEndOfWord = true;
    }
    static boolean search(TrieNode root, String word){
        TrieNode curNode = root;
        for(char u:word.toCharArray()){
            if(curNode.children[u - 'a'] == null) return false;
            curNode = curNode.children[u - 'a'];
        }
        return curNode.isEndOfWord;
    }
}
