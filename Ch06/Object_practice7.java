package CH06;

class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100","200","300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",",new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",",new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");

    }

    //가변인자가 선언된 메서드를 호출 할때 배열이 새로 생성됨으로 비효율이 숨어 있을수 있다 그럼으로 잘 생각해서 사용해야한다.
    //가변인자는 문자열을 개수의 제약없이 매개변수로 지정할수 있다,
    // ※System.out.println(concatenate("-",{"100","200","300"})); 이런 형태는 사용 불가
    static String concatenate(String delim, String... args){//가변인자 사용
        String result="";

        for(String str: args){
            result +=str + delim;
        }
        return result;
    }
    /*
    //가변인자로 선언된 메서드를 오버로딩 하면 구별되지 못하는 경우가 존재하기 때문에 가급적 가변인자가 포함된 메서드는
    //오버로딩을 사용하지 않는다
    static String concatenate(String... args){
        return concatenate("", args);
    }
    */
}

public class Object_practice7 {

}
