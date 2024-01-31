import java.util.Random;

// 주사위를 Dice 클래스로 모델링 한다. Dice 클래스는 주사위면을 필드로 가지고 있고
// roll(), getValue(), setValue() 등의 메소드를 가지고 있다
// 생성자에서는 주사위면을 0으로 초기화 한다
// 2개의 주사위 객체를 생성하여서 주사위를 반복하여 던진다
// 두 주사위 값의 합이 2가 되면 반복을 종료하고 2가 나오는데 걸린 횟수를 화면에 출력한다
/*
실행 결과
주사위1= 2 주사위2= 4
주사위1= 1 주사위2= 2
주사위1= 3 주사위2= 6
주사위1= 1 주사위2= 1
(1, 1)이 나오는데 걸린 횟수= 4
 */
public class Dice {
    public static void main(String[] args) {
        SetDice dice1 = new SetDice();
        // SetDice는 클래스, dice1은 오브젝트(SetDice의 인스턴스), new SetDice는 생성자
        SetDice dice2 = new SetDice();
        // SetDice는 클래스, dice2는 오브젝트(SetDice의 인스턴스), new SetDice는 생성자
        int count = 0;

        SetDice.printGameRules();

        while (true) { // 반복문 true면 무한
            dice1.roll(); // dice1이라는 인스턴스 .roll은 인스턴스 메소드
            dice2.roll(); // dice2라는 인스턴스 .roll은 인스턴스 메소드

            int sum = dice1.getValue() + dice2.getValue();

            System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
            count++;

            if (sum == 2) {
                System.out.println("(1, 1)이 나오는데 걸린 횟수= " + count);
                break;
            }
        }
    }
}

class SetDice {
    private int value; // 필드(멤버 변수)
    // 멤버 변수는 클래스 내에 정의된 변수, 멤버 메소드는 클래스 내에 정의된 메소드
    // 인스턴스 메소드는 클래스의 인스턴스에 속하는 메소드 <-> 정적메소드

    public SetDice() {
        // 생성자(얘도 클래스의 멤버이긴 함)
        this.value = 0; // 생성자, 초기값을 0으로 설정, this는 참조변수로 private int value를 참조(현재 객체의 인스턴스를 참조)
    }

    public void roll() { // 접근지정자는 public, void로 반환값이 없음, 인스턴스 메서드(멤버 메소드)
        Random random = new Random(); // Random은 클래스, random은 오브젝트, new Random()은 생성자
        this.value = random.nextInt(6) + 1; // 참조 변수 this(인스턴스 메서드 내에서 해당 객체의 인스턴스를 참조), random은 Random 클래스의 인스턴스, nextInt()는 Random 클래스의 인스턴스 메서드
    }

    public int getValue() { // 접근지정자는 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 반환값은 int, 인스턴스 메서드(멤버 메소드)
        return this.value; // return 타입은 int, 참조 변수 this(인스턴스 메서드 내에서 해당 객체의 인스턴스를 참조)
    }

    public void setValue(int value) { // 접근지정자는 public(동일클래스, 동일패키지, 자식클래스, 전체세계), void로 반환값 없음, 매개변수 int value를 받음, 인스턴스 메서드(멤버 메소드)
        this.value = value; // 참조 변수 this(인스턴스 메서드 내에서 해당 객체의 인스턴스를 참조)
    }

    public static void printGameRules() { // public 접근 지정자, static은 정적 메소드, void 이므로 반환타입 없음
        System.out.println("주사위 게임 규칙: 가위 바위 보 이긴 사람이 먼저 시작한다.");
    }
}