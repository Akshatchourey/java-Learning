import com.akshat.AccessModifier2;

class Class2 extends AccessModifier2{
    void meth2(){
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c); sub class error intended.
    }
}
public class AssModWorld{
    public static void main(String[] args){
        Class2 two = new Class2();
        System.out.println("extend class error, c = default property cannot be accessed.");
        two.meth2();
        AccessModifier2 check = new AccessModifier2();
        System.out.println("error due to protected property cannot be accessed.");
        System.out.println(check.a);
        // System.out.println(check.b); error due to protected property cannot be accessed.
    }

}
