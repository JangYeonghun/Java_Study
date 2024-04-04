// 은행 계좌를 나타내는 BankAccount 클래스에 다음과 같은 기능을 하는 메소드를 추가하고 테스트하라
/*
실행 결과
myAccount1 : 현재 잔액은 10000입니다.
myAccount2 : 현재 잔액은 0입니다.
transfer(1000)
myAccount1 : 현재 잔액은 9000입니다.
myAccount2 : 현재 잔액은 1000입니다.
 */

import java.util.Scanner;

class BankAccount {
    // 접근지정자 private(동일클래스), 멤버 변수(필드, 인스턴스 변수)
    private int amount;

    // 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 생성자, 참조변수(생성자, 필드만 참조)
    public BankAccount(int amount) {
        this.amount = amount;
    }

    public int transfer(int amount, BankAccount otherAccount) {
        this.amount -= amount;
        otherAccount.amount += amount;

        return this.amount;
    }

    public int getBankAccount() {
        return amount;
    }

}

public class BankAccountTest {
    public static void main(String[] args) {
        int amount1 = 0, amount2 = 0, transfer = 0;

        // 클래스 오브젝트 = 생성자
        Scanner sc = new Scanner(System.in);
        System.out.print("myAccount1, 2에 넣을 금액을 각각 입력 하시오: ");
        amount1 = sc.nextInt();
        amount2 = sc.nextInt();

        BankAccount bankAccount1 = new BankAccount(amount1);
        BankAccount bankAccount2 = new BankAccount(amount2);

        // 오브젝트(썼으니 인스턴스) .~는 인스턴스 변수
        System.out.println("myAccount1 : 현재 잔액은 " + bankAccount1.getBankAccount() + "입니다.");
        System.out.println("myAccount2 : 현재 잔액은 " + bankAccount2.getBankAccount() + "입니다.");

        System.out.print("myAccount2로 송금할 금액을 입력 하시오: ");
        transfer = sc.nextInt();
        bankAccount1.transfer(transfer, bankAccount2);

        System.out.printf("transfer(%d)", transfer);
        System.out.println();

        System.out.println("myAccount1 : 현재 잔액은 " + bankAccount1.getBankAccount() + "입니다.");
        System.out.println("myAccount2 : 현재 잔액은 " + bankAccount2.getBankAccount() + "입니다.");

    }
}
