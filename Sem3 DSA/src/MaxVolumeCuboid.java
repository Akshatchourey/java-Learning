public class MaxVolumeCuboid{
    public static void main(String[] args){
        double a = 15, p = 22;
        double l = (p - (Math.sqrt(Math.pow(p, 2) - 24*a)))/12;
        double h = (p/4)-2*l;
        // double ans = (a*l/2) - (p*Math.pow(l, 2)/4) + Math.pow(l, 3); // Formula...
        System.out.println(Math.round(l*l*h*100)/100.0);
    }
}
