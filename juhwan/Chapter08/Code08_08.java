abstract class Rabbit88{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }

    abstract void sleep();
}

class HouseRabbit88 extends Rabbit87{
    void sleep(){
        System.out.println("집토끼가 우리에서 잠자고있다");
    }
}

class MountainRabbit88 extends Rabbit87{
    void sleep(){
        System.out.println("산토끼가 굴속에서 잠자고있다");
    }
}

public class Code08_08{
    public static void main(String[] args){
        HouseRabbit88 hRabbit88 = new HouseRabbit88();
        MountainRabbit88 mRabbit88 = new MountainRabbit88();

        hRabbit88.sleep();
        mRabbit88.sleep();
    }
}