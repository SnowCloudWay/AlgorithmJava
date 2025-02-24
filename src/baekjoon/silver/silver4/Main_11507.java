package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 11507 _ 카드셋트

public class Main_11507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        HashSet<String>[] pkht = new HashSet[4];
        for (int i = 0; i < pkht.length; i++)
            pkht[i] = new HashSet<>();

        String cards = br.readLine();
        for (int i = 0; i < cards.length(); i += 3) {
            String card = cards.substring(i, i + 3);
            char shape = card.charAt(0);
            if (pkht[0].contains(card) || pkht[1].contains(card) || pkht[2].contains(card) || pkht[3].contains(card)) {
                flag = false;
                break;
            } else {
                if (shape == 'P')
                    pkht[0].add(card);
                else if (shape == 'K')
                    pkht[1].add(card);
                else if (shape == 'H')
                    pkht[2].add(card);
                else if (shape == 'T')
                    pkht[3].add(card);
            }
        }

        if (flag)
            System.out.printf("%d %d %d %d", 13 - pkht[0].size(), 13 - pkht[1].size(), 13 - pkht[2].size(), 13 - pkht[3].size());
        else
            System.out.println("GRESKA");

    }
}
