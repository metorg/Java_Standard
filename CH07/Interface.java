package CH07;

//인터페이스란 ? 일종의 추상클래스 추상클래스처럼 추상메서드를 갖지만 추상클래스보다 추상화 정도가 높아 추상클래스와 달리 몸통을
//갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다.
// 즉 추상메서드와, 상수만을 멤버로 가질수 있다

//모든 멤버변수는 public static final 이어야하며, 생략 가능
//모든 메서드는 public abstract 이어야 하며 , 생략 가능(단 static메서드와 default메서드는 예외(jdk1.8이후부터 사용가능)
//편의상 생략가능이지 생략된 제어자는 컴파일 시 자동적으로 추가됨



interface PlayingCard{
    public static final int SPADE = 4;
    public static final int DIAMOND =3;
    int CLOVER =1;//public static final 생략
    int HEART =2;//public static final 생략

    public abstract String getCardNumber();
    String getCardKind();//public abstract 생략
}

//인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와는달리 다중상속이 가능함
interface Moveable{
    void move(int x,int y);
}
interface Attackable{
    void attack(Unit u);
}
interface Fightable extends Moveable,Attackable{//다중상속 가능 //단 인터페이스만

}

//인터페이스는 구현한다는 의미의 키워드 implements 를 사용
//메서드 중 일부만 구현한다면 abstract를 붙여서 추상클래스로 선언
/*abstract class Fighter implements Fightable{
    public void move(int x,int y){}//attack을 구현하지 않았기 때문에 abstract를 붙혀서 추상클래스로 선언
}*/
//tip : 인터페이스의 이름에는 주로 "~을 할수 있다" 의미인 able이 많다
//오버라이딩 할때 조상의 메서드보다 넓은 범위의 접근 제어자를 지정해야 한다
//즉 인터페이스는 메서드를 만들때 public abstract가 생략되어 있기 때문에 반드시 자손에서 public을 사용해서 구현해야한다
//리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환하다 꼭 기억하기


class FighterTest{
    public static void main(String[] args) {
        Fighter f = new Fighter(4);

        if(f instanceof  Unit)
            System.out.println("f는 Unit클래스의 자손입니다");
        if(f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스를 구현했습니다");
        if(f instanceof Moveable)
            System.out.println("f는 Moveable인터페이스를 구현했습니다");
        if(f instanceof Attackable)
            System.out.println("f는 Attackable인터페이스를 구현했습니다");
        if(f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다");
    }//main

}
/*class Unit{
    int currentHp;
    int x;
    int y;
}*/

public class Interface {
}
//인터페이스의 장점
//1.개발시간을 단축 2.표준화 가능 3.서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다. 4.독립적인 프로그래밍이 가능

//인터페이스의 활용
class RepairableTest{
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine2 marine = new Marine2();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        //scv.repair(marine);//오류 마린은 repair 매계변수인 repairable 인터페이스를 상속받고 있지 않기때문에 수리 불가
    }
}
interface Repairable{}

class Unit{
    int hitPoint;
    final int MAX_HP;
    Unit(int hp){
        MAX_HP =hp;
    }

}
class Fighter extends Unit implements Fightable{

    Fighter(int hp) {
        super(hp);
    }

    public void move(int x, int y){}
    public void attack(Unit u){}
}

class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint=MAX_HP;
    }

    public String toString(){
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Dropship";
    }
}

class Marine2 extends GroundUnit{//Repairable을 상속받지 않았기 때문에 리페어 불가
    Marine2(){
        super(40);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Marine";
    }
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r){
        if (r instanceof Unit){
            Unit u = (Unit)r;
            while(u.hitPoint!=u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다");
        }
    }
}
