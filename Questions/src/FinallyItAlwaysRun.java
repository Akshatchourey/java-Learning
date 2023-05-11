public class FinallyItAlwaysRun{
    public static int great(){
        try{
            int a = 50;
            int b = 10;
            return a/b;
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            System.out.println("Clearing up thr resources...This is the end if the function, But still finally is running.");
        }
        return -1;
    }
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            try{
                if(i == 6){
                    break;
                }
                // throw new Exception();
                 System.out.println("try is running with no " + i);
            }catch(Exception e){
                System.out.println(e.getMessage() + i);
            }
            finally{
                System.out.println("finally is running with no " + i);
            }
        }
        System.out.println(great());
    }
}