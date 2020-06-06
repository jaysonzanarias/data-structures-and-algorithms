package recursion;

public class TowerOfHanoi {
    StringBuilder sb = new StringBuilder();

    public String move(int n, char source, char destination, char intermediary) {
        if (1 == n) {
            sb.append("Move: " + 1 + " from " + source + " to " + destination + ". \n");
        } else {
            move(n - 1, source, intermediary, destination);
            sb.append("Move: " + n + " from " + source + " to " + destination + ". \n");
            move(n - 1, intermediary, destination, source);
        }
        return sb.toString();
    }
}
