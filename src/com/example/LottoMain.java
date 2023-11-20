package com.example;

public class LottoMain {
    public static void main(String[] args) {

        Ball[] balls = new Ball[45]; // ball 45개 생성 됨.

        // 45개의 balls 에 번호를 1-45로 넣어주기
        for (int i = 0; i < 45; i++) {
            balls[i] = new Ball(i + 1);
        }

        // 로또할 인스턴스가 생성된다.
        Lotto lotto = new LottoImpl();
        lotto.setBalls(balls);
        lotto.mix();
        Ball[] result = lotto.getBalls();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
