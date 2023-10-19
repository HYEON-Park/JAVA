/**
 * programmers_1017
 * 
 * 치킨 쿠폰
 */
public class programmers_1017 {

    public static void main(String[] args) {
        int chicken = 1081;

        int order = chicken / 10;
        int coup = order / 10;
        int coup_etc = (chicken % order);

        while (coup >= 10) {
            coup += coup / 10;
        }

        // System.out.println(order + coup + coup_etc);
        int result = order + coup + coup_etc;
        // return result;
    }
}