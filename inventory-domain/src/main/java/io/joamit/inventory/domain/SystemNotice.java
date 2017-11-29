package io.joamit.inventory.domain;

import javax.persistence.Column;
import java.util.Date;

/**
 * Holds a system notice
 */
public class SystemNotice extends BaseEntity {

    /**
     * Holds title of the notice
     */
    @Column
    private String title;

    /**
     * Holds description of the title
     */
    @Column
    private String description;

    /**
     * Holds time of notice creation
     */
    @Column
    private Date date;

    /**
     * Holds acknowledgement status of the notice
     */
    @Column
    private Boolean acknowledged = false;

    /**
     * Holds notice type
     */
    @Column
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemNotice that = (SystemNotice) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (acknowledged != null ? !acknowledged.equals(that.acknowledged) : that.acknowledged != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (acknowledged != null ? acknowledged.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SystemNotice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", acknowledged=" + acknowledged +
                ", type='" + type + '\'' +
                '}';
    }
}
