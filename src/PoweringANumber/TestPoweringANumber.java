package PoweringANumber;

import java.util.Scanner;

public class TestPoweringANumber {
    public static void main(String[] args) {
        PoweringANumber PAN = new PoweringANumber();

        System.out.println("< Powering A Number >");

        Scanner sc = new Scanner(System.in);

        System.out.print("밑수를 입력하세요. : ");
        int A = sc.nextInt();

        System.out.print("지수를 입력하세요. : ");
        int n = sc.nextInt();

        System.out.println(A + "의 " + n + "제곱은 " + PAN.Powering(A, n) + "입니다.");
    }
}
