import java.util.Scanner;
class Car {
    int speed=0;

    void upSpeed(int value){
        this.speed+=value;
    }
}

class SportCar extends Car{

}

class SchoolBus extends Car{
    void upSpeed(int value){
        this.speed+=value;

        if(this.speed>60)
            this.speed=60;
    }

}

public class Lab08_01{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int axel;
        SportCar SpCar = new SportCar();
        SchoolBus ScCar = new SchoolBus();

        while(true){
            System.out.print("가속할 속도==> ");
            axel=s.nextInt();

            SpCar.upSpeed(axel);
            ScCar.upSpeed(axel);

        System.out.printf("스포츠카 : (%d)\n",SpCar.speed);
        System.out.printf("스쿨버스 : (%d)\n",ScCar.speed);


        }
    }
}