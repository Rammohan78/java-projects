package app;
import java.util.*;

public class DFS_Simple_Example {
    private Map<String, List<String>> homeMap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homeMap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()); 
    }
    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) return;

        visited.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for (String neighbor : homeMap.getOrDefault(currentRoom, Collections.emptyList())) {
            dfs(neighbor);
        }
    }
    public static void main(String[] args) {
        DFS_Simple_Example home = new DFS_Simple_Example();

        home.addRoom("living room", "kitchen");
        home.addRoom("living room", "bedroom");
        home.addRoom("bedroom", "bathroom");

        System.out.println("DFS traversal from living room:");
        home.dfs("living room");
    }
}
