public class SpirallyTraversingAMatrix{
    public static void main(String[] args){
        int n = 4; int m = 4; int k = 10;
        int[][] A = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        // right==r, left==l, top==t, bottom==b
        int l = 0; int r = m-1;
        int t = 0; int b = n-1;
        while(t <= b && l <= r){
            for(int i=l;i<=r;i++){
                k--;
                if(k == 0) System.out.println(A[t][i]);
            }t++;
            for(int i=t;i<=b;i++){
                k--;
                if(k == 0) System.out.println(A[i][r]);
            }r--;
            if(t <= b){
                for(int i=r;i>=l;i--){
                    k--;
                    if(k == 0) System.out.println(A[b][i]);
                }b--;
                for(int i=b;i>=t;i--){
                    k--;
                    if(k == 0) System.out.println(A[i][l]);
                }l++;
            }
        }
    }
}
