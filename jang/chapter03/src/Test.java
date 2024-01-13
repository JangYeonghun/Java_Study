// Mini Project
// 카드를 랜덤하게 선택하여 화면에  출력하는 코드를 작성
// {Clubs, Diamonds, Hearts, Spades}, {2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace}
/*
실행 결과
Spades의 8
Spades의 7
Hearts의 Queen
Spades의 Queen
Diamonds의 10
 */

public class Test {
    public static void main(String[] args) {
        int randNum1, randNum2;

        String[] cardName = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};



        for (int i = 0; i < 5; i++) {
            randNum1 = (int) (Math.random() * 4);
            randNum2 = (int) (Math.random() * 13);

            System.out.println(cardName[randNum1] + "의 " + cardNum[randNum2]);
        }
    }
}
