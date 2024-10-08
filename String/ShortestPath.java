package String;
import java.util.*;
public class ShortestPath {
    public static float getPath(String str){
        int n = str.length();
        int x = 0;
        int y = 0;
        for(int i = 0;i<n;i++){
            char dir = str.charAt(i);
            //SOUTH
            if(dir == 'S'){
                y--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='E') {
                x++;
            }else{
                x--;
            }
        }
        int x2 = (x*x);
        int y2 = (y*y);
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Shortest path to reach the destination");
        System.out.println(getPath(str));
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
