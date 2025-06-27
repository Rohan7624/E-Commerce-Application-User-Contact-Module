package net.engineeringdigest.journalApp.Entity;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class JournalEntry {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String title;

    private String content;
}
