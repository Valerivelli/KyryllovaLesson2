package com.kyryllova.homeworks.hw9;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import java.util.Date;

@Value
@Getter
@ToString
@EqualsAndHashCode
public class Book {
    Author author;
    String title;
    Date issueDate;
    Genre genre;
    Long isbn;

    public Book(Author author, String title, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.title = title;
        this.issueDate = new Date(issueDate.getTime());
        this.genre = genre;
        this.isbn = isbn;
    }

    public Date getIssueDate() {
        return new Date(issueDate.getTime());
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
