import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NUM = bf.readLine().split(" ");// 정수 입력 받을 때
        int N = Integer.parseInt(NUM[0]);
        int M = Integer.parseInt(NUM[1]);// 정수 입력 받을 때
        String str = "";

        HashMap<String, Integer> map4 = new HashMap<String, Integer>(N);

        for (int i = 0; i < N; i++) {
            str = bf.readLine();

            if (str.length() < M) {
                continue;
            } else if (map4.get(str) == null) {
                map4.put(str, 1);
            } else {
                map4.put(str, map4.get(str) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(map4.keySet());

        Collections.sort(keySet);

        keySet.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        keySet.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return map4.get(o2).compareTo(map4.get(o1));
            }
        });

        for (String key : keySet) {
            bw.write(key + "\n");
        }
        bw.flush();
        bw.close();
    }

}