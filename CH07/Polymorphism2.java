package CH07;

import java.util.Vector;

class Product3{
    int price;
    int bonusPoint;

    Product3(int price){
        this.price =price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv3 extends Product3 {
    Tv3(){super(100);}

    public String toString(){return "TV";}
}

class Computer3 extends Product3{
    Computer3(){super(200);}

    public String toString(){return "Computer";}
}

class Buyer{
    int money =1000;
    int bonusPoint =0;
    Vector item = new Vector();


    void buy(Product3 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다");
    }
    void summary(){
        for(int i=0;i<item.size();i++){
            System.out.println("구매한 품목 "+(i+1)+": "+ item.get(i));
        }
    }
}

class PolyArgumentTest{
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Tv3());

        System.out.println("현재남은 돈은 "+b.money);
        System.out.println("현재남은 포인트는"+b.bonusPoint);
        b.summary();
    }
}

public class Polymorphism2 {
}
