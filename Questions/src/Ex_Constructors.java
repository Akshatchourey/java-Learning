import java.util.*;

class Sphere{
    private int radiuss;

    public int getRadiuss() {
        return radiuss;
    }
    public void setRadiuss(int radiuss) {
        this.radiuss = radiuss;
    }
    public void dataOfSphere(){
        double sa = 4*3.1415*radiuss*radiuss;
        double v = 4*3.1415*radiuss*radiuss*radiuss/4;
        System.out.println("");
        System.out.printf("Surface area and volume of sphere is %s and %s respectively.",sa,v);
    }
}

class Cylinder{
    private int height; private int radius;
    private int length; private int breadth;

    public Cylinder(){
        setHeight(10);
        setRadius(5);
    }
    public Cylinder(int l, int b){
        length = l; breadth = b;
        System.out.printf("area of created rectangle is %d",l*b);
    }

    public int getHeight(){
        return height;
    }
    public int getRadius() {
        return radius;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public double volume(){
        return 3.1415*radius*radius*height;
    }
    public double surfaceArea(){
        return 2*3.1415*radius*(radius+height);
    }
}

public class Ex_Constructors{
    public static void shift(List<Integer> arr, int k, int n){
        List<Integer> ans = new ArrayList<>();
        while(k >= n){
            k -= n;
        }
        ans.addAll(arr.subList(n-k,n));
        ans.addAll(arr.subList(0,n-k));
        System.out.println(ans);
    }
    /*
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for(int i=0;i<testCases;i++){
            String[] arrTemp = sc.nextLine().split(" ");
            int n = Integer.parseInt(arrTemp[0]);
            int k = Integer.parseInt(arrTemp[1]);

            List<Integer> arr = new ArrayList<>();
            String[] ar = sc.nextLine().split(" ");
            for(int s=0;s<n;s++){
                arr.add(Integer.parseInt(ar[s]));
            }
            shift(arr, k, n);
        }
    }
     */

    public static void main(String[] args){
        Cylinder one = new Cylinder();
        System.out.println(one.volume());
        System.out.println(one.surfaceArea());

        Cylinder two = new Cylinder(4, 5);

        Sphere three = new Sphere();
        three.setRadiuss(5);
        three.dataOfSphere();
    }
}
