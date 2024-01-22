import java.util.Scanner;
public class Lab09_02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] score=new int[5];
        int hap=0;
        double avg;
        System.out.println("김연아 선수 경기가 끝났습니다~ 짝짝짝");

        for(int i=0; i<5;i++){
            System.out.print("평가점수==> ");
            score[i] = s.nextInt();
        }
        for (int i=0 ; i<5;i++)
            hap+=score[i];
        avg=(double)hap/5;

        System.out.printf("심사위원 평균 점수 : %5.2f",avg);
        s.close();
    }
}
