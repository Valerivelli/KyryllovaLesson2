package com.kyryllova.homeworks.hw7;

import java.util.Date;
import java.util.Objects;

public final class Book {
    private final Author author;
    private final String title;
    private final Date issueDate;
    private final Genre genre;
    private final Long isbn;

    public Book(Author author, String title, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.title = title;
        this.issueDate = issueDate;
        this.genre = genre;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return new Author(author.getFirstName(), author.getLastName(), author.getDateOfBirth());
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public Long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) &&
                title.equals(book.title) &&
                issueDate.equals(book.issueDate) &&
                genre == book.genre &&
                isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, issueDate, genre, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", issueDate=" + issueDate +
                ", genre=" + genre.getValue() +
                ", isbn=" + isbn +
                '}';

    }

    public enum Genre {
        FANTASY("Fantasy"),
        ADVENTURE("Adventure"),
        SCIENCE_FICTION("Science Fiction"),
        MOTIVATIONAL("Motivational"),
        HEALTH("Health"),
        HISTORY("History"),
        TRAVEL("Travel");

        private final String value;

        Genre(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString() {
            return value;
        }
    }

}
