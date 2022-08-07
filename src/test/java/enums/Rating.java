package enums;

public enum Rating {
    HOT("Hot"),
    WARM("Warm"),
    COLD("Cold");

    private String chosenRating;

    Rating(String chosenRating) {
        this.chosenRating = chosenRating;
    }


    public String getChosenRating() {
        return chosenRating;
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
