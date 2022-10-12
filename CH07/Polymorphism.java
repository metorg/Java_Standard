package CH07;
//다형성이란 ? 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조 할 수 있도록 하였다
// 자손타입의 참조변수로 조상타입의 인스턴스를 참조 할 수 없다.
// 잘 모르겠다 솔직히
class Tv2{
    boolean power;
    int channel;

    void power(){power =!power;}
    void channelUp(){ ++channel;}
    void channelDown(){--channel;}
}

class CaptionTv2 extends Tv2{
    String text;
    void caption(){

    }
}


//참조 변수의 형변환
//자식간의 형변환 불가
class Car3{
    String color;
    int door;
    void drive(){//운전하는 기능
        System.out.println("drive, Brrrr-");
    }
    void stop(){//멈추는 기능
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car3{// 소방차
    void water() {//물뿌리는 기능
        System.out.println("water!!!");
    }
}
class Ambulance extends Car3{//앰뷸런스
    void siren(){//사이렌을 울리는 기능
        System.out.println("siren~~~");
    }
}
class polymorphism {
    public static void main(String[] args) {
        CaptionTv2 c = new CaptionTv2();
        Tv2 t = new CaptionTv2();

        System.out.println(c.text);
        //System.out.println(t.text);조상타입의 참조변수는 자손타입의 멤버변수를 포함하고 있지 않다.

        Car3 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;//

        car = fe;//car = (Car)fe;에서 형변환 생략됨, 업캐스팅 자식->부모
        fe2 = (FireEngine)car;//형변환을 생략불가. 다운 캐스팅 부모->자식

        //궁금한 점 위에 자식 참조변수를 만든 후에 부모를 자식으로 형변환할꺼면 굳이 저렇게 할 필요가 있을까?
        //중요한 점 참조변수는 참조변수일 뿐 그 내부에 인스턴스의 타입을 잘 확인할 것

        FireEngine f = new FireEngine();
        Car3 fd = new Car3();
        Car3 fg = null;
        if(f instanceof FireEngine){
            System.out.println("This is a FireEngine instance.");
        }
        if(f instanceof Car3){
            System.out.println("This is a Car instance");
        }
        if(f instanceof Object){
            System.out.println("This is an Object instance");
        }
        System.out.println(f.getClass().getName());


        //Car3는 FireEngine에 멤버를 사용할 수 없기때문에 참조값이 False다
        //False이면 형변환이 불가능하다는 것
        if(fd instanceof FireEngine){
            System.out.println("This is a FireEngine instance.");
        }
        if(fd instanceof Car3){
            System.out.println("This is a Car instance");
        }
        if(fd instanceof Object){
            System.out.println("This is an Object instance");
        }

        if(fg instanceof FireEngine){
            System.out.println("This is a FireEngine instance.");
        }
        if(fg instanceof Car3){
            System.out.println("This is a Car instance");
        }
        if(fg instanceof Object){
            System.out.println("This is an Object instance");
        }
    }
}
