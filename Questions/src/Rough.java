import java.util.*;

public class Rough {
    /*
    static int avg(int ...arr){
        int a= arr.length;
        int sum=0;
        for(int b:arr){
            sum += b;
        }
        return sum/a;
    }
    public static void main(String[] args) {
        System.out.println(avg(8,6,7,4,5));
    }
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the no:");float n = sc.nextFloat();

        int end = 0;int start = 0;
        String s = sc.nextLine();
        LinkedList<String> arr = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            arr.add(String. valueOf(s.charAt(i)));
        }
        while(arr.contains("/")) {
            start = arr.lastIndexOf("/");
            end = arr.indexOf("\\");
            LinkedList<String> temp = new LinkedList<>();
            for (int i = end - 1; i > start; i--) {
                temp.add(arr.get(i));
            }
            for(int j=0;j<end-start+1;j++){
                arr.remove(start);
            }
            arr.addAll(start, temp);
        }
        for(String k : arr) {System.out.print(k);}
    }
}
