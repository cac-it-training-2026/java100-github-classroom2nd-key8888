package lesson06.challenge10;

public class Betalian {
    private String item;

    public void setItem(String item) {
        if (item.length() > 5) {
            this.item = item.substring(0, 5);
        } else {
            this.item = item;
        }
    }

    public String getItem() {
        return item;
    }
}
