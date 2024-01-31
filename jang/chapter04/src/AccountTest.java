// Programming Exercise 5
// 은행 계좌를 나타내는 클래스 Account를 만들어보자
// Account 클래스는 잔액을 나타내는 balance 필드만을 가진다
// Account 클래스의 메소드로는 돈을 인출하는 withdraw(int amount)와
// 돈을 저금하는 deposit(int amount)를 정의한다
// 기타 필요한 메소드를 추가할 수 있다
// Account 생성자에서는 잔액을 0으로 초기화한다
// Account 객체를 2개 생성하여서 다음과 같이 테스트하라
/*
실행 결과
새로운 계좌가 만들어졌습니다.
50000원 저축
새로운 계좌가 만들어졌습니다.
100000원 저축
고객 #1 계좌 잔고=50000
고객 #2 계좌 잔고=100000
 */
public class AccountTest {
    // 필드(멤버 변수), 인스턴스 변수, 접근지정자 private(동일클래스)
    private int balance;

    // 생성자, 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 참조변수 this(필드, 생성자 참조)
    public AccountTest() {
        this.balance = 0;
        System.out.println("새로운 계좌가 만들어졌습니다.");
    }

    // void는 반환 타입이 없음, 인스턴스 매서드(멤버 메서드)
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(amount + "원 저축");
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원 인출");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public int select() {
        return this.balance;
    }

    public static void main(String[] args) {
        // AccountTest는 클래스, accountTest1/2는 오브젝트(인스턴스), new~는 생성자
        AccountTest accountTest1 = new AccountTest();
        accountTest1.deposit(50000); // accountTest1/2는 인스턴스 .~는 인스턴스 메서드( <-> 정적 메서드)
        AccountTest accountTest2 = new AccountTest();
        accountTest2.deposit(100000);

        System.out.println("고객 #1 계좌 잔고=" + accountTest1.select());
        System.out.println("고객 #2 계좌 잔고=" + accountTest2.select());

    }
}
