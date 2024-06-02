package Trie;


import java.util.Map;
import java.util.HashMap;
public class TrieNode {
    Map<Character,TrieNode> children;
    public boolean endOfString;


    public TrieNode(){
        endOfString = false;
        children=new HashMap<>();
    }
}
