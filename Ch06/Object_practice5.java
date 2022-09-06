package CH06;

class Data{
    int x;
}

public class Object_practice5 {
    public static void main(String[] args) {
        //기본형은 값을 수정해도 변하지 않지만 참조형은 주소값을 참조함으로 값이 변한다
        Data d= new Data();
        int[] arr= {10};
        d.x=10;
        System.out.println("before main() : x ="+d.x);
        System.out.println("before main(배열) : arr ="+arr[0]);
        change(d.x);
        System.out.println("메서드(기본형) main() : x ="+d.x);
        change2(d);
        System.out.println("메서드(참조형) main() : x ="+d.x);
        change3(arr);
        System.out.println("메서드(배열) main() : arr ="+arr[0]           );

    }
    static void change(int x){//기본형 매계변수
        x=1000;
        System.out.println("change() : x="+x);
    }
    static void change2(Data d ){// 참조형 매계변수
        d.x=1000;
        System.out.println("change2() : x ="+d.x);
    }
    static void change3(int[] arr){// 배열도 객체와 같이 참조하여 참조형 매계변수에 해당
        arr[0]=1000;
        System.out.println("change3() : arr ="+arr[0]);
    }

}
