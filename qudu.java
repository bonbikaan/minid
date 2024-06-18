public class StateStorage {

    // Assuming the state is stored as a Map of String keys to Object values
    private Map<String, Object> stateMap;

    public StateStorage() {
        stateMap = new HashMap<>();
    }

    // Method to retrieve state by key
    public Object getState(String key) {
        return stateMap.get(key);
    }

    // Method to set state by key
    public void setState(String key, Object value) {
        stateMap.put(key, value);
    }

    // Method to check if the state contains a key
    public boolean containsState(String key) {
        return stateMap.containsKey(key);
    }

    // Method to remove state by key
    public void removeState(String key) {
        stateMap.remove(key);
    }

    // Method to get all stored states
    public Map<String, Object> getAllStates() {
        return new HashMap<>(stateMap);
    }
}
