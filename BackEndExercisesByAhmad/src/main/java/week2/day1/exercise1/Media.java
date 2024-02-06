package week2.day1.exercise1;

import java.time.LocalDate;

public interface Media<T> {
    boolean isForAdults();
    int getId();
    String getTitle();
    String getOriginalLanguage();
    String getOriginalTitle();
    String getDescription();
    String getMediaType();
    LocalDate getReleaseDate();
    double getRating();
}