package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력해주세요.");
        int num = input.nextInt();

        for(int i = 1; i < 10; i++) {
            int gugu = num * i;
            System.out.println(num + " * " + i + " = " + gugu + "입니다.");
        }
    }
}
