package tries;

// Given a trie having some words inside it, return the word having maximum occurrences inside the trie.
// Ex: {cake, christmas, cake, chocolates, cake, christmas}
// O/P: cake

public class CountMaximum {

    static int maxCount = 0;
    static String mostFrequentWord="";

    public static void main(String[] args) {

        Tries trie = new Tries();
        trie.insertWord("cake");
        trie.insertWord("cake");
        trie.insertWord("christmas");
        trie.insertWord("chocolates");
        trie.insertWord("cake");
        trie.insertWord("christmas");

        System.out.println(dfs(trie.root, ""));
    }

    public static String dfs(Node node, String word) {
        if (node.isEndOfWord) {
            if (maxCount < node.count) {
                maxCount = node.count;
                mostFrequentWord = word;
            }
        }

        for (char ch : node.characterMap.keySet()) {
             dfs(node.characterMap.get(ch), word + ch);
        }
        return mostFrequentWord;
    }
}
