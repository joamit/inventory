package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.BaseDocument;
import io.joamit.inventory.domain.part.Part;
import io.joamit.inventory.domain.user.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds information about the project
 */
public class Project extends BaseDocument {

    /**
     * Project name
     */
    private String name;

    /**
     * User who created the project
     */
    @DBRef
    private User user;

    /**
     * Parts that this project needs or has reference to
     */
    @DBRef
    private List<Part> parts;

    /**
     * Project description
     */
    private String description;

    /**
     * Project attachments
     */
    @DBRef
    private List<ProjectAttachment> projectAttachments;

    /**
     * Initialize a project with given details
     *
     * @param name        of the project
     * @param user        creating the project
     * @param description of the project
     */
    public Project(String name, User user, String description) {
        this.name = name;
        this.user = user;
        this.description = description;
        this.parts = new ArrayList<>();
        this.projectAttachments = new ArrayList<>();
    }

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
