package CH06;

import javax.xml.bind.SchemaOutputResolver;

public class Object_practice6 {
    public static void main(String[] args) {
        int n=21;
        long result =0;

        for(int i=1;i<=n;i++){
            result=factorial(i);
            System.out.println(i+"! = "+ result);
        }
        // 인스턴스 메서드라 호출 불가능
        //tmp(n);

        //인스턴스를 생성한 후 메서드 호출은 가능
        Object_practice6 op = new Object_practice6();
        op.tmp(n);
        //클래스 메서드는 인스턴스 생성 없이 메서드 호출 가능
        Object_practice6.tmp2(n);
        System.out.println(n);

    }

    //static 메서드와 인스턴스 메서드와의 차이는 static의 존재유무이다
    //static 메서드는 객체를 생성하지 않고도 클래스이름.메서드이름형식으로 호출이 가능하지만
    //인스턴스 메서드는 반드시 객체를 생성햐아만 호출할 수 있다.
    void tmp(int n){
        n=10;
    }
    static void tmp2(long n){
        n=10;
    }
    static long factorial(int n){//main 안에서 함수를 실행시키고 싶을 때는 static을 붙혀줘야 실행가능하다
        if(n<=0||n>20)return -1;//매개변수의 유효성 검사
        if(n<=1) return 1;
        else return n*factorial(n-1);
    }
}
class MyMath2 {
    long a, b;

    //인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add(){
        return a+b;
    }
    long subtract(){
        return a-b;
    }
    long multiply(){
        return a*b;
    }
    double divide(){
        return a/b;
    }
    //인스턴수 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b){
        return a+b;
    }
    static long subtract(long a,long b){
        return a-b;
    }
    static long multiply(long a,long b){
        return a*b;
    }
    static double divide(double a,double b){
        return a/b;
    }

}

class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200L,100L));

        MyMath2 mm = new MyMath2();
        mm.a=300L;
        mm.b=100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

    }
}
