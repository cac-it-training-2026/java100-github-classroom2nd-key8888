package lesson05.challenge09;

public class Robot {
    public String makeMenu(int flour, int sugar, int egg, int butter) {
        if (flour >= 170 && sugar >= 50 && egg >= 1 && butter >= 80) {
            return "クッキー";
        } else if (egg >= 2 && butter >= 5) {
            return "オムレツ";
        } else if (egg >= 1) {
            return "ゆで卵";
        } else {
            return "";
        }
    }

}
