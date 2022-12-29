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
        // for countMaximum question
        currNode.count+=1;
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

    public void delete(String word){
        deleteUtil(root, 0, word);
    }

    private static boolean deleteUtil(Node node, int index, String word){
        if(index == word.length()) {
            if (node.isEndOfWord) {
                // search is success, word should be deleted now
                node.isEndOfWord = false;
                return node.characterMap.size()==0;
            }
            else{
                return false;
            }
        }
        if(!node.characterMap.containsKey(word.charAt(index)))
            return false;
        boolean shouldDelete = deleteUtil(node.characterMap.get(word.charAt(index)),index+1, word);

        if(shouldDelete){
            node.characterMap.remove(word.charAt(index));
            return node.characterMap.size()==0 && node.isEndOfWord == false;
        }
        return false;
    }
}
