public class GasStation{
    static int canCompleteCircuit(int[] gas, int[] cost){
        int idx = 0, tGas = gas[0], tCost = cost[0], temp = gas[0]-cost[0];
        for(int i=1;i<gas.length;i++){
            int a = gas[i], b = cost[i];
            tGas += a; tCost += b;
            if((a-b) >= temp+(a-b)){
                idx = i;
                temp = a-b;
            }else{
                temp += a-b;
            }
        }
        if(tGas >= tCost) return idx;
        return -1;
    }
    public static void main(String[] args){
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }
}
