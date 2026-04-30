package lesson06.challenge11;

public class Gammalian {
    String item;
    boolean isGood;
    public void setItem(String item) {
        this.item = item;
        if (item.matches(".*\\d.*")) {
            isGood = true;
        } else {
            isGood = false;
        }
    }
    public String getItem() {
        return item;
    }
    public boolean isGood() {
        return isGood;
    }

}
