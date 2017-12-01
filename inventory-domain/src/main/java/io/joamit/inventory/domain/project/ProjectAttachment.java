package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Holds a project attachment information, can be extended to hold attachment storage details
 */
public class ProjectAttachment extends BaseDocument {

    /**
     * Reference to the project that has this attachment
     */
    @DBRef
    private Project project;

    /**
     * Name of the attachment
     */
    private String name;

    /**
     * Details on the project attachment
     */
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
