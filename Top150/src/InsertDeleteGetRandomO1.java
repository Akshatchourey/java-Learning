import java.util.ArrayList;
import java.util.Random;

class RandomizedSet{
    ArrayList<Integer> arr;
    Random random = new Random();
    public RandomizedSet(){
        arr = new ArrayList<>();
    }
    public boolean insert(int val){
        if(arr.contains(val)) return false;
        arr.add(val);
        return true;
    }
    public boolean remove(int val){
        if(!arr.contains(val)) return false;
        arr.remove((Integer) val);
        return true;
    }
    public int getRandom(){
        return arr.get(random.nextInt(arr.size()));
    }
}

public class InsertDeleteGetRandomO1{
    public static void main(String[] args){

    }
}
