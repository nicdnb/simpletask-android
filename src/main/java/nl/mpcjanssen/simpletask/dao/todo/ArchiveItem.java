package nl.mpcjanssen.simpletask.dao.todo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ARCHIVE_ITEM".
 */
public class ArchiveItem {

    private int line;
    /** Not-null value. */
    private String json;

    public ArchiveItem() {
    }

    public ArchiveItem(int line, String json) {
        this.line = line;
        this.json = json;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    /** Not-null value. */
    public String getJson() {
        return json;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setJson(String json) {
        this.json = json;
    }

}