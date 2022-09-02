package CH06;
class Time {
    //제어자를 이용해서 변수의 값을 직접 변경하지 못하도록 선언
    private int hour;
    private int minute;
    private float second;

    //메서드를 통해서 값을 변경하도록 작성
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public float getSecond() {
        return second;
    }
    //지정된 값의 유효성을 조건문으로 점검한 후 유효한 값일 경우에만 변경 가능
    public void setHour(int h) {
        if(h<0||h>23)return;
        hour= h;
    }
    public void setMinute(int m){
        if(m<0||m>59)return;
        minute = m;
    }
    public void setSecond(float s){
        if(s<0.0f||s>59.99f)return;
        second =s;
    }
}
public class Object_practice2 {
    public static void main(String[] args) {
        Time t= new Time();
        t.setHour(25);//유효성을 통과하지 못했기 떄문에 초기값 0으로 출력
        t.setMinute(40); //유효성 검사를 통과했기 때문에 변경된 값 40 적용
        t.setSecond(17.3f);//유효성 검사를 통과했기 때문에 변경된 값 17.3 적용
        System.out.println("시 :"+t.getHour()+" 분 :"+t.getMinute()+"초 :"+t.getSecond());
    }
}
