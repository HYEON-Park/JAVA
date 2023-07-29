public class programmers_0729 {
    /**
     * 코딩테스트 연습 > 코딩테스트 입문 > 배열의 유사도
     * 
     * @param args
     */
    public static void main(String[] args) {
        String[] arr1 = { "a", "b", "c" };
        String[] arr2 = { "com", "b", "d", "p", "c" };

        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
