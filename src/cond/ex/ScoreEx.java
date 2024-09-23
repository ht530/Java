package cond.ex;

import java.util.Scanner;

public class ScoreEx {

    public static void main(String[] args) {
        int score;
        String grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력해주세요 : ");
        score = sc.nextInt();

        if (score >= 90) {
//            System.out.println("학점은 A입니다.");
            grade = "A";
        } else if (score >= 80) {
//            System.out.println("학점은 B입니다.");
            grade = "B";
        } else if (score >= 70) {
//            System.out.println("학점은 C입니다.");
            grade = "C";
        } else if (score >= 60) {
//            System.out.println("학점은 D입니다.");
            grade = "D";
        } else {
//            System.out.println("학점은 F입니다.");
            grade = "F";
        }
        System.out.println("학점은 " + grade + "입니다.");
    }

}
