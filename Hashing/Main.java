package Hashing;

public class Main {
    public static void main(String[] args) {
    /*     DirectChain chain = new DirectChain(15);
        chain.inserthashTable("hello");
        chain.inserthashTable("world");
        chain.inserthashTable("how");
        chain.inserthashTable("are");
        chain.inserthashTable("you");
        chain.searchHashtable("hell");
        chain.deleteHashtable("you");
        chain.displayHashtable();*/

        // LinearProbing chain = new LinearProbing(15);
        // chain.inserthashTable("hello");
        // chain.inserthashTable("world");
        // chain.inserthashTable("how");
        // chain.inserthashTable("are");
        // chain.inserthashTable("you");
        // chain.searchHashtable("hello");
        // chain.deleteHashtable("you");
        // chain.displayHashtable();

        QuadraticeProbing chain = new QuadraticeProbing(15);
        chain.inserthashTable("hello");
        chain.inserthashTable("world");
        chain.inserthashTable("how");
        chain.inserthashTable("are");
        chain.inserthashTable("you");
        chain.searchHashtable("you");
        chain.deleteHashtable("you");
        chain.displayHashtable();
    }
    
}
