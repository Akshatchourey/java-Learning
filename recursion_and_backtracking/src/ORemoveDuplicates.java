public class ORemoveDuplicates {
    public static boolean[] map= new boolean[26];
    public static void removeDup(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            System.out.println(newString.length());
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']){
            removeDup(str,idx+1,newString);
        }else{
            newString += currchar;
            map[currchar-'a']=true;
            removeDup(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        String given="abcdefghijklmnopqrstuvwxyz";
        System.out.println(given.length());
        removeDup(given,0,"");
    }
}
