// Programming Exercise 3
// 2개의 주사위를 던져 합이 6이 되는 경우 출력
/*
실행 결과
(1,5) , (2,4) , (3,3) , (4,2) , (5,1) ,
 */
public class Test4 {
    public static void main(String[] args) {
        int dice1, dice2;

        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.print("(" + i + "," + j + ")" + " , ");
                }
            }
        }
    }
}
