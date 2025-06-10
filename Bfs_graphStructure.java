package app;

import java.util.*;
public class Bfs_graphStructure {
    public static void main(String[] args) {
        Map<String, List<String>> z= new HashMap<>();

        z.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        z.put("Reptile House", Arrays.asList("Snake Pit"));
        z.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        z.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));

        z.put("Snake Pit", Collections.emptyList());
        z.put("Parrot Pavilion", Collections.emptyList());
        z.put("Lion Den", Collections.emptyList());
        z.put("Elephant Enclosure", Collections.emptyList());
        bfsTraversal(z, "Entrance");
    }

    public static void bfsTraversal(Map<String, List<String>> graph, String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        System.out.println("Exploring the zoo using BFS starting from " + start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Visited: " + current);
            for (String neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
