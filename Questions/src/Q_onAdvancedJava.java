import javax.swing.plaf.SplitPaneUI;
import java.io.File;
import java.io.FileWriter;

class MyDeprecated {
    @Deprecated
    public void add(int a, int b){
        System.out.println(a + b);
    }
}
interface ExInterface{
    public void print();
}

public class Q_onAdvancedJava{
    // Gold in the next line
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        // Q2
        MyDeprecated d1 = new MyDeprecated();
        d1.add(6,8);
        // Q4
        ExInterface obj = ()->{System.out.println("Instance of Ex Interface is successfully created.");};
        obj.print();

        // Q5
        /*
        File myFile = new File("multiplication.txt");
        try {
            myFile.createNewFile();
        }catch(Exception e){
            System.out.println(e.toString());
        }*/
        int n = 9;
        String line;
        try {
            FileWriter fileWriter = new FileWriter("multiplication.txt");
            for(int i=1;i<11;i++){
                line = n + "x" + i + "=" + n*i;
                fileWriter.write(line + "\n");
            }
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
