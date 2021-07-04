package org.example.algorithms.implementation;

import java.util.List;


// TODO
public class TheGridSearch {
    public static void main(String[] args) {

    }
    public static String gridSearch(List<String> G, List<String> P) {
        String[] g = G.toArray(new String[G.size()]);
        String[] p = P.toArray(new String[P.size()]);

        int k = 0;
        int xa = 0;
        ou:
        for (int x = 0; x < g.length; x++) {
            if (g[x].contains(p[0])) {
                k = x;
                xa = g[x].indexOf(p[0]);
                int l = p[0].length();
                int y = 1;
                while (y < p.length) {
                    String s = g[x + 1].substring(xa, xa + l);
                    if (!(s.equals(p[y]))) {
                        x = k - 1;
                        g[k] = g[k].substring(0, xa) + "#" + g[k].substring(xa + 1);
                        continue ou;
                    }
                    y++;
                    x++;
                }
                return "YES";
            }
        }
        return "NO";
    }
}
