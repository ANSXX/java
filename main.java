import java.util.*;

class Main {
    static int[][] maze = {
            {0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 2}
    };

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        int[] start1 = {1, 1};
        int[] start2 = {3, 1};
        int[] start3 = {4, 3};
        int[] end = {4, 4};

        int[] shortestPaths = new int[]{dijkstra(start1, end), dijkstra(start2, end), dijkstra(start3, end)};

        int nearestMeetingCell = Arrays.stream(shortestPaths).min().getAsInt();

        System.out.println("The nearest meeting cell distance is: " + nearestMeetingCell);
    }

    static int dijkstra(int[] start, int[] end) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        Set<String> visited = new HashSet<>();
        Map<String, Integer> distance = new HashMap<>();

        pq.offer(new int[]{0, start[0], start[1]});
        distance.put(start[0] + "-" + start[1], 0);

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int dist = curr[0];
            int x = curr[1];
            int y = curr[2];

            if (x == end[0] && y == end[1]) {
                return dist;
            }

            if (visited.contains(x + "-" + y)) {
                continue;
            }

            visited.add(x + "-" + y);

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (nx >= 0 && nx < maze.length && ny >= 0 && ny < maze[0].length && maze[nx][ny] != 1) {
                    int newDist = dist + 1;
                    if (!distance.containsKey(nx + "-" + ny) || newDist < distance.get(nx + "-" + ny)) {
                        distance.put(nx + "-" + ny, newDist);
                        pq.offer(new int[]{newDist, nx, ny});
                    }
                }
            }
        }

        return Integer.MAX_VALUE;
    }
}
