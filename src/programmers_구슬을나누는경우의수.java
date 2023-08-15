
class Solutprogrammers_구슬을나누는경우의수on {
    public long programmers_구슬을나누는경우의수(int balls, int share) {
        int answer = 0;

        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;
        long result = programmers_구슬을나누는경우의수(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;

    }
}
