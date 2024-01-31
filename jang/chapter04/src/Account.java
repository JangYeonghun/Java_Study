// 예제 4-3
// 은행 통장을 나타내는 Account 클래스를 작성해보자. 통장은 고객 이름, 잔고 등의 정보를 가지고 있다.
// 이들 정보롤 보호해보자. 필드를 private로 선언하고  필드에 대하여 접근자와 설정자를 추가하여 보자
/*
실행 결과
이름은 Tom 통장 잔고는 100000입니다.
 */
public class Account {
    private int regNumber;
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(100000);
        System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance() + "입니다.");
    }
}
