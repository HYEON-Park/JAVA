public class programmers_대소문자바꾸기 {
    public static void main(String[] args) {
        String my_string = "abCdEfghIJ";
        String[] arr = my_string.split("");
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                arr[i] = arr[i].toLowerCase();
            } else if (Character.isLowerCase(my_string.charAt(i))) {
                arr[i] = arr[i].toUpperCase();
            }
        }

        answer = String.join("", arr);
        // return

    }
}