package day7;

public class ImplicitCasting {
    public static void main(String[] args) {
        int myInt=9;
        double myDouble =myInt;// Implicit casting - automatic conversion
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);


        int i= 100;
        long l= i;
        float f=l;
        double d= f;
        double d2=l;


        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("d2 = " + d2);







    }
}
