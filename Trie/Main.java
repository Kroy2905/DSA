package Trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Koustav");
        trie.insert("Kou");
        trie.insert("K");
        trie.search("Koust");
        trie.search("La");
        trie.search("Kout");
        trie.delete("Kou");
        trie.delete("Ko");
        trie.search("Kou");
        

    }
}
