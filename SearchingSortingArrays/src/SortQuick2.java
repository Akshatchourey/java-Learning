// In ArrayList<Integer> ... pivot--> end, middle, start, random

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SortQuick2{
    static ArrayList<Integer> sortPivotRandom(ArrayList<Integer> arr){
        if(arr.size() == 0 || arr.size() == 1){return arr;}
        int i = 0;
        Random random = new Random();
        int randomIdx = random.nextInt(1,arr.size()); int randomE = arr.get(randomIdx);
        for(int u=0;u<arr.size();u++){
            if(i == randomIdx){i++;}
            if(arr.get(u) <= randomE && u != randomIdx){
                int no = arr.get(u);
                arr.set(u, arr.get(i));
                arr.set(i, no);
                i++;
            }
        }
        if(i > randomIdx){i--;}
        int no = arr.get(i);
        arr.set(i, randomE);
        arr.set(randomIdx, no);
        i++;

        ArrayList<Integer> A = new ArrayList<>(arr.subList(0,i-1));
        ArrayList<Integer> B = new ArrayList<>(arr.subList(i,arr.size()));
        A = sortPivotMid(A);
        B = sortPivotMid(B);
        A.add(randomE); A.addAll(B);

        return A;
    }
    static ArrayList<Integer> sortPivotMid(ArrayList<Integer> arr){
        if(arr.size() == 0 || arr.size() == 1){return arr;}
        int i = 0; int midIdx = Math.round((float)arr.size()/2); int midE = arr.get(midIdx);
        for(int u=0;u<arr.size();u++){
            if(i == midIdx){i++;}
            if(arr.get(u) <= midE && u != midIdx){
                int no = arr.get(u);
                arr.set(u, arr.get(i));
                arr.set(i, no);
                i++;
            }
        }
        if(i > midIdx){i--;}
        int no = arr.get(i);
        arr.set(i, midE);
        arr.set(midIdx, no);
        i++;

        ArrayList<Integer> A = new ArrayList<>(arr.subList(0,i-1));
        ArrayList<Integer> B = new ArrayList<>(arr.subList(i,arr.size()));
        A = sortPivotMid(A);
        B = sortPivotMid(B);
        A.add(midE); A.addAll(B);

        return A;
    }
    static ArrayList<Integer> sortPivotEnd(ArrayList<Integer> arr){
        if(arr.size() == 0 || arr.size() == 1){return arr;}
        int i = 0; int lastE = arr.get(arr.size()-1);
        for(int u=0;u<arr.size();u++){
            if(arr.get(u) <= lastE){
                int no = arr.get(u);
                arr.set(u, arr.get(i));
                arr.set(i, no);
                i++;
            }
        }
        ArrayList<Integer> A = new ArrayList<>(arr.subList(0,i-1));
        ArrayList<Integer> B = new ArrayList<>(arr.subList(i,arr.size()));
        A = sortPivotEnd(A);
        B = sortPivotEnd(B);
        A.add(lastE); A.addAll(B);
        return A;
    }
    static ArrayList<Integer> sortPivotStart(ArrayList<Integer> arr){
        if(arr.size() == 0 || arr.size() == 1){return arr;}
        int i = 1; int startE = arr.get(0);
        for(int u=1;u<arr.size();u++){
            if(arr.get(u) <= startE){
                int no = arr.get(u);
                arr.set(u, arr.get(i));
                arr.set(i, no);
                i++;
            }
        }
        i--;
        int no = arr.get(i);
        arr.set(i, startE);
        arr.set(0, no);
        i++;
        ArrayList<Integer> A = new ArrayList<>(arr.subList(0,i-1));
        ArrayList<Integer> B = new ArrayList<>(arr.subList(i,arr.size()));
        A = sortPivotStart(A);
        B = sortPivotStart(B);
        A.add(startE); A.addAll(B);
        return A;
    }

    public static void main(String[] args){
        ArrayList<Integer> asq = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- "); int n = sc.nextInt();
        System.out.printf("Now enter %d numbers:- ", n);
        for(int i=0;i<n;i++){
            asq.add(sc.nextInt());
        }
        System.out.println(sortPivotEnd(asq));
        System.out.println(sortPivotMid(asq));
        System.out.println(sortPivotStart(asq));
        System.out.println(sortPivotRandom(asq));
    }
}
