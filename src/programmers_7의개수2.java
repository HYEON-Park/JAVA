import java.util.Arrays;
import java.util.stream.Collectors;

class programmers_7의개수2 {
    public int programmers_7의개수2(int[] array) {
        // int answer = 0;
        // return answer;

        return (int) Arrays.stream(
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split("")

        )
                .filter(s -> s.equals("7"))
                .count();
    }
}