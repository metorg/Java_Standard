 package CH06;

class Data1{//생성자가 아무것도 없을때는 기본생성자가 생성된다
    int value;
}

class Data2{
    int value;

    Data2(int x){//매개변수가 있는 생성자
        value= x;
    }
}

class ConstructorTest{
    public static void main(String[] args) {
        Data1 d1 = new Data1();//Data1에는 정의되어 있는 생성자가 없어 자동으로 기본생성자를 생성해서 사용
        //Data2 d2 = new Data2();//Data2에는 정의도어 있는 생성자가 존재하기 때문에 기본생성자가아닌 매개변수가 있는 생성자를 사용
    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white","auto",5);

    }
    Car(String c, String g, int d){
        color =c;
        gearType = g;
        door= d;
    }
    Car(String color){
        //생성자 내에서 다른 생성자를 호출 할때는 첫번째 줄에서만 다른 생성자를 호출 가능하다
        // 두번째로는 this를 사용해서 this(color,"auto",4); 형태로 사용해야한다
        //door=5;
        //Car(color,"auto",4);
        this(color,"auto",4);
    }
}
class CarTest2{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        System.out.println(c1.color+", "+c1.gearType+", "+c1.door);
        System.out.println(c2.color+", "+c2.gearType+", "+c2.door);
    }
}
public class Object_practice8 {
}
