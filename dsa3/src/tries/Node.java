package tries;

import java.util.HashMap;
import java.util.Map;

public class Node {

    Map<Character,Node> characterMap;
    boolean isEndOfWord;

    public Node(){
        characterMap = new HashMap<>();
        isEndOfWord = false;
    }

}
