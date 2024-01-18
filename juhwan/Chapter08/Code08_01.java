class Rabbit81{
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit81(){
        count++;
    }
}
public class Code08_01 {

    public static void main(String[] args) {
        System.out.println("객체 생성 전의 총 토끼의 수 ==> " +Rabbit81.count);

        Rabbit81 rabbit1=new Rabbit81();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==> " +Rabbit81.count);

        Rabbit81 rabbit2=new Rabbit81();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==> " +Rabbit81.count);

    }

}
