class TimeMap {

    private Map<String, List<Pair<Integer, String>>> store;
    record Pair<K, V>(K key, V value){} // immutable pair of key, value along with getters
    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
         // if the key is absent, then new arraylist is created; the timestamp and value is mapped to it
        // if the key already exists, then the Pair is appended to the key
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> values = store.getOrDefault(key, new ArrayList<>());
        int left = 0, right = values.size() - 1;
        String result = "";
        while(left <= right){
            int mid = (left + right) / 2;
            if(values.get(mid).key() <= timestamp){ // checks for the timestamp <= query timestamp
                result = values.get(mid).value(); // updates the result with the most recent valid timestamp
                left = mid + 1; 
            }
            else
                right = mid - 1;
        }

        return result;
        
    }

}
