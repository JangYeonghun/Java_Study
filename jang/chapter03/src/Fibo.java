import java.util.Scanner;

// Programming Exercise 9
// 피보나치 수열
// f0 = 0
// f1 = 1
// fi+1 = fi + fi-1     for i = 1, 2, ...
// 피보나치 수열에서는 앞의 2개의 원소를 합하여 뒤의 원소를 만든다. 피보나치 수열에서 처음 몇 개의 원소를 나열하면 다음과 같다.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ....
// 피보나치 수열은 컴퓨터에서 탐색 문제 등에 사용된다. 반복문을 이용하여 피보나치 수열을 구하는 프로그램을 작성해보자
/*
실행 결과
출력할 항의 개수: 10
0 1 1 2 3 5 8 13 21 34
 */
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        int setNum, temp1 = 0, temp2 = 1, next;

        System.out.print("출력할 항의 개수: ");
        setNum = sc.nextInt();

        for (int i = 0; i < setNum; i++) {
            System.out.print(temp1 + ", ");

            next = temp1 + temp2;
            temp1 = temp2;
            temp2 = next;
        }
    }
}
