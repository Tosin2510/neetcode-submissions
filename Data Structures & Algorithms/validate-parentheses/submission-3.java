class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> sList = new LinkedList<>();
        for (int i=0; i<s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '[' ) {
                sList.push(currentCharacter);
            }

            else {
                if (sList.isEmpty()) {
                    return false;
                }

            char topOfStack = sList.pop();
            if (currentCharacter == ')' && topOfStack != '(') {
                return false;
            }
            if (currentCharacter == '}' && topOfStack != '{') {
                return false;
            }
            if (currentCharacter == ']' && topOfStack != '[') {
                return false;
            }
        }
        }
        

        return sList.isEmpty();
    }
}
