## My thoughts and findings while solving the problem
1. I used a HashMap to solve the problem which stored both key and value, i.e, both the array element and the index. Found a better way on ChatGPT, i.e, to use a HashSet instead because I need to check whether the element exists or not and nothing else.
2. I had a doubt regarding which one of the two; array element or index, should be stored as the key in the HashMap. Found out that it is recommended to store the array element as key since keys are unique.
3. I was confused if I should check for the key or value while using the map.containsKey() method.
4. I wanted to use the modified for loop, i.e, for(arrElement : array) and use it in the HashMap but learnt that I cannot use it because I need both the index and array element for the HashMap but the modified for loop does not give me the index of the element.
5. I was confused if I should Map <K, V> or HashMap <K, V>. Both work fine but using Map <K, V> would make it easier to switch implementation to other classes.
6. Map is an interface. HashMap is the class that implements the interface.
