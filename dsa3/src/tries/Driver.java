package tries;

public class Driver {

    public static void main(String[] args) {

        Tries trie = new Tries();

        trie.insertWord("Tries");
        trie.insertWord("Trie");
        trie.insertWord("Trick");
        trie.insertWord("Tricks");

        System.out.println(trie.searchWord("Trick"));
        System.out.println(trie.searchWord("Tricks"));
        System.out.println(trie.searchWord("Tri"));

        trie.delete("Trick");

        trie.printAllWords();



    }
}
