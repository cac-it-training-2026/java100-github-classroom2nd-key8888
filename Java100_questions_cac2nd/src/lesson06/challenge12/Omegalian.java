package lesson06.challenge12;

public class Omegalian {
    private String item;

    public void setItem(String item) {
        this.item = item;
        char lastChar = item.charAt(item.length() - 1);
        if (Character.isDigit(lastChar)) {
            String englishNumber = changeLastChar(lastChar);
            this.item = item.substring(0, item.length() - 1) + englishNumber;
        }
    }

    private String changeLastChar(char ch) {
        switch (ch) {
            case '0': return "zero";
            case '1': return "one";
            case '2': return "two";
            case '3': return "three";
            case '4': return "four";
            case '5': return "five";
            case '6': return "six";
            case '7': return "seven";
            case '8': return "eight";
            case '9': return "nine";
            default: return "";
        }
    }

    public String getItem() {
        return item;
    }

}
