package io.joamit.inventory.domain.project;

import io.joamit.inventory.domain.BaseDocument;

public class ProjectAttachment extends BaseDocument {

    private Project project;

    private String name;

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
