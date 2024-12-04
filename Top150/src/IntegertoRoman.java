public class IntegertoRoman{
    static String intToRoman(int num){
        int idx = 0;
        StringBuilder ans = new StringBuilder("");
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] asq = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(num != 0){
            for(int i=idx;i< arr.length;i++){
                if(num >= arr[i]){
                    num -= arr[i];
                    ans.append(asq[i]);
                    idx = i;
                    break;
                }
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(intToRoman(3999));
    }
}
