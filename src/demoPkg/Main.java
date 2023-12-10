package demoPkg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       System.out.println("Hello world");
       MyClass mc=new MyClass(5,6);
       System.out.println(mc.getX()+mc.getY());
    }
}