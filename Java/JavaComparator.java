
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA COMPARATOR
*/

import java.util.*;

class Checker implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        int firstCompare = (p2.score - p1.score);
        if (firstCompare != 0)
            return (firstCompare);

        int secondCompare = (p1.name.compareTo(p2.name));
        return (secondCompare);
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}