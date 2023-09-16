public class programmers_0916 {
    public static void main(String[] args) {

        String s = "1 2 Z 3";

        String[] arr = new String[s.length()];
        arr = s.split(" ");

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("Z")) {
                answer += Integer.parseInt(arr[i]);
            } else {
                answer -= Integer.parseInt(arr[i - 1]);
            }
        }

        // System.out.println(answer); return answer;

    }
}
