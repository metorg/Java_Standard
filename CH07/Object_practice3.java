package CH07;
//오버라이딩의 조건
//조상 클래스의 메서드와 이름,매개변수,반환타입이 같아야한다.
//접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 가능하다
//조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
//조상 클래스의 예외처리에 포함되는 예외 처리만 가능하다

import java.io.IOException;
import java.sql.SQLException;


class Parent2{
    void parentMethod() throws IOException{

    }
}

class Child2 extends Parent2{
    /*void parentMethod() throws SQLException {//조상 클래스의 포함되지 않은 예외처리임으로 불가능

    }*/
}

class SuperParent{
    int x=10;
    int y=30;

    SuperParent(int x,int y){
        this.x=x;
        this.y=y;
    }
    String getLocation(){
        return "x: "+x+"y: "+y;
    }
}

// super()- 조상 클래스의 생성자 = 자손의 멤버와 조상의 멤버가 모두 합쳐진 하나의 인스턴스를 생성함
// 결국의 최고 조상은 Object() 클래스 이다
class SuperChild extends SuperParent{
    int x=20;
    int z=40;

    SuperChild(int x, int y,int z){//생성자 첫줄에서 다른 생성자를 호출하지 않기 때문에 super를 삽입한다
        super(x,y);// 조상클래스의 생서장 Point(int x,int y)를 호출한다
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void method(){
        //똑같의 정의된 인스턴스 변수지만 super,this를 통하여 조상 인스턴스 변수,자식 인스턴스 변수를 구별 가능
        System.out.println(super.x);//조상 인스턴스
        System.out.println(this.x);//자식 인스턴스
        //하나만 정의 되어 있을때는 this==super 와 같다 볼수 있음
        System.out.println(super.y);
        System.out.println(this.y);
        //자식의만 정의된 인스턴스 변수는 super 사용 불가능
        //System.out.println(super.z);//오류
        System.out.println(this.z);
    }

    //메서드 역시드 똑같이 super 사용 가능
    String getLocation(){//오버라이딩
        return super.getLocation();//조상 메서드 사용
    }


}

public class Object_practice3 {
    public static void main(String[] args) {

        SuperChild sc = new SuperChild(1,2,3);
        sc.method();
        System.out.println(sc.getLocation());
    }
}
