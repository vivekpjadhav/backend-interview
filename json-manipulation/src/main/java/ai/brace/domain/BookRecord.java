package ai.brace.domain;

import java.util.List;
import java.util.UUID;

public class BookRecord  {


    private String version;
    private UUID uuid;
    private Integer lastModified;
    private String title;
    private String author;
    private String translator;
    private String releaseDate;
    private String language;

    private List<Text> textArray;

    public BookRecord() {
    }

    public BookRecord(String version, String uuid, Integer lastModified, String title, String author, String translator, String releaseDate, String language, List<Text> textArray) {
        this.version = version;
        this.uuid = UUID.randomUUID();
        this.lastModified = lastModified;
        this.title = title;
        this.author = author;
        this.translator = translator;
        this.releaseDate = releaseDate;
        this.language = language;
        this.textArray = textArray;
    }

    public String getVersion() {
        return version;
    }



    public Integer getLastModified() {
        return lastModified;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTranslator() {
        return translator;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getLanguage() {
        return language;
    }

    public List<Text> getTextArray() {
        return textArray;
    }

    @Override
    public String toString() {
        return "BookRecord{" +
                "version='" + version + '\'' +
                ", uuid='" + uuid + '\'' +
                ", lastModified=" + lastModified +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", translator='" + translator + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", language='" + language + '\'' +
                ", textArray=" + textArray +
                '}';
    }
}
