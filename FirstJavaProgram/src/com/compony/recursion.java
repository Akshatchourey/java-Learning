
package com.compony;

public class recursion {
    private static int factorial(int a,int ans){
        ans=ans*a;
        if(a>1){
            a--;
            return factorial(a,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans=1;
        System.out.println(factorial(7,ans));

    }

}
