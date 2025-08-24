package pl.coderslab.week2.enums;

public enum Genre {
    COMEDY("Funny movies"),
    HORROR("Scary movies"),
    CARTOON("Animated movies");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String displayDescription(){
        return description;
    }
}
