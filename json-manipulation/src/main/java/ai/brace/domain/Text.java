package ai.brace.domain;

import java.util.Comparator;

public class Text {

    private int id;
    private String textdata;

    public Text() {
    }

    public Text(int id, String textdata) {
        this.id = id;
        this.textdata = textdata;
    }

    public int getId() {
        return id;
    }

    public String getTextdata() {
        return textdata;
    }

    @Override
    public String toString() {
        return "Text{" +
                "id=" + id +
                ", text='" + textdata + '\'' +
                '}';
    }

    // this is another way to create the comparator
    public static class TextComparator implements Comparator<Text>{
        @Override
        public int compare(Text t1, Text t2) {
            return t1.getId()-t2.getId();
        }
    }
}
