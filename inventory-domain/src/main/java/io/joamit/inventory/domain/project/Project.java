package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.part.Part;
import io.joamit.inventory.domain.user.User;

import java.util.List;

public class Project extends BaseDocument {

    private String name;

    private User user;

    private List<Part> parts;

    private String description;

    private List<ProjectAttachment> projectAttachments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProjectAttachment> getProjectAttachments() {
        return projectAttachments;
    }

    public void setProjectAttachments(List<ProjectAttachment> projectAttachments) {
        this.projectAttachments = projectAttachments;
    }
}
