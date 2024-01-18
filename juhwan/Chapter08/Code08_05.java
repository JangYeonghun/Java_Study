class Rabbit85{
    private String shape;  //private 로 상속 막음 (shape 상속 x)
    int xPos;
    int yPos;

    private void move(int x,int y){  //private 로 상속 막음 (move 상속 x)
        this.xPos=x;
        this.yPos=y;
    }
}

class HouseRabbit85 extends Rabbit85{
    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}

public class Code08_05{
    public static void main(String[] args){
        HouseRabbit85 hRabbit = new HouseRabbit85();

        hRabbit.owner="난생이";
        hRabbit.eatFeed();
        hRabbit.xPos=100;
        hRabbit.yPos=100;
    }
}