package CH06;

public class Object_practice9 {

    public static void main(String[] args) {
        //InitTest it =new InitTest();
        //System.out.println(it.x);
        //System.out.println(it.y);

        //int r=it.method1();
        //System.out.println(r);

        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();



    }
}
class InitTest{
    int x;//인스턴스 변수
    int y=x;// 초기화 없이도 사용가능

    /*int method1(){
        int i=j; // 지역변수
        //int j=i;// 지역변수를 초기화하지 않고 사용 불가능

        return j;
    }*/
}
class BlockTest {

    static int[] arr= new int[10];
    int[] arr2 = new int [10];
    static {//클래스 초기화 블럭 실행시 1회만 초기화 된다.
        System.out.println("static {}");
        //이처럼 배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로 복잡함으로 클래스 초기화 블럭을 사용해볼것 
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*10)+1;
        }
    }
    {// 인스턴스 초기화 블럭 인스턴스 변수 생성시마다 초기화 된다
        System.out.println("{}");
    }

    public BlockTest(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] :"+arr[i]);
        }
    }
    /*arr[0] :10
    arr[1] :7
    arr[2] :6
    arr[3] :6
    arr[4] :8
    arr[5] :6
    arr[6] :9
    arr[7] :5
    arr[8] :1
    arr[9] :10*/
}
