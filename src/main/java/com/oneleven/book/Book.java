package com.oneleven.book;

import com.oneleven.library.Library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String title;

    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

    public Book(long id, String title, Library library) {
        this.id = id;
        this.title = title;
        this.library = library;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}