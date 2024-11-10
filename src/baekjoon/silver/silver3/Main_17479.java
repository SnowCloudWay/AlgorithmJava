package baekjoon.silver.silver3;

import java.util.*;
import java.io.*;

// Silver III _ 17479 _ 정식당

public class Main_17479 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> menuN = new HashMap<>();
        Map<String, Integer> menuS = new HashMap<>();
        ArrayList<String> service = new ArrayList<>();

        long menuNPrice = 0;
        long menuSPrice = 0;
        int serviceCnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            menuN.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            menuS.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < c; i++)
            service.add(br.readLine());

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String menu = br.readLine();
            if (menuN.containsKey(menu))
                menuNPrice += menuN.get(menu);
            else if (menuS.containsKey(menu))
                menuSPrice += menuS.get(menu);
            else
                serviceCnt += 1;
        }

        if (menuNPrice < 20000 && menuSPrice != 0 || menuNPrice + menuSPrice < 50000 && serviceCnt != 0 || serviceCnt > 1)
            System.out.println("No");
        else
            System.out.println("Okay");

    }

}
