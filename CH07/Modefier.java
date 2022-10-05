package CH07;

//제어자란 ? 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여한다.
//static - 클래스의, 공톡적인
//static이 사용될 수 있는 곳 - 멤버변수, 메서드 , 초기화 블럭
//인스턴스 메서드에서는 스태틱 변수 사용 불가
class StaticTest{
    static int width = 200; //클래스 변수
    static int height = 120;

    int tall =300;
    static{   //클래스 초기화 블록

    }

    static int max(int a, int b){//클래스 메서드(static 메서드)
        return a>b ? a: b;
    }

    void max(){
        width++;
    }
}

//final - 마지막의, 변경될 수 없는
//메서드에 사용되면 오버라이딩 불가
//변수에 사용하면 값 변경 불가
//클래스에 사용되면 자손클래스를 정의 못함
//final이 사용될 수 있는 곳- ㅡ클래스,메서드,멤버변수,지역변수
final class FinalTest{//조상이 될 수 없는 클래스
    final int MAX_SIZE =10;//값을 변경할 수 없는 멤버변수

    final int getMaxSize(){//오버라이디 할수 없는 메서드(변경불가)
        final int LV = MAX_SIZE;//값을 변경할 수 없는 지역변수
        return MAX_SIZE;
    }
    void max(){
        //MAX_SIZE++;//변경 불가
    }
}
//abstract- 추상의, 미완성의
//메서드의 선언부만 작성하고 실제수행내용은 구현하지 않은 추상 메서드를 선언하는데 사용된다.
class Card{
    final int NUMBER;   //상수지만 선언과 함께 초기화 하지 않고
    final String KIND;  //생성장에서 단 한번만 초기화 할 수 있다.
                        //생성된 이후에는 값을 변경 불가능하다

    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card(){
        this("HEART",1);
    }

    public String toString(){
        return KIND +" "+NUMBER;
    }
}
//접근 제어자
//private : 같은 클래스 내에서만 접근이 가능
//default : 같은 패키지 내에서만 접근이 가능하다.
//protected : 같은 패기지 내에서 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
//public : 접근 제한이 전혀 없다.
//public> protected > default> private

//접근제어자를 사용하는 이유?
//외부로부터 데이터를 보호
//외부에는 불필요한,내부적으로만 사용되는,부분을 감추기 위해서
class Time{
    private int hour;//접근제어자를 private으로 하여 외부에서 직접 접근하지 못하도록
    private int minute;
    private int second;

    public int getHour() {return hour;}
    public void setHour(int hour){
        if(hour<0||hour>23)return;
        this.hour = hour;
    }
    public int getMinute(){return minute; }
    public void setMinute(int minute){
        if (minute <0||minute >59)return;
        this.minute = minute;
    }
    public int getSecond(){return second;}
    public void setSecond(int second){
        if(second<0||second>59)return;
        this.second = second;
    }
}
final class Singleton{
     static Singleton s = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(s==null) s=new Singleton();
        return s;
    }
}


public class Modefier {
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        st.width =300;
        st.max();
        System.out.println(st.width);

        Card c = new Card("HEART",10);
        System.out.println(c.KIND+" "+c.NUMBER);
        Card a = new Card();
        System.out.println(a.KIND+" "+a.NUMBER);

        //접근 제어자
        Time t = new Time();
        //t.hour=10;//private으로 설정하여 직접 접근 불가
        t.setHour(25);//25인 값이 유효성 검사를 통과하지 못하여 기본값 0이 출력된다
        System.out.println(t.getHour());
        t.setHour(22);
        System.out.println(t.getHour());


        // Singleton s = new Singleton();//생성자가 private 임으로 외부 클래스에서 직접 생성자를 생성 불가
        Singleton s = Singleton.getInstance();
    }
}
//제어자를 조합할때 주의 해야할 점
// 메서드에 static과 abstract를 함께 사용할 수 없다
// 클래스에 abstract와 final을 동시에 사용할 수 없다
// abstract 메서드의 접근 제어자가 private일 수 없다
// 메서드에 private 와 final을 같이 사용할 필요는 없다

