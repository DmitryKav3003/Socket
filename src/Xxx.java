import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Xxx {
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String x = bufferedReader.readLine();
        System.out.println(x);
        }
    }

