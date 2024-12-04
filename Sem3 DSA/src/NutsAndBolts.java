public class NutsAndBolts{
    public static void main(String[] args){
        int n = 5;
        char[] nuts = {'@', '%', '$', '#', '^'};
        char[] bolts = {'%', '@', '#', '$', '^'};

        int j; char temp;
        for(int i=1;i<n;i++){
            j = i;
            while(j>0 && '0'-nuts[j] > '0'-nuts[j-1]){
                temp = nuts[j];
                nuts[j] = nuts[j-1];
                nuts[j-1] = temp;
                j--;
            }
        }

        bolts = nuts;
        for(char k:nuts) System.out.print(k + " ");
        for(char k:bolts) System.out.print(k + " ");
    }
}
