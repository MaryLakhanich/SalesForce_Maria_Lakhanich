package enums;

public enum Rating {
    HOT("Hot"),
    WARM("Warm"),
    COLD("Cold");

    public String getRating() {
        return rating;
    }

    private String rating;

    Rating(String rating) {
        this.rating = rating;
    }
    public String getChosenRating() {
        return this.rating;
    }
    public static Rating fromString(String value) {
        for (Rating contactRating : Rating.values()) {
            if (contactRating.getChosenRating().equals(value)) {
                return contactRating;
            }
        }
        return null;
    }
}
