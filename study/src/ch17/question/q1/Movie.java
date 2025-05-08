package ch17.question.q1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Movie {
    private String title;
    private String genre;
    private int year;
    private double rating;
}
