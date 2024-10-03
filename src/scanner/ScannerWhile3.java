package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("한 번에 한개의 정수를 입력. 숫자 0을 입력하면 프로그램을 종료, 종료 될 때까지 모든 입력 정수 더함");
        while(true) {
            System.out.print("정수를 입력하세요");
            int num =scanner.nextInt();

            if( num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += num;
        }
        System.out.println("모든 입력 정수의 합 = " + sum);
    }
}
