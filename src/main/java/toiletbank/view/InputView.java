package toiletbank.view;

import java.math.BigInteger;
import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public String getPassword() {
        System.out.println("비밀번호를 입력해주세요.(4자리)");
        return sc.next();
    }

    public BigInteger getAmount() {
        System.out.println("저축할 금액을 입력해주세요.");
        return sc.nextBigInteger();
    }

    public String getWork() {
        System.out.print("""
                =========================
                   은행 업무를 선택해주세요.
                =========================
                1. 계좌 잔액 조회
                2. 계좌 이체
                3. Toilet Bank 계좌 생성
                4. Toilet Bank 계좌 삭제
                5. 종료
                =========================
                입력 : """);
        return sc.next();
    }

    public String getType() {
        System.out.print("""
                ===============================
                   생성할 계좌 타입을 입력해주세요.
                ===============================
                 1.보통예금(입출금 통장)
                 2.정기예금
                 3.정기적금
                =========================
                입력 : """);
        return sc.next();
    }
}
