import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        // Parse the wall grid
        char[][] grid = new char[n][n];
        int sourceRow = -1, sourceCol = -1;
        int destRow = -1, destCol = -1;
        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            int col = 0;
            int j = 0;
            
            while (j < line.length() && col < n) {
                // Read the count
                int count = 0;
                while (j < line.length() && Character.isDigit(line.charAt(j))) {
                    count = count * 10 + (line.charAt(j) - '0');
                    j++;
                }
                
                // Read the brick type
                if (j < line.length() && count > 0) {
                    char brickType = line.charAt(j);
                    j++;
                    
                    // Place bricks in the grid
                    for (int k = 0; k < count && col < n; k++) {
                        grid[i][col] = brickType;
                        
                        if (brickType == 'S') {
                            sourceRow = i;
                            sourceCol = col;
                        } else if (brickType == 'D') {
                            destRow = i;
                            destCol = col;
                        }
                        col++;
                    }
                }
            }
        }
        
        // Dijkstra's algorithm to find minimum green bricks to break
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{sourceRow, sourceCol, 0});
        dist[sourceRow][sourceCol] = 0;
        
        // Direction arrays: right, left, down, up
        int[] dRow = {0, 0, 1, -1};
        int[] dCol = {1, -1, 0, 0};
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int row = current[0];
            int col = current[1];
            int bricksBroken = current[2];
            
            // Check if we reached the destination
            if (row == destRow && col == destCol) {
                System.out.println(bricksBroken);
                return;
            }
            
            // Skip if we've already found a better path to this cell
            if (bricksBroken > dist[row][col]) {
                continue;
            }
            
            // Explore all 4 adjacent cells
            for (int dir = 0; dir < 4; dir++) {
                int newRow = row + dRow[dir];
                int newCol = col + dCol[dir];
                
                // Check if the new position is valid
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                    char cell = grid[newRow][newCol];
                    
                    // Cannot pass through Red bricks
                    if (cell == 'R') {
                        continue;
                    }
                    
                    // Calculate cost: 1 for Green, 0 for Destination or Source
                    int cost = (cell == 'G') ? 1 : 0;
                    int newCost = bricksBroken + cost;
                    
                    // Update if we found a better path
                    if (newCost < dist[newRow][newCol]) {
                        dist[newRow][newCol] = newCost;
                        pq.offer(new int[]{newRow, newCol, newCost});
                    }
                }
            }
        }
        
        // If no path exists
        System.out.println(-1);
    }
}