package com.example;

public interface Lotto {
    int MAX_BALL_CNT = 45;
    int RETURN_BALL = 6; // 고정값

    public void setBalls(Ball[] balls); // 볼 1-45

    public void mix(); // 볼 섞기

    public Ball[] getBalls(); // 볼 6개 반환

}
