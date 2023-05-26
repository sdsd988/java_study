package gameLevel;

public class MainBoardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdavncedLevel adavncedLevel = new AdavncedLevel();
        player.upgradeLevel(adavncedLevel);

        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}
