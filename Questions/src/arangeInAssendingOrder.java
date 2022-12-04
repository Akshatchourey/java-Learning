//Program to arange n no in increasing order.

import java.util.Scanner;
public class arangeInAssendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int [] no= new int [size];

        for(int h=0;h<size;h++){
            no[h]=sc.nextInt();
        }
        //int [] no={1,15,263,68,0,8};
        for(int i=0;i<no.length;i++){
            int j=i;
            while (j != no.length){
                if (no[j] < no[i]) {
                    int a = no[j];
                    int b = no[i];
                    no[i] = a;
                    no[j] = b;
                }
                j++;
            }
        }
        for(int k:no){
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.print("Thx,have a good day.");
    }
}
