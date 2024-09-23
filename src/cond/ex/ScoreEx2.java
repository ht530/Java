package cond.ex;

import java.util.Scanner;

public class ScoreEx2 {

    public static void main(String[] args) {
        int distance;
        Scanner sc = new Scanner(System.in);

        System.out.println("거리를 입력해주세요 : ");
        distance = sc.nextInt();

        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else if (distance > 100) {
            System.out.println("비행기");
        }
    }

}
