import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private String filepath;
    private BufferedReader bufferedReader;
    private List<String[]> readTxt;
    private int index;

    public void getFilepath(String path) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        readTxt = new ArrayList<>();
        getDataList(bufferedReader);
        this.index = 0;
    }

    public void getDataList(BufferedReader bufferedReader) throws IOException {
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] txt = line.split(",");
            readTxt.add(txt);
        }
    }

    public String[] nextRead() {

        if (readTxt.size() == index) {
            return null;
        }
        return readTxt.get(index++);
    }

}
