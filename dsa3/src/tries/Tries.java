package tries;

public class Tries {

    Node root;

    public Tries() {
        root = new Node();
    }

    public void insertWord(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!currNode.characterMap.containsKey(ch)) {
                currNode.characterMap.put(ch, new Node());
            }
            currNode = currNode.characterMap.get(ch);
        }
        currNode.isEndOfWord = true;
    }

    public boolean searchWord(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!currNode.characterMap.containsKey(ch))
                return false;
            currNode = currNode.characterMap.get(ch);
        }
        if (currNode.isEndOfWord)
            return true;
        return false;
    }

    public void printAllWords(){
        dfsUtil(root,"");
    }

    private void dfsUtil(Node node, String wordSoFar){
        if(node.isEndOfWord)
        {
            System.out.println(wordSoFar);
        }

        for(char ch: node.characterMap.keySet()){
            dfsUtil(node.characterMap.get(ch),wordSoFar+ch);
        }
    }
}
