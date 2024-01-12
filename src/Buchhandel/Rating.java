package Buchhandel;

import java.util.Objects;

public class Rating {
    private int stars;
    private String comment;

    public Rating(int stars, String comment) {
        this.stars = stars;
        this.comment = comment;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "stars=" + stars +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return stars == rating.stars && Objects.equals(comment, rating.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stars, comment);
    }
}
