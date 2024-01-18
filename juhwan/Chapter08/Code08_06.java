class Rabbit86{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }
}

class HouseRabbit86 extends Rabbit86{
    void move(int x,int y){
        this.xPos=x;
        this.yPos=y;

        if(this.xPos>100)
            this.xPos=100;
        if(this.yPos>100)
            this.yPos=100;
    }
}

class MountainRabbit86 extends Rabbit86{

}

public class Code08_06{
    public static void main(String[] args){
        HouseRabbit86 hRabbit = new HouseRabbit86();
        MountainRabbit86 mRabbit = new MountainRabbit86();

        hRabbit.move(500,500);
        mRabbit.move(500,500);

        System.out.printf("집토끼 위치 : (%d,%d)\n",hRabbit.xPos,hRabbit.yPos);
        System.out.printf("산토끼 위치 : (%d,%d)\n",mRabbit.xPos,mRabbit.yPos);
    }
}