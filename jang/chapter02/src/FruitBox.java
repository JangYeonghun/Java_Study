import java.util.Scanner;

// Programming Exercise 1
// 하나의 상자에 오렌지를 10개씩 담을 수 있다. 오렌지가 127개가 있다면 상자 몇개가 필요한가? 또 몇 개의 오렌지가 남을까?
/*
실행 결과
오렌지의 개수를 입력하시오: 127
12박스가 필요하고 7개가 남습니다.
*/
public class FruitBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orange, box, left;

        System.out.print("오렌지의 개수를 입력하시오: ");
        orange = sc.nextInt();

        box = orange / 10;
        left = orange % 10;

        System.out.println(box + "박스가 필요하고 " + left + "개가 남습니다.");
    }
}
