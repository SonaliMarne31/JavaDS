package Matrix;
import java.util.*;

class SnakeGame {

    private static final int[] UP = {-1, 0};
    private static final int[] RIGHT = {0, 1};
    private static final int[] DOWN = {1, 0};
    private static final int[] LEFT = {0, -1};
    
    private static final String U = "U";
    private static final String D = "D";
    private static final String R = "R";
    
    private int x;
    private int y;
    private int w;
    private int h;
    private int c; // food count that is ate
    private int[][] food;
    boolean[][] snake;
    Deque<int[]> positions; // position of snake 
    
    public SnakeGame(int width, int height, int[][] food) {
        x = 0;
        y = 0;
        c = 0;
        w = width;
        h = height;
        this.food = food;
        snake = new boolean[h][w];
        snake[0][0] = true;
        // because we can add and remove elemnets from both side and dynamic size
        positions = new ArrayDeque();
        positions.push(new int[]{0, 0});
    }
    
    public int move(String direction) {
        int[] dir = getDirection(direction);
        x += dir[0];
        y += dir[1];
        
        // check last position and mark it as false now
        int[] last = positions.peekLast();
        snake[last[0]][last[1]] = false;
        
        // out of range conditions // End game
        if (x == -1 || y == -1 || x == h || y == w || snake[x][y])
            return -1;
        
        // mark current snake position 
        snake[x][y] = true;
        positions.addFirst(new int[]{x, y});
        
        // check if we have food, is yes, eat and increase size
        if (c < food.length && x == food[c][0] && y == food[c][1])
            ++c;
        else 
            // remove the last position as size is same
            positions.removeLast();
        
        return c;
    }
    
    private static int[] getDirection(String dir) {
        switch (dir) {
            case U:
                return UP;
            case R:
                return RIGHT;
            case D:
                return DOWN;
            default:
                return LEFT;
        }
    }

    public static void main(String args[]) {
        int[][] food = {{1,2}, {0,1}};
        SnakeGame s = new SnakeGame(3, 2, food);
        List<Integer> list = new ArrayList<>();
        int len = 1;
        list.add(null);
        len = s.move("R");
        list.add(len);
        len = s.move("D");
        list.add(len);
        len = s.move("R");
        list.add(len);
        len = s.move("U");
        list.add(len);
        len = s.move("L");
        list.add(len);
        len = s.move("U");
        list.add(len);

        System.out.println(list);


    }
}

/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */