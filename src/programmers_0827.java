/**
 * programmers_0827
 */
public class programmers_0827 {
    public static void main(String[] args) {

        String[] strlist = { "We", "are", "the", "world!" };

        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            System.out.println(strlist[i].length());
            answer[i] = strlist[i].length();
        }

    }

}