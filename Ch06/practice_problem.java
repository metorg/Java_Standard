package CH06;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.bind.SchemaOutputResolver;

import static javafx.scene.input.KeyCode.K;

//1번문제
/*class SutdaCard{
    int num=(int)Math.random()*10;
    boolean isKwang;

    void SutdaCard(String s){
        if(s=="光"||s=="광"){
            isKwang =true;
        }
        else{
            isKwang = false;
        }
    }
}*/
//2번 문제
/*class SutdaCard{
    int info;

    void SutdaCard(int num,boolean b){

    }
    void SutdaCard(){
        info = 1;
    }
}*/
//3번 문제,4번,5번 문제
/*class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String a,int b,int c,int d,int e,int f){
        name=a;
        ban=b;
        no=c;
        kor=d;
        eng=e;
        math=f;
    }

    String info(){
        String info;
        info = name+" ,"+ban+" ,"+no+" ,"+kor+" ,"+eng+" ,"+math+" ,"+getTotal()+" ,"+getAverage();
        return info;
    }
    int getTotal(){
        int sum;
        sum=kor+eng+math;
        return sum;
    }
    float getAverage(){
        double avg;
        avg= (kor+eng+math)/3.0;
        return (float)(Math.round(avg*10)/10.0);
    }
}*/
//6번 문제
/*class Excercise6_6{
    //두 점 (x,y)와 (x1,y1)간의 거리를 구한다.

    static double getDistance(int x,int y,int x1,int y1){
        double sum;
        sum=Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}*/
//7번 문제
/*class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x2,int y2){
        double sum;
        sum=Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2,2));
        return sum;
    }
}*/
//8번 문제
/*class PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k,int n){
        kind = k;
        num= n;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }

    //클래스 변수 : width,height
    //인스턴스 변수 : kind,num
    //지역 변수 : k,n     틀림
    // 객체를 저장하는 변수와 메인함수에 매계변수 역시 지역변수에 해당함
    //지역 변수 : k,n,args,card
}*/
//9번 문제
/*class Marine {
    int x=0, y=0;// Maring의 위치좌표
    int hp = 60;// 현재 체력
    static int weapon = 6;//공격력
    static int armor = 0;//방어력

    static void weaponUp(){
        weapon++;
    }
    static void armorUp(){
        armor++;
    }
    void move(int x,int y){
        this.x=x;
        this.y=y;
    }
    //공격력과 방어력은 같아야 한다는 문장에서 static을 붙어야한다 또한 메서드 역시 클래스 변수를
    //사용하는 메서드에서는 static을 붙혀 클래스 메서드로 사용해야한다.
}*/
//10번 문제
//c,e 틀림 b,e 맞음
//b:생성자는 객체를 생성하기 위한 것이다
//생성자가 객체를 생성할 때 사용되기는 하지만, 객체를 초기화할 목적으로 사용되는 것
//객체를 생성하는 것은 new 연산자이다.
//11번 문제
//a,d 틀림 ,b 맞음
//b 클래스 내에서라면 어디서든 사용할 수 있다.-> 인스턴스 메서드에서만 사용가능
//12번 문제
//d 틀림 c,d 맞음
// 리턴타입은 오버로딩에 영향을 주지 못한다.
//13번 문제
//a,b,d
//14번 문제
//c,e
//15번문제
//a
//16번문제
//a 틀림 a,e
//힙 영역에는 인스턴스 변수가 생성되는 영역이며 지역변수는 호출스택(스택 영역)에 생성된다.
//17번 문제
//b
//18번 문제
//static 변수의 초기화에 인스턴스변수를 사용할 수 없다. 꼭 사용해야한다면, 객체를 생성
//static 메서드에서는 인스턴스변수를 사용할 수 없다.
//static 메서드에서는 인스턴스메서드를 사용할 수 없다.
//19번 문제
//ABC123
//After change: ABC123
//20번 문제
/*class Exercise6_20{
    static int[] shuffle(int[] arr){
        for(int i=0;i<5;i++){
            int random1 = (int)(Math.random()*arr.length)+1;
            int random2= (int)(Math.random()*arr.length)+1;
            int tmp;
            tmp=arr[random1-1];
            arr[random1-1]=arr[random2-1];
            arr[random2-1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}*/
//21번 문제
/*class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL =100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        if(isPowerOn)isPowerOn=false;
        else isPowerOn=true;
    }
    void volumeUp(){
        if(volume<MAX_VOLUME)volume++;
    }
    void volumeDown(){
        if(volume>MIN_VOLUME)volume--;
    }
    void channelUp(){
        channel++;
        if(channel>MAX_CHANNEL)channel=MIN_CHANNEL;
    }
    void channelDown(){
        channel--;
        if(channel<MIN_CHANNEL)channel=MAX_CHANNEL;
    }
}*/
/*class Exercise6_22{
    static boolean isNumber(String number){
        for(int i=0;i<number.length();i++){
            if('0'<=number.charAt(i)&&number.charAt(i)<='9'){}
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str ="123";
        System.out.println(str+"는 숫자입니까? " +isNumber(str));

        str="1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}*/
//23번 문제
/*class Exercise6_23 {
    public static int max(int[] data){
        if(data==null || data.length == 0)return -999999;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<data.length;i++){
            if(max<data[i])max=data[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] data ={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: "+max(data));
        System.out.println("최대값: "+max(null));
        System.out.println("최대값: "+max(new int[]{}));//크기가 0인 배열
    }
}*/
//24번 문제
/*class Exercise6_23{
    static int abs(int value){
        return Math.abs(value);
    }

    public static void main(String[] args) {
        int value =5;
        System.out.println(value+"의 절대값: "+abs(value));
        value = -10;
        System.out.println(value+"의 절대값: "+abs(value));
    }
}*/

public class practice_problem {
    public static void main(String[] args) {
        //1번 테스트 코드
        /*SutdaCard sc= new SutdaCard();
        sc.SutdaCard("광");
        System.out.println(sc.num+" : "+sc.isKwang);*/

        //2번 테스트 코드
        /*SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());*/

        //4번 테스트 코드
        /*Student s= new Student();
        s.name = "홍길동";
        s.ban =1;
        s.no = 1;
        s.kor =100;
        s.eng = 60;
        s.math= 76;

        System.out.println("이름: "+s.name);
        System.out.println("총점: "+s.getTotal());
        System.out.println("평균: "+s.getAverage());*/

        //5번 테스트 코드
        /*Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());*/

        //6번 테스트 코드
        //System.out.println(getDistance(1,1,2,2));

        //7번 테스트 코드
        /*MyPoint p = new MyPoint(1,1);

        //p와(2,2) 의 거리를 구한다.
        System.out.println(p.getDistance(2,2));*/
        //21번 테스트 코드
        /*MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);
        
        */
        //9번 테스트 코드
        /*Marine m =new Marine();
        m.x=4;
        m.y=6;
        System.out.println(m.weapon+" "+m.armor);
        m.weaponUp();
        System.out.println(m.weapon+" "+m.armor);
        m.armorUp();
        System.out.println(m.weapon+" "+m.armor);
        */
    }
}
