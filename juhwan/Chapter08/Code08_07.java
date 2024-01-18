abstract class Rabbit87{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }
}

class HouseRabbit87 extends Rabbit87{

}

class MountainRabbit87 extends Rabbit87{

}

public class Code08_07{
    public static void main(String[] args){
        //Rabbit87 rabbit87 = new Rabbit87(); <<오류 발생 왜? abstract Rabbit 87 은 추상클래스이므로 객체를 만들수없다.
        HouseRabbit87 hRabbit87 = new HouseRabbit87();
        System.out.println("집토끼 객체 생성 ~~~");
        MountainRabbit87 mRabbit87 = new MountainRabbit87();
        System.out.println("산토끼 객체 생성 ~~~");
    }
}