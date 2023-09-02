import java.io.IOException;

public class CsvGetTest {
    public static void main(String[] args) throws IOException {
        System.out.println("[START]");

        CsvReader cr = new CsvReader();
        cr.getFilepath("C:\\Users\\357th\\JAVA_TEST\\JAVA\\src\\test.csv");
        String[] line = null;
        while ((line = cr.nextRead()) != null) {
            for (String a : line) {
                System.out.print(a + " ");
            }
        }

        System.out.println("[END]");
    }

}
