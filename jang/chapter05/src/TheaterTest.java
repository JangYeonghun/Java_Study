import java.util.Scanner;

// Programming Exercise 2
// 배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자
// 아주 작은 극장이라서 좌석이 10개밖에 안된다
// 사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다
// 즉 예약이 끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다
/*
실행 결과
----------------------
0 1 2 3 4 5 6 7 8 9
----------------------
0 0 0 0 0 0 0 0 0 0
----------------------
몇 번째 좌석을 예약하시겠습니까? 2
예약되었습니다.

----------------------
0 1 2 3 4 5 6 7 8 9
----------------------
0 0 1 0 0 0 0 0 0 0
 */
class Theater {
    // 배열 생성, 필드, 멤버변수, 인스턴스 변수
    int[] reservationSeat = new int[10];

    // void 반환값이 없음, 메소드, 인스턴스 메소드, 매개변수
    void reservation(int reservation) {
        reservationSeat[reservation] = 1;
    }

    void inquirySeat() {
        for (int value : reservationSeat) {
            System.out.print(value + " ");
        }
    }
}

public class TheaterTest {
    public static void main(String[] args) {
        // Theater 이라는 클래스, theater는 오브젝트, new~는 생성자
        Theater theater = new Theater();

        String line = "------------------------------";
        String seatNum = "0 1 2 3 4 5 6 7 8 9";

        int[] defaultSeat = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int reservation;

        // Scanner 라는 클래스, sc는 오브젝트, new~는 생성자
        Scanner sc = new Scanner(System.in);

        while (true) {
            // theater는 쓰였으니 인스턴스, .~는 인스턴스 메소드
            System.out.println(line + "\n" + seatNum + "\n" + line);
            theater.inquirySeat();
            System.out.println("\n" + line);

            System.out.print("몇번째 좌석을 예약하시겠습니까?(종료는 19) ");
            reservation = sc.nextInt();
            if (reservation == 19) {
                break;
            }
            System.out.println("예약되었습니다.");

            theater.reservation(reservation);

            System.out.println(line + "\n" + seatNum + "\n" + line);
            theater.inquirySeat();
            System.out.println("\n" + line);
        }
    }
}
