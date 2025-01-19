import java.util.HashMap;
import java.util.Map;

public class MaxPointsonaLine{
    static int maxPoints(int[][] points){
        int maxPoints = 0;
        for(int i=0;i<points.length;i++){
            int x2 = points[i][0], y2 = points[i][1];
            Map<Double, Integer> myMap = new HashMap<>();
            int temp2; double temp;
            for(int j=i+1;j<points.length;j++){
                if(x2-points[j][0] == 0) temp = 90;
                else if(y2-points[j][1] == 0) temp = 0;
                else temp = (float)(y2-points[j][1]) / (x2-points[j][0]);
                temp2 = myMap.getOrDefault(temp, 1) + 1;
                if(temp2 > maxPoints) maxPoints = temp2;
                myMap.put(temp, temp2);
            }
        }
        return maxPoints;
    }
    public static void main(String[] args){
        System.out.println(maxPoints(new int[][]{{1,1},{1,4},{2,3},{3,2},{4,1},{5,3}}));
    }
}
