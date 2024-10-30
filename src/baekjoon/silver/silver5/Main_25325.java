package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 25325 _ 학생 인기도 측정

public class Main_25325 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String, Integer> students = new HashMap<>();
        for (int i = 0; i < n; i++) {
            students.put(st.nextToken(), 0);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String student = st.nextToken();
                students.put(student, students.get(student) + 1);
            }
        }

        List<String> ketList = new ArrayList<>(students.keySet());

        ketList.sort((k1, k2) -> {
           int valueCompare = Integer.compare(students.get(k2), students.get(k1));
           if (valueCompare == 0) {
               return k1.compareTo(k2);
           }
           return valueCompare;
        });

        for (String key : ketList) {
            bw.write(key + " " + students.get(key) + "\n");
        }
        bw.flush();
    }

}
