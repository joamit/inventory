package io.joamit.inventory.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Base Entity for all the domain objects
 */
@Document
public abstract class BaseDocument {

    @Id
    private String id;

    /**
     * Returns the id of the Object
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getClass()
                .getCanonicalName() + " {" +
                "id=" + id +
                '}';
    }
}
