import java.util.Arrays;
import java.util.Scanner;

// Programming Exercise 3
// 영수증에는 10% 부가세와 잔돈 등이 인쇄되어 있다. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성해 보자
/*
출력 결과
받은 돈: 10000
상품 가격: 7500
부가세: 750
잔돈: 2500
*/
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money, price, tax, changes;

        System.out.print("받은 돈: ");
        money = sc.nextInt();

        System.out.print("상품 가격: ");
        price = sc.nextInt();

        tax = price / 10;
        changes = money - price;

        System.out.println("부가세: " + tax);
        System.out.println("잔돈: " + changes);
    }
}
