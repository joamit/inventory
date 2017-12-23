package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message extends BaseDocument {

    @DBRef
    private User from;

    @DBRef
    private User to;

    private String content;

    private Date createdOn;

    private Date modifiedOn;

    private Boolean read;

    private Boolean archived;

    private List<MessageAttachment> attachments;

    public Message(User from, User to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
        Date now = new Date();
        this.createdOn = now;
        this.modifiedOn = now;
        this.read = false;
        this.archived = false;
        this.attachments = new ArrayList<>();
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<MessageAttachment> attachments) {
        this.attachments = attachments;
    }
}
