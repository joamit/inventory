package io.joamit.inventory.domain.user;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

public class MessageAttachment extends BaseDocument {

    @DBRef
    private Message message;

    private String attachmentUrl;

    private Date createdOn;

    public MessageAttachment(Message message, String attachmentUrl) {
        this.message = message;
        this.attachmentUrl = attachmentUrl;
        this.createdOn = new Date();
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
