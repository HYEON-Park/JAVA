package com.example;

// 인터페이스를 구현하게 되면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 해야 한다.
public class LottoImpl implements Lotto {

    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        for (int i = 0; i < 10000; i++) {
            int x1 = (int) (Math.random() * Lotto.MAX_BALL_CNT);
            int x2 = (int) (Math.random() * Lotto.MAX_BALL_CNT);

            if (x1 != x2) {
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[Lotto.RETURN_BALL];
        for (int i = 0; i < Lotto.RETURN_BALL; i++) {
            result[i] = balls[i];
        }

        return result;
    }

}
