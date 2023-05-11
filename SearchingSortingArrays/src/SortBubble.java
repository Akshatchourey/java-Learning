import java.util.ArrayList;

public class SortBubble {
    static ArrayList<Integer> sortPl(ArrayList<Integer> arr, int time){
        if(time == 0){return arr;}
        for(int j=0;j<time;j++){
            if(arr.get(j) > arr.get(j+1)){
                int no = arr.get(j);
                arr.set(j,arr.get(j+1));
                arr.set(j+1,no);
            }
        }
        return sortPl(arr,time-1);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);arr.add(1);arr.add(3);arr.add(9);arr.add(7);arr.add(0);arr.add(100);arr.add(-2);arr.add(-5);
        // sort by for loops
//        for(int i=arr.size();i>0;i--){
//            for(int j=0;j<i-1;j++){
//                if(arr.get(j) > arr.get(j+1)){
//                    int no = arr.get(j);
//                    arr.set(j,arr.get(j+1));
//                    arr.set(j+1,no);
//                }
//            }
//        }
        System.out.println(arr);

        // sort by recursion
        System.out.println(sortPl(arr,arr.size()-1));
    }
}
