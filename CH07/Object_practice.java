package CH07;

class Parent{
    int age=10;
}

class Child extends Parent{
    int weight = 60;
}

class GrandChild extends Child{
    int tall = 173;
}
class Tv {
    boolean power;
    int channel;

    void power(){
        power=!power;
    };
    void channelUp(){
        ++channel;
    };
    void channelDown(){
        --channel;
    };
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
public class Object_practice {
    public static void main(String[] args) {
        Child ch = new Child();
        Parent pr = new Parent();
        GrandChild gc = new GrandChild();
        System.out.println(ch.age);
        System.out.println(gc.age);
        //System.out.println(pr.weight);//부모는 자손의 인스턴스 변수를 사용 불가능

        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        System.out.println(ctv.caption);
        ctv.displayCaption("Hello,World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}
