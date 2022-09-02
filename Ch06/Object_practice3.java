package CH06;

class Card{
    //인스턴스 변수
    String kind;
    int number;
    //클래스 변수 (static 여부)
    static int width = 100;
    static int height = 250;

}
class CardTest{
    public static void main(String[] args) {
        System.out.println(Card.height);
        System.out.println(Card.width);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number =7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number =4;

        System.out.println("높이 c1 :"+c1.height+" c2 :"+c2.height);
        System.out.println("두께 c1 :"+c1.width+" c2 :"+c2.width);
        //클래스 변수의 값을 변경하면 다른 객체를 생성해도 클래스 변수값을 변경 값이 고정값으로 변경
        c1.width=50;
        c1.height =80;
        Card c3 = new Card();
        System.out.println("높이 c1 :"+c1.height+" c2 :"+c2.height+" c3 :"+c3.height);
        System.out.println("두께 c1 :"+c1.width+" c2 :"+c2.width+" c3 :"+c3.width);
        //클래스 변수와 인스턴스 변수와 차이를 두기위해 명시적으로 참조변수로 사용하기보단
        //Card.width 와 같이 클래스이름.클래스변수의 형태로 작성하는 것이 좋다

    }
}
class cardTest2{
    public static void main(String[] args) {
        System.out.println(Card.height);
        System.out.println(Card.width);
    }
}

public class Object_practice3 {
}
