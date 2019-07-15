import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Memorise {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arraylimit = Integer.parseInt(bufferedReader.readLine());
        HashMap<String, Integer> itration = new HashMap<String, Integer>();
        String data = bufferedReader.readLine();
        String[] arrayData = data.split(" ", -1);
        for (String number : arrayData) {
            if (!itration.containsKey(number)) {
                itration.put(number, 1);
            } else {
                itration.put(number, itration.get(number)+1);
            }
        }
        int querys = Integer.parseInt(bufferedReader.readLine());
        for (int i =0; i < querys; i++) {
            String query = bufferedReader.readLine();
            if (itration.get(query) != null) {
                System.out.println(itration.get(query));
                continue;
            }
            System.out.println("NOT PRESENT");
        }
    }
}

