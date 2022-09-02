package CH06;

class Tv{
    //멤버변수
    int channel;
    String color;
    boolean power;
    //메서드
    void power(){
        power=!power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

class TvTest3{
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t1.channel=7;
        t2.channel=8;
        System.out.println(t1.channel);//7
        System.out.println(t2.channel);//8
        t1=t2;//t2의 인스턴스 주소를 t1의 대입 t1이 가지고 있던 인스턴스 주소는 삭제되고 t2와 같은 주소값을 바라보게 된다.
        // t1 참조변수는 더이상 가지고 있는 인스턴스가 없기 떄문에 가비지 컬렉터에 의해서 자동적으로 메모리에서 제거된다.
        // 둘 이상의 참조변수는 하나의 인스턴스를 가리키는 것은 가능하지만 하나의 참조변수로 여러개의 인스턴스를 가리키는 것은 불가능
        System.out.println(t1.channel);//8
        System.out.println(t2.channel);//8
        t2.channel=10;
        System.out.println(t1.channel);//10
        System.out.println(t2.channel);//10

    }
}
class TvTest4{
    public static void main(String[] args) {
        //Tv 객체배열 선언
        Tv[] tvArr = new Tv[3];
        //객체를 생성해서 객체배열의 각 요소에 저장을 해야 각 객체배열마다 Tv 멤버변수 ,메서드를 사용가능하다
        for(int i=0;i<tvArr.length;i++){
            tvArr[i]=new Tv();
            tvArr[i].channel= i+7;
        }

        for(int i=0;i<tvArr.length;i++){
            System.out.println(tvArr[i].channel);
        }
    }
}
public class Object_practice1 {
    public static void main(String[] args) {

        Tv t;//TV 클래스를 참조하기 위한 참조변수 선언
        t= new Tv();//TV 인스턴스를 생성한 후 , 생성된 TV인스턴스의 주소를 T에 저장
        t.channel = 7; //TV 인스턴스 멤버변수 channel의 값을 7로 선언
        t.channelDown();// TV 인스턴스 메서드 호출
        System.out.println("현재 채널은 "+t.channel + "입니다");

    }
}
