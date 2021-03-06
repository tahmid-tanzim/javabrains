package com.oneleven.topic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String description;

    public Topic() {
    }

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Topic(Long id) {
        this.id = id;
        this.name = "Miscellaneous";
        this.description = "mĭs'ə-lā'nē-əs. Filters. The definition of miscellaneous is people or things that are varied or mixed and cannot easily be categorized or grouped. An example of miscellaneous is a gathering of a bunch of people who have little in common and who can't be easily grouped into different groups.";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long topicId) {
        this.id = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
