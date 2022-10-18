package CH07;

//추상클래스란? 미완성 설계도
//1. 인스턴스 생성 불가  2. 상속을 통해서 자손클래스에 의해서만 완성될수 있다.
//추상화 : 클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업 (자손->부모)
//구체화 상속을 통해 클래스를 구현, 확장하는 작업(부모->자손)

abstract  class Player{
    boolean pause;
    int currentPos;

    Player(){//추상클래스지만 생성자가 있어야한다
        pause = false;
        currentPos =0;
    }
    abstract void play(int pos);//추상 메서드
    abstract void stop();//추상 메서드

    void play(){
        play(currentPos);
    }
    void pause(){
        if(pause){
            pause= false;
            play(currentPos);
        }
        else{
            pause= true;
            stop();
        }
    }
}

//추상클래스의 장점 :상속받은 자손들에서 추상클래스 부분들에 추상메서드의 내용을
//꼭 채워야 된다는 인지를 시켜준다.
//자손들의 공통된 부분이지만 안의 내용을 다르게 해야할때 유용하게 추상화시켜 추상 메서드를 사용할 수 있다.

class CDPlayer extends Player{

    void play(int currentPos){//추상메서드를 작성하지 않으면 오류

    }
    void stop(){//추상메서드를 작성하지 않으면 오류

    }
    int currentTrack;

    void nextTrack(){
        currentTrack++;
    }
    void preTrack(){
        if(currentTrack>1){
            currentTrack--;
        }
    }
}

public class Abstract {
}
