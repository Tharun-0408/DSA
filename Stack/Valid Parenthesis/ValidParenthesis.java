class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  // instantiate stack
        Map<Character, Character> map = new HashMap<>(); // instantiate HashMap
        // map the opening(key) and closing(value) parenthesis as key value pairs
        map.put(')','(');  
        map.put(']','[');
        map.put('}','{');

        for(char c : s.toCharArray()){  // convert the string into a character array
            if(map.containsKey(c)){  // check if the map contains the key(closing parenthesis)
                if(!stack.isEmpty() && stack.peek() == map.get(c)){  // if stack is empty and peek the top of the stack to check if it's equal to the value, i.e closing parenthesis 
                    stack.pop(); // then pop the closing parenthesis from top
                }
                else{
                    return false; // if conditions don't satisfy, then return false
                }
            }
            else{
                stack.push(c); 
            }
        }

        return stack.isEmpty();

        
    }
}
