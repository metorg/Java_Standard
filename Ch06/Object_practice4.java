package CH06;

import javax.xml.bind.SchemaOutputResolver;

class MyMath{

    long add(long a, long b){
        return a+b;
    }

    static long subtract(long a,long b){
        return a-b;
    }

    long multiply(long a,long b){
        return a*b;
    }

    double devide(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        MyMath mm= new MyMath();
        long value =mm.add(1L,2L);
        long value2 = mm.subtract(1L,2L);
        System.out.println(value+" "+value2);
    }

}

public class Object_practice4 {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long value =mm.add(1L,2L);
        System.out.println(value);
    }
}
