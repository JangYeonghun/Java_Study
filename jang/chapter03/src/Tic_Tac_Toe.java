import org.w3c.dom.ranges.RangeException;

import java.util.Random;
import java.util.Scanner;

// 예제 3-15
// tic tac toe 게임 만들기(컴퓨터는 단순히 비어 있는 첫 번째 칸에 놓는다고 가정)
/*
실행 결과
   |   |
---|---|---
   |   |
---|---|---
   |   |
다음 수의 좌표를 입력하시오: 1 1
 o |   |
---|---|---
   | x |
---|---|---
   |   |
다음 수의 좌표를 입력하시오: 0 2
 o | o | x
---|---|---
   | x |
---|---|---
   |   |
다음 수의 좌표를 입력하시오:
 */
public class Tic_Tac_Toe {
    public static void main(String[] args) {

        // 초기 설정
        int inputX, inputY;
        boolean isGameEnd = false;
//        String[][] board = {
//                {" ", " ", " "},
//                {" ", " ", " "},
//                {" ", " ", " "}
//        };
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        System.out.println("   |   |   \n" +
                           "---|---|---\n" +
                           "   |   |   \n" +
                           "---|---|---\n" +
                           "   |   |   \n");

        while(true) {

            try{
                // 유저 구현
                do {
                    System.out.print("다음 수의 좌표를 입력 하시오(0~2, 공백 구분): ");
                    inputX = sc.nextInt();
                    inputY = sc.nextInt(); // sc는 오브젝트인데 사용됐으니 인스턴스, nextInt는 인스턴스 뒤에 붙은 인스턴스 메소드(클래스 뒤면 정적 메소드)

                    if (board[inputX][inputY] != ' ') {
                        System.out.println("이미 있는 자리니 숫자를 다시 입력 하시오");
                    }
                } while(board[inputX][inputY] != ' ');

                board[inputX][inputY] = 'x';

                // 게임판
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j <3; j++) {
                        System.out.print(" " + board[i][j] + " ");
                        if(j < 2) {
                            System.out.print(" |");
                        } else {
                            System.out.println(" ");
                        }
                    }
                    if (i < 2) {
                        System.out.println("----|----|----");
                    }
                }

                // 게임 종료
                // 가로 세로
                for(int i = 0; i < 3; i++) {
                    if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                        if (board[i][0] == 'x') {
                            System.out.println("유저 승리!! 축하 드립니다!!");
                            isGameEnd = true;
                            break;
                        } else if (board[i][0] == 'o') {
                            System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                            isGameEnd = true;
                            break;
                        } else {
                            continue;
                        }

                    }
                    for(int j = 0; j < 3; j++) {
                        if (board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                            if (board[0][j] == 'x') {
                                System.out.println("유저 승리!! 축하 드립니다!!");
                                isGameEnd = true;
                                break;
                            } else if (board[0][j] == 'o') {
                                System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                                isGameEnd = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                }

                // 대각선
                if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
                    if (board[0][0] == 'x') {
                        System.out.println("유저 승리!! 축하 드립니다!!");
                        isGameEnd = true;
                        break;
                    } else if (board[0][0] == 'o') {
                        System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                        isGameEnd = true;
                        break;
                    } else {
                        continue;
                    }
                }
                if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
                    if (board[2][0] == 'x') {
                        System.out.println("유저 승리!! 축하 드립니다!!");
                        isGameEnd = true;
                        break;
                    } else if (board[2][0] == 'o') {
                        System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                        isGameEnd = true;
                        break;
                    } else {
                        continue;
                    }
                }

                if (isGameEnd == true) break;

                // 컴퓨터 구현 - 단순히 비어있는 첫 칸에 놓는 버전
//                for(int i = 0; i < 3; i++) {
//                    boolean isComputerTurn = true;
//                    for(int j = 0; j < 3; j++) {
//                        if (board[i][j] == ' ') {
//                            board[i][j] = 'o';
//                            isComputerTurn = false;
//                            System.out.println("컴퓨터 차레 입니다(0~2, 공백 구분): " + i + " " + j);
//                            break;
//                        }
//                    }
//                    if (!isComputerTurn) break;
//                }

                // 컴퓨터 구현 - 랜덤 버전
                Random random = new Random();

                int emptyCount = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j] == ' ') {
                            emptyCount++;
                        }
                    }
                }

                if (emptyCount > 0) {
                    int randomIndex = random.nextInt(emptyCount) + 1; // 오브젝트 random을 썼으니 인스턴스, nextInt는 인스턴스메소드, 0~n까지니 1부터 시작하게 +1

                    emptyCount = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (board[i][j] == ' ') {
                                emptyCount++;
                                if (emptyCount == randomIndex) {
                                    board[i][j] = 'o';
                                    System.out.println("컴퓨터 차레 입니다(0~2, 공백 구분): " + i + " " + j);
                                }
                            }
                        }
                    }
                }


                // 게임판
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j <3; j++) {
                        System.out.print(" " + board[i][j] + " ");
                        if(j < 2) {
                            System.out.print(" |");
                        } else {
                            System.out.println(" ");
                        }
                    }
                    if (i < 2) {
                        System.out.println("----|----|----");
                    }
                }

                // 게임 종료
                // 가로 세로
                for(int i = 0; i < 3; i++) {
                    if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                        if (board[i][0] == 'x') {
                            System.out.println("유저 승리!! 축하 드립니다!!");
                            isGameEnd = true;
                            break;
                        } else if (board[i][0] == 'o') {
                            System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                            isGameEnd = true;
                            break;
                        } else {
                            continue;
                        }

                    }
                    for(int j = 0; j < 3; j++) {
                        if (board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                            if (board[0][j] == 'x') {
                                System.out.println("유저 승리!! 축하 드립니다!!");
                                isGameEnd = true;
                                break;
                            } else if (board[0][j] == 'o') {
                                System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                                isGameEnd = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                }

                // 대각선
                if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
                    if (board[0][0] == 'x') {
                        System.out.println("유저 승리!! 축하 드립니다!!");
                        isGameEnd = true;
                        break;
                    } else if (board[0][0] == 'o') {
                        System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                        isGameEnd = true;
                        break;
                    } else {
                        continue;
                    }
                }
                if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
                    if (board[2][0] == 'x') {
                        System.out.println("유저 승리!! 축하 드립니다!!");
                        isGameEnd = true;
                        break;
                    } else if (board[2][0] == 'o') {
                        System.out.println("컴퓨터 승리!! 다시 도전해 보세요!!");
                        isGameEnd = true;
                        break;
                    } else {
                        continue;
                    }
                }

                if (isGameEnd == true) break;


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("이미 있는 자리니 숫자를 다시 입력 하시오");
            }
        }

    }
}
